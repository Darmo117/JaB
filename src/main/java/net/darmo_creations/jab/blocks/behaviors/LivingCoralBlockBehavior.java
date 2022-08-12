package net.darmo_creations.jab.blocks.behaviors;

import net.darmo_creations.jab.blocks.LivingCoralBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import java.util.Random;

/**
 * Behavior of coral block.
 */
public class LivingCoralBlockBehavior extends BlockBehavior {
  public LivingCoralBlockBehavior(final Block block) {
    super(block);
    if (!(block instanceof LivingCoralBlock)) {
      throw new IllegalArgumentException("block does not implement LivingCoralBlock interface");
    }
  }

  protected LivingCoralBlock getBlock() {
    return (LivingCoralBlock) this.block;
  }

  @Override
  public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    if (this.isNotInWater(world, pos)) {
      world.setBlockState(pos, this.getBlock().getDeadBlockState(state));
    }
  }

  @Override
  public BlockState getStateForNeighborUpdate(BlockState superState, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
    if (this.isNotInWater(world, pos)) {
      world.createAndScheduleBlockTick(pos, this.block, 60 + world.getRandom().nextInt(40));
    }
    return super.getStateForNeighborUpdate(superState, direction, neighborState, world, pos, neighborPos);
  }

  @Override
  public BlockState getPlacementState(BlockState superState, ItemPlacementContext ctx) {
    if (this.isNotInWater(ctx.getWorld(), ctx.getBlockPos())) {
      ctx.getWorld().createAndScheduleBlockTick(ctx.getBlockPos(), this.block, 60 + ctx.getWorld().getRandom().nextInt(40));
    }
    return superState;
  }

  protected boolean isNotInWater(BlockView world, BlockPos pos) {
    for (Direction direction : Direction.values()) {
      FluidState fluidState = world.getFluidState(pos.offset(direction));
      if (fluidState.isIn(FluidTags.WATER)) {
        return false;
      }
    }
    return true;
  }
}
