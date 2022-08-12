package net.darmo_creations.jab.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;

/**
 * Marks a block as being oxidizable.
 */
public interface OxidizableBlock extends Oxidizable {
  /**
   * Returns the block state that corresponds to this block’s next oxidation level.
   * The resulting block state should have the same property values as the argument.
   *
   * @param blockState This block’s state.
   * @return The next oxidation level’s block state.
   */
  BlockState getNextOxidationBlockState(final BlockState blockState);
}
