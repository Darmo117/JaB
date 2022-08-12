package net.darmo_creations.jab.blocks.behaviors;

import net.darmo_creations.jab.blocks.OxidizableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;
import java.util.Random;

/**
 * Behavior of copper-like blocks ({@link Blocks#COPPER_BLOCK}, {@link Blocks#CUT_COPPER}, etc.).
 */
public class OxidizableBlockBehavior extends BlockBehavior implements Oxidizable {
  public OxidizableBlockBehavior(Block block) {
    super(block);
    if (!(block instanceof OxidizableBlock)) {
      throw new IllegalArgumentException("block does not implement OxidizableBlock interface");
    }
  }

  protected OxidizableBlock getBlock() {
    return (OxidizableBlock) this.block;
  }

  @Override
  public boolean randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    //noinspection deprecation
    Blocks.COPPER_BLOCK.randomTick(state, world, pos, random);
    return true;
  }

  @Override
  public Optional<Boolean> hasRandomTicks(BlockState state) {
    return Optional.of(this.getDegradationLevel() != OxidationLevel.OXIDIZED);
  }

  @Override
  public Optional<BlockState> getDegradationResult(BlockState state) {
    return Optional.of(this.getBlock().getNextOxidationBlockState(state));
  }

  @Override
  public OxidationLevel getDegradationLevel() {
    return this.getBlock().getDegradationLevel();
  }
}
