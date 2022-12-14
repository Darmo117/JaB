package net.darmo_creations.jab.blocks.behaviors;

import net.darmo_creations.jab.blocks.ConcretePowderBlock;
import net.darmo_creations.jab.mixins.ConcretePowderBlockMixin;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

/**
 * Behavior of {@link Blocks#WHITE_CONCRETE_POWDER} and other colors.
 */
public class ConcretePowderBlockBehavior extends FallingBlockBehavior {
  public ConcretePowderBlockBehavior(final Block block) {
    super(block);
    ensureBlockType(ConcretePowderBlock.class, block);
  }

  @Override
  public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
    super.onLanding(world, pos, fallingBlockState, currentStateInPos, fallingBlockEntity);
    if (ConcretePowderBlockMixin.invokeShouldHarden(world, pos, currentStateInPos)) {
      // Cannot use fallingBlockState as it may have been modified by super method
      world.setBlockState(pos, this.<ConcretePowderBlock>getBlock().getHardenedBlockState(world.getBlockState(pos)));
    }
  }

  @Override
  public BlockState getPlacementState(BlockState superState, ItemPlacementContext ctx) {
    BlockPos blockPos = ctx.getBlockPos();
    World blockView = ctx.getWorld();
    if (ConcretePowderBlockMixin.invokeShouldHarden(blockView, blockPos, blockView.getBlockState(blockPos))) {
      return this.<ConcretePowderBlock>getBlock().getHardenedBlockState(superState);
    }
    return super.getPlacementState(superState, ctx);
  }

  @Override
  public BlockState getStateForNeighborUpdate(BlockState superState, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
    if (ConcretePowderBlockMixin.invokeHardensOnAnySide(world, pos)) {
      return this.<ConcretePowderBlock>getBlock().getHardenedBlockState(superState);
    }
    return super.getStateForNeighborUpdate(superState, direction, neighborState, world, pos, neighborPos);
  }
}
