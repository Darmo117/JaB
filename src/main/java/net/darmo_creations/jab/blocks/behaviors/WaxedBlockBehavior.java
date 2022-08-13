package net.darmo_creations.jab.blocks.behaviors;

import net.darmo_creations.jab.blocks.WaxedBlock;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

import java.util.Optional;

/**
 * Behavior of waxed copper-like blocks ({@link Blocks#WAXED_COPPER_BLOCK}, {@link Blocks#WAXED_CUT_COPPER}, etc.).
 */
public class WaxedBlockBehavior extends BlockBehavior {
  public WaxedBlockBehavior(Block block) {
    super(block);
    if (!(block instanceof WaxedBlock)) {
      throw new IllegalArgumentException("block does not implement WaxedBlock interface");
    }
  }

  protected WaxedBlock getBlock() {
    return (WaxedBlock) this.block;
  }

  @Override
  public Optional<ActionResult> onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    ItemStack itemStack = player.getStackInHand(hand);
    if (!(itemStack.getItem() instanceof AxeItem)) {
      return Optional.empty();
    }
    // Unwax block
    world.playSound(player, pos, SoundEvents.ITEM_AXE_WAX_OFF, SoundCategory.BLOCKS, 1, 1);
    world.syncWorldEvent(player, WorldEvents.WAX_REMOVED, pos, 0);
    if (player instanceof ServerPlayerEntity p) {
      Criteria.ITEM_USED_ON_BLOCK.trigger(p, pos, itemStack);
    }
    world.setBlockState(pos, this.getBlock().getUnwaxedBlockState(state), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
    if (!player.isCreative()) {
      itemStack.damage(1, player, p -> p.sendToolBreakStatus(hand));
    }
    return Optional.of(ActionResult.success(world.isClient()));
  }
}
