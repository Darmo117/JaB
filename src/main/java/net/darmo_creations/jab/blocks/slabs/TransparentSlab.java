package net.darmo_creations.jab.blocks.slabs;

import net.darmo_creations.jab.blocks.BlockMaterial;
import net.darmo_creations.jab.blocks.DecoratedBlock;
import net.darmo_creations.jab.blocks.TransparentBlock;
import net.darmo_creations.jab.blocks.behaviors.TransparentBlockBehavior;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.Direction;

/**
 * A see-through slab.
 */
public class TransparentSlab extends DecoratedSlabBlock implements TransparentBlock {
  public TransparentSlab(final BlockMaterial material) {
    super(material);
    DecoratedBlock.checkBehaviorType(TransparentBlockBehavior.class, material);
  }

  @Override
  public boolean sideShouldBeInvisible(BlockState state, BlockState stateFrom, Direction direction) {
    return stateFrom.get(TYPE) == SlabType.DOUBLE || state.get(TYPE) == stateFrom.get(TYPE);
  }
}
