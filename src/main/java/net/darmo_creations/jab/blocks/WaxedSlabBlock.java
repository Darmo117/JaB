package net.darmo_creations.jab.blocks;

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
