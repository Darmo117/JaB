package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
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

import java.util.Optional;
import java.util.Random;

/**
 * Abstract represents of the behavior of a vanilla block.
 */
public class BlockBehavior {
  protected final Block block;

  public BlockBehavior(final Block block) {
    this.block = block;
  }

  public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
  }

  public BlockState getPlacementState(BlockState superState, ItemPlacementContext ctx) {
    return superState;
  }

  public BlockState getStateForNeighborUpdate(BlockState superState, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
    return superState;
  }

  public Optional<ActionResult> onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    return Optional.empty();
  }

  public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
  }

  public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
  }

  public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
  }

  public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
  }

  public Optional<Boolean> hasRandomTicks(BlockState state) {
    return Optional.empty();
  }

  public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
  }

  public boolean randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    return false;
  }

  public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
  }

  public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
  }

  public Optional<Boolean> emitsRedstonePower(BlockState state) {
    return Optional.empty();
  }

  public Optional<Integer> getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
    return Optional.empty();
  }

  public Optional<Float> getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
    return Optional.empty();
  }

  public Optional<Boolean> isTranslucent(BlockState state, BlockView world, BlockPos pos) {
    return Optional.empty();
  }

  public Optional<Boolean> isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
    return Optional.empty();
  }

  public Optional<PistonBehavior> getPistonBehavior(BlockState state) {
    return Optional.empty();
  }
}