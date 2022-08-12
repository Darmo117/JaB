package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

/**
 * Behavior of {@link Blocks#AMETHYST_BLOCK}.
 */
public class AmethystBlockBehavior extends BlockBehavior {
  public AmethystBlockBehavior(Block block) {
    super(block);
  }

  @Override
  public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
    //noinspection deprecation
    Blocks.AMETHYST_BLOCK.onProjectileHit(world, state, hit, projectile);
  }
}
