package net.darmo_creations.jab.blocks;

import net.minecraft.block.BlockState;

/**
 * Marks a block as being made of concrete powder.
 */
public interface ConcretePowderBlock extends DecoratedBlock {
  /**
   * Returns the hardened concrete block state that corresponds to this block.
   * The resulting block state should have the same property values as the argument.
   *
   * @param blockState This block’s state.
   * @return The hardened block state.
   */
  BlockState getHardenedBlockState(final BlockState blockState);
}
