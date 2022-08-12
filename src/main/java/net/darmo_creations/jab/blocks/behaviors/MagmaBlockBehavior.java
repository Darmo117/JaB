package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Random;

/**
 * Behavior of {@link Blocks#MAGMA_BLOCK}.
 */
public class MagmaBlockBehavior extends BlockBehavior {
  private static final int SCHEDULED_TICK_DELAY = 20;

  public MagmaBlockBehavior(final Block block) {
    super(block);
  }

  @Override
  public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
    world.createAndScheduleBlockTick(pos, this.block, SCHEDULED_TICK_DELAY);
  }

  @Override
  public BlockState getStateForNeighborUpdate(BlockState superState, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
    if (direction == Direction.UP && neighborState.isOf(Blocks.WATER)) {
      world.createAndScheduleBlockTick(pos, this.block, SCHEDULED_TICK_DELAY);
    }
    return super.getStateForNeighborUpdate(superState, direction, neighborState, world, pos, neighborPos);
  }

  @Override
  public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
    Blocks.MAGMA_BLOCK.onSteppedOn(world, pos, state, entity);
  }

  @Override
  public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    //noinspection deprecation
    Blocks.MAGMA_BLOCK.scheduledTick(state, world, pos, random);
  }

  @Override
  public boolean randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    //noinspection deprecation
    Blocks.MAGMA_BLOCK.randomTick(state, world, pos, random);
    return true;
  }
}
