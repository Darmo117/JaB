package net.darmo_creations.jab.blocks;

import net.minecraft.block.BlockState;

/**
 * A slab of living coral.
 */
public class LivingCoralSlabBlock extends DecoratedSlabBlock implements LivingCoralBlock {
  public LivingCoralSlabBlock(BlockMaterial material) {
    super(material);
  }

  @Override
  public BlockState getDeadBlockState(final BlockState blockState) {
    return ModBlocks.SLABS.get(this.getMaterial().getDeadCoralMaterial()).getStateWithProperties(blockState);
  }
}
