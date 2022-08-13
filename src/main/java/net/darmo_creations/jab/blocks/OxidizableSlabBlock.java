package net.darmo_creations.jab.blocks;

import net.darmo_creations.jab.blocks.behaviors.OxidizableBlockBehavior;
import net.minecraft.block.BlockState;

import java.util.Optional;

/**
 * A slab that can oxidize when exposed to air.
 */
public class OxidizableSlabBlock extends DecoratedSlabBlock implements OxidizableBlock {
  public OxidizableSlabBlock(final BlockMaterial material) {
    super(material);
    DecoratedBlock.checkBehaviorType(OxidizableBlockBehavior.class, material);
  }

  protected OxidizableBlockBehavior getBehavior() {
    return (OxidizableBlockBehavior) this.behavior;
  }

  @Override
  public BlockState getNextOxidationBlockState(BlockState blockState) {
    return ModBlocks.SLABS.get(this.getMaterial().getNextOxidationMaterial()).getStateWithProperties(blockState);
  }

  @Override
  public BlockState getPreviousOxidationBlockState(BlockState blockState) {
    return ModBlocks.SLABS.get(this.getMaterial().getPreviousOxidationMaterial()).getStateWithProperties(blockState);
  }

  @Override
  public Optional<BlockState> getDegradationResult(BlockState state) {
    return this.getBehavior().getDegradationResult(state);
  }

  @Override
  public OxidationLevel getDegradationLevel() {
    return this.getMaterial().getOxidationLevel();
  }

  @Override
  public BlockState getWaxedBlockState(BlockState blockState) {
    return ModBlocks.SLABS.get(this.getMaterial().getWaxedMaterial()).getStateWithProperties(blockState);
  }
}
