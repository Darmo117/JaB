package net.darmo_creations.jab.mixins;

import net.minecraft.block.BlockState;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

/**
 * Widens access of some private static methods in {@link ConcretePowderBlock} class.
 */
@Mixin(ConcretePowderBlock.class)
public interface ConcretePowderBlockMixin {
  @Invoker("shouldHarden")
  static boolean invokeShouldHarden(BlockView world, BlockPos pos, BlockState state) {
    throw new AssertionError();
  }

  @Invoker("hardensOnAnySide")
  static boolean invokeHardensOnAnySide(BlockView world, BlockPos pos) {
    throw new AssertionError();
  }
}
