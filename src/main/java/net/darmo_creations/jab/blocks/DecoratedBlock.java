package net.darmo_creations.jab.blocks;

import net.darmo_creations.jab.blocks.behaviors.BlockBehavior;

/**
 * Interface marking a block as accepting a {@link BlockMaterial}.
 */
public interface DecoratedBlock {
  /**
   * Returns this block’s material.
   */
  BlockMaterial getMaterial();

  /**
   * Checks whether the given {@link BlockMaterial} matches the given {@link BlockBehavior} class.
   *
   * @param expected Expected {@link BlockBehavior} class.
   * @param material Actual {@link BlockMaterial}.
   */
  static void checkBehaviorType(final Class<? extends BlockBehavior> expected, final BlockMaterial material) {
    Class<? extends BlockBehavior> actual = material.getBlockBehaviorClass();
    if (!expected.isAssignableFrom(actual)) {
      throw new IllegalArgumentException("expected behavior of type %s, got %s"
          .formatted(expected, actual.getSimpleName()));
    }
  }
}
