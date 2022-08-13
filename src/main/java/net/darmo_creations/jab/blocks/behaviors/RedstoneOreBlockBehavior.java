package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.Random;

/**
 * Behavior of {@link Blocks#REDSTONE_ORE} and {@link Blocks#DEEPSLATE_REDSTONE_ORE}.
 */
public class RedstoneOreBlockBehavior extends BlockBehavior {
  public RedstoneOreBlockBehavior(final Block block) {
    super(block);
  }

  @Override
  public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
    //noinspection deprecation
    Blocks.REDSTONE_ORE.onBlockBreakStart(state, world, pos, player);
  }

  @Override
  public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
    Blocks.REDSTONE_ORE.onSteppedOn(world, pos, state, entity);
  }

  @Override
  public Optional<ActionResult> onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    //noinspection deprecation
    return Optional.of(Blocks.REDSTONE_ORE.onUse(state, world, pos, player, hand, hit));
  }

  @Override
  public Optional<Boolean> hasRandomTicks(BlockState state) {
    return Optional.of(Blocks.REDSTONE_ORE.hasRandomTicks(state));
  }

  @Override
  public boolean randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    //noinspection deprecation
    Blocks.REDSTONE_ORE.randomTick(state, world, pos, random);
    return true;
  }

  @Override
  public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
    Blocks.REDSTONE_ORE.randomDisplayTick(state, world, pos, random);
  }
}
