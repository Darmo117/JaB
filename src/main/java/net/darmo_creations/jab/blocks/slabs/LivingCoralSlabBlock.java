package net.darmo_creations.jab.blocks.slabs;

import net.darmo_creations.jab.blocks.BlockMaterial;
import net.darmo_creations.jab.blocks.LivingCoralBlock;
import net.darmo_creations.jab.blocks.ModBlocks;
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
