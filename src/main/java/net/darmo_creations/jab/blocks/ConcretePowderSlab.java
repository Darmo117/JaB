package net.darmo_creations.jab.blocks;

import net.darmo_creations.jab.blocks.behaviors.ConcretePowderBlockBehavior;
import net.minecraft.block.BlockState;

/**
 * A slab made of concrete powder.
 */
public class ConcretePowderSlab extends FallingSlabBlock implements ConcretePowderBlock {
  public ConcretePowderSlab(final BlockMaterial material) {
    super(material);
    DecoratedBlock.checkBehaviorType(ConcretePowderBlockBehavior.class, material);
  }

  @Override
  public BlockState getHardenedBlockState(final BlockState blockState) {
    return ModBlocks.SLABS.get(this.getMaterial().getHardenedConcreteMaterial()).getStateWithProperties(blockState);
  }
}
