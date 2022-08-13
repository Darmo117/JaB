package net.darmo_creations.jab.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;

import javax.annotation.Nullable;

/**
 * Marks a block as being oxidizable.
 */
public interface OxidizableBlock extends Oxidizable, DecoratedBlock {
  /**
   * Returns the block state that corresponds to this block’s next oxidation level.
   * The resulting block state should have the same property values as the argument.
   *
   * @param blockState This block’s state.
   * @return The next oxidation level’s block state.
   */
  @Nullable
  BlockState getNextOxidationBlockState(final BlockState blockState);

  /**
   * Returns the block state that corresponds to this block’s previous oxidation level.
   * The resulting block state should have the same property values as the argument.
   *
   * @param blockState This block’s state.
   * @return The previous oxidation level’s block state.
   */
  @Nullable
  BlockState getPreviousOxidationBlockState(final BlockState blockState);

  /**
   * Returns the block state that corresponds to this block’s waxed version.
   * The resulting block state should have the same property values as the argument.
   *
   * @param blockState This block’s state.
   * @return The block state of the waxed version.
   */
  BlockState getWaxedBlockState(final BlockState blockState);
}
