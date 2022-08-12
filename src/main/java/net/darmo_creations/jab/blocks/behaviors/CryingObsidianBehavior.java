package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Behavior of {@link Blocks#CRYING_OBSIDIAN}.
 */
public class CryingObsidianBehavior extends BlockBehavior {
  public CryingObsidianBehavior(Block block) {
    super(block);
  }

  @Override
  public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
    Blocks.CRYING_OBSIDIAN.randomDisplayTick(state, world, pos, random);
  }
}
