package net.darmo_creations.jab.blocks.behaviors;

import net.darmo_creations.jab.blocks.TransparentBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.Direction;

import java.util.Optional;

/**
 * Behavior of transparent blocks ({@link Blocks#GLASS}, {@link Blocks#SLIME_BLOCK}, etc.).
 */
public class TransparentBlockBehavior extends BlockBehavior {
  public TransparentBlockBehavior(Block block) {
    super(block);
    ensureBlockType(TransparentBlock.class, block);
  }

  @Override
  public Optional<Boolean> isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
    return Optional.of(stateFrom.isOf(this.block)
        && this.<TransparentBlock>getBlock().sideShouldBeInvisible(state, stateFrom, direction));
  }
}
