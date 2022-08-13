package net.darmo_creations.jab.blocks;

import net.darmo_creations.jab.blocks.behaviors.FallingBlockBehavior;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Predicate;

/**
 * A slab that is sensitive to gravity.
 */
public class FallingSlabBlock extends DecoratedSlabBlock implements GravityBlock {
  public FallingSlabBlock(final BlockMaterial material) {
    super(material);
    DecoratedBlock.checkBehaviorType(FallingBlockBehavior.class, material);
  }

  protected FallingBlockBehavior getBehavior() {
    return (FallingBlockBehavior) this.behavior;
  }

  @Override
  public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
    this.getBehavior().onLanding(world, pos, fallingBlockState, currentStateInPos, fallingBlockEntity);
  }

  @Override
  public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
    this.getBehavior().onDestroyedOnLanding(world, pos, fallingBlockEntity);
  }

  @Override
  public DamageSource getDamageSource() {
    return this.getBehavior().getDamageSource();
  }

  @Override
  public Predicate<Entity> getEntityPredicate() {
    return this.getBehavior().getEntityPredicate();
  }
}
