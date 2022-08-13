package net.darmo_creations.jab.blocks;

import net.minecraft.block.BlockState;

/**
 * Marks a block as being covered in a wax layer.
 */
public interface WaxedBlock extends DecoratedBlock {
  /**
   * Returns the block state that corresponds to this block’s urwaxed version.
   * The resulting block state should have the same property values as the argument.
   *
   * @param blockState This block’s state.
   * @return The block state of the urwaxed version.
   */
  BlockState getUnwaxedBlockState(final BlockState blockState);
}
