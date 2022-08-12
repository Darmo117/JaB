package net.darmo_creations.jab.blocks.behaviors;

import net.minecraft.block.*;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Random;

/**
 * Generaric behavior of falling blocks ({@link Blocks#SAND}, {@link Blocks#GRAVEL}, etc.).
 */
public class FallingBlockBehavior extends BlockBehavior implements LandingBlock {
  public FallingBlockBehavior(final Block block) {
    super(block);
    if (!(block instanceof LandingBlock)) {
      throw new IllegalArgumentException("block does not implement LandingBlock interface");
    }
  }

  @Override
  public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
    world.createAndScheduleBlockTick(pos, this.block, this.getFallDelay());
  }

  @Override
  public BlockState getStateForNeighborUpdate(BlockState superState, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
    world.createAndScheduleBlockTick(pos, this.block, this.getFallDelay());
    return super.getStateForNeighborUpdate(superState, direction, neighborState, world, pos, neighborPos);
  }

  @Override
  public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    if (FallingBlock.canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
      FallingBlockEntity.spawnFromBlock(world, pos, state);
    }
  }

  @Override
  public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
    if (this.block instanceof Waterloggable && world.getFluidState(pos).getFluid() == Fluids.WATER) {
      world.setBlockState(pos, fallingBlockState.with(Properties.WATERLOGGED, true));
    }
  }

  protected int getFallDelay() {
    return 2;
  }

  @Override
  public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
    if (random.nextInt(16) == 0 && FallingBlock.canFallThrough(world.getBlockState(pos.down()))) {
      double d = (double) pos.getX() + random.nextDouble();
      double e = (double) pos.getY() - 0.05;
      double f = (double) pos.getZ() + random.nextDouble();
      world.addParticle(new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state), d, e, f, 0.0, 0.0, 0.0);
    }
  }
}
