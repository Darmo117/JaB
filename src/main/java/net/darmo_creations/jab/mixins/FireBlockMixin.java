package net.darmo_creations.jab.mixins;

import net.minecraft.block.BlockState;
import net.minecraft.block.FireBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

/**
 * Widens access of some private methods in {@link FireBlock} class.
 */
@Mixin(FireBlock.class)
public interface FireBlockMixin {
  @Invoker("getSpreadChance")
  int invokeGetSpreadChance(BlockState state);

  @Invoker("getBurnChance")
  int invokeGetBurnChance(BlockState state);
}
