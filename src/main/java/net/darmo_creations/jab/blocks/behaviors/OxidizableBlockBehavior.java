package net.darmo_creations.jab.blocks.behaviors;

import net.darmo_creations.jab.blocks.OxidizableBlock;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoneycombItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

import java.util.Optional;
import java.util.Random;

/**
 * Behavior of copper-like blocks ({@link Blocks#COPPER_BLOCK}, {@link Blocks#CUT_COPPER}, etc.).
 */
public class OxidizableBlockBehavior extends BlockBehavior implements Oxidizable {
  public OxidizableBlockBehavior(Block block) {
    super(block);
    ensureBlockType(OxidizableBlock.class, block);
  }

  @Override
  public Optional<ActionResult> onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    ItemStack itemStack = player.getStackInHand(hand);
    // Wax block
    if (itemStack.getItem() instanceof HoneycombItem) {
      BlockState waxedState = this.<OxidizableBlock>getBlock().getWaxedBlockState(state);
      if (player instanceof ServerPlayerEntity p) {
        Criteria.ITEM_USED_ON_BLOCK.trigger(p, pos, itemStack);
      }
      if (!player.isCreative()) {
        itemStack.decrement(1);
      }
      world.setBlockState(pos, waxedState, Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
      world.syncWorldEvent(player, WorldEvents.BLOCK_WAXED, pos, 0);
      return Optional.of(ActionResult.success(world.isClient()));
      // Decrease oxidation level
    } else if (itemStack.getItem() instanceof AxeItem && this.getBlock().getMaterial().getPreviousOxidationMaterial() != null) {
      world.playSound(player, pos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1, 1);
      world.syncWorldEvent(player, WorldEvents.BLOCK_SCRAPED, pos, 0);
      if (player instanceof ServerPlayerEntity p) {
        Criteria.ITEM_USED_ON_BLOCK.trigger(p, pos, itemStack);
      }
      world.setBlockState(pos, this.<OxidizableBlock>getBlock().getPreviousOxidationBlockState(state), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
      if (!player.isCreative()) {
        itemStack.damage(1, player, p -> p.sendToolBreakStatus(hand));
      }
      return Optional.of(ActionResult.success(world.isClient()));
    }
    return Optional.empty();
  }

  @Override
  public boolean randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    //noinspection deprecation
    Blocks.COPPER_BLOCK.randomTick(state, world, pos, random);
    return true;
  }

  @Override
  public Optional<Boolean> hasRandomTicks(BlockState state) {
    return Optional.of(this.getDegradationLevel() != OxidationLevel.OXIDIZED);
  }

  @Override
  public Optional<BlockState> getDegradationResult(BlockState state) {
    // Value should never be null as no random ticks are fired if fully oxidized
    //noinspection ConstantConditions
    return Optional.of(this.<OxidizableBlock>getBlock().getNextOxidationBlockState(state));
  }

  @Override
  public OxidationLevel getDegradationLevel() {
    return this.<OxidizableBlock>getBlock().getDegradationLevel();
  }
}
