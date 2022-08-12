package net.darmo_creations.jab.blocks;

import net.darmo_creations.jab.blocks.behaviors.BlockBehavior;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

/**
 * A slab that inherits the behavior and properties of the given material.
 */
public class DecoratedSlabBlock extends SlabBlock implements DecoratedBlock {
  private final BlockMaterial material;
  protected final BlockBehavior behavior;

  public DecoratedSlabBlock(final BlockMaterial material) {
    super(AbstractBlock.Settings.copy(material.getBaseBlock()));
    this.material = material;
    this.behavior = material.createBehaviorForBlock(this);
  }

  @Override
  public BlockMaterial getMaterial() {
    return this.material;
  }

  @SuppressWarnings("deprecation")
  @Override
  public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
    this.behavior.onBlockAdded(state, world, pos, oldState, notify);
  }

  @Override
  public BlockState getPlacementState(ItemPlacementContext ctx) {
    return this.behavior.getPlacementState(super.getPlacementState(ctx), ctx);
  }

  @Override
  public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
    state = super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    return this.behavior.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
  }

  @Override
  public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
    this.behavior.onSteppedOn(world, pos, state, entity);
  }

  @SuppressWarnings("deprecation")
  @Override
  public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
    this.behavior.onProjectileHit(world, state, hit, projectile);
  }

  @Override
  public boolean hasRandomTicks(BlockState state) {
    return this.behavior.hasRandomTicks(state)
        .orElse(super.hasRandomTicks(state));
  }

  @SuppressWarnings("deprecation")
  @Override
  public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    this.behavior.scheduledTick(state, world, pos, random);
  }

  @SuppressWarnings("deprecation")
  @Override
  public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    if (!this.behavior.randomTick(state, world, pos, random)) {
      super.randomTick(state, world, pos, random);
    }
  }

  @Override
  public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
    this.behavior.randomDisplayTick(state, world, pos, random);
  }

  @SuppressWarnings("deprecation")
  @Override
  public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
    this.behavior.onStacksDropped(state, world, pos, stack);
  }

  @SuppressWarnings("deprecation")
  @Override
  public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
    this.behavior.onBlockBreakStart(state, world, pos, player);
  }

  @Override
  public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
    super.afterBreak(world, player, pos, state, blockEntity, stack);
    this.behavior.afterBreak(world, player, pos, state, blockEntity, stack);
  }

  @SuppressWarnings("deprecation")
  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    return this.behavior.onUse(state, world, pos, player, hand, hit)
        .orElse(super.onUse(state, world, pos, player, hand, hit));
  }

  @SuppressWarnings("deprecation")
  @Override
  public boolean emitsRedstonePower(BlockState state) {
    return this.behavior.emitsRedstonePower(state)
        .orElse(super.emitsRedstonePower(state));
  }

  @SuppressWarnings("deprecation")
  @Override
  public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
    return this.behavior.getWeakRedstonePower(state, world, pos, direction)
        .orElse(super.getWeakRedstonePower(state, world, pos, direction));
  }

  @SuppressWarnings("deprecation")
  @Override
  public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
    return this.behavior.getAmbientOcclusionLightLevel(state, world, pos)
        .orElse(super.getAmbientOcclusionLightLevel(state, world, pos));
  }

  @Override
  public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
    return this.behavior.isTranslucent(state, world, pos)
        .orElse(super.isTranslucent(state, world, pos));
  }

  @SuppressWarnings("deprecation")
  @Override
  public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
    return this.behavior.isSideInvisible(state, stateFrom, direction)
        .orElse(super.isSideInvisible(state, stateFrom, direction));
  }

  @SuppressWarnings("deprecation")
  @Override
  public PistonBehavior getPistonBehavior(BlockState state) {
    return this.behavior.getPistonBehavior(state)
        .orElse(super.getPistonBehavior(state));
  }
}
