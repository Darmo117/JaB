package net.darmo_creations.jab.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.Direction;

/**
 * Marks a block as being see-through.
 */
public interface TransparentBlock extends DecoratedBlock {
  /**
   * Indicates whether the given side of this block should be invisible given a neighbor.
   *
   * @param state     This block’s state.
   * @param stateFrom Neighbor block’s state.
   * @param direction The face.
   * @return True if the side should be invisible, false otherwise.
   */
  boolean sideShouldBeInvisible(final BlockState state, final BlockState stateFrom, final Direction direction);
}
