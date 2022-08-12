package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

import java.util.Optional;

/**
 * Behavior of {@link Blocks#REDSTONE_BLOCK}.
 */
public class RedstoneBlockBehavior extends BlockBehavior {
  public RedstoneBlockBehavior(Block block) {
    super(block);
  }

  @Override
  public Optional<Boolean> emitsRedstonePower(BlockState state) {
    //noinspection deprecation
    return Optional.of(Blocks.REDSTONE_BLOCK.emitsRedstonePower(state));
  }

  @Override
  public Optional<Integer> getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
    //noinspection deprecation
    return Optional.of(Blocks.REDSTONE_BLOCK.getWeakRedstonePower(state, world, pos, direction));
  }
}
