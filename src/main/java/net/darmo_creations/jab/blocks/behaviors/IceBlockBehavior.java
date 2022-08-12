package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;

/**
 * Behavior of {@link Blocks#ICE}.
 */
public class IceBlockBehavior extends BlockBehavior {
  public IceBlockBehavior(Block block) {
    super(block);
  }

  @Override
  public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
    Blocks.ICE.afterBreak(world, player, pos, state, blockEntity, stack);
  }

  @Override
  public boolean randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    //noinspection deprecation
    Blocks.ICE.randomTick(state, world, pos, random);
    return true;
  }

  @Override
  public Optional<PistonBehavior> getPistonBehavior(BlockState state) {
    //noinspection deprecation
    return Optional.of(Blocks.ICE.getPistonBehavior(state));
  }
}
