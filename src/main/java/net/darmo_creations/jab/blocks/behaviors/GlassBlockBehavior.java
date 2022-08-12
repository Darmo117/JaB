package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Optional;

/**
 * Behavior of {@link Blocks#GLASS}.
 */
public class GlassBlockBehavior extends TransparentBlockBehavior {
  public GlassBlockBehavior(Block block) {
    super(block);
  }

  @Override
  public Optional<Float> getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
    //noinspection deprecation
    return Optional.of(Blocks.GLASS.getAmbientOcclusionLightLevel(state, world, pos));
  }

  @Override
  public Optional<Boolean> isTranslucent(BlockState state, BlockView world, BlockPos pos) {
    return Optional.of(Blocks.GLASS.isTranslucent(state, world, pos));
  }
}
