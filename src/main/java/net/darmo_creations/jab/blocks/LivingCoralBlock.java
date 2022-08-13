package net.darmo_creations.jab.blocks;

import net.minecraft.block.BlockState;

/**
 * Marks a block as being living coral.
 */
public interface LivingCoralBlock extends DecoratedBlock {
  /**
   * Returns the dead coral block state that corresponds to this block.
   * The resulting block state should have the same property values as the argument.
   *
   * @param blockState This block’s state.
   * @return The dead block state.
   */
  BlockState getDeadBlockState(final BlockState blockState);
}
