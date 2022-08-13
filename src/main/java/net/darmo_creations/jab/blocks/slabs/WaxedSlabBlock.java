package net.darmo_creations.jab.blocks.slabs;

import net.darmo_creations.jab.blocks.BlockMaterial;
import net.darmo_creations.jab.blocks.DecoratedBlock;
import net.darmo_creations.jab.blocks.ModBlocks;
import net.darmo_creations.jab.blocks.WaxedBlock;
import net.darmo_creations.jab.blocks.behaviors.WaxedBlockBehavior;
import net.minecraft.block.BlockState;

/**
 * A slab that is covered in a wax layer.
 */
public class WaxedSlabBlock extends DecoratedSlabBlock implements WaxedBlock {
  public WaxedSlabBlock(final BlockMaterial material) {
    super(material);
    DecoratedBlock.checkBehaviorType(WaxedBlockBehavior.class, material);
  }

  @Override
  public BlockState getUnwaxedBlockState(BlockState blockState) {
    return ModBlocks.SLABS.get(this.getMaterial().getUnwaxedMaterial()).getStateWithProperties(blockState);
  }
}
