package net.darmo_creations.jab.blocks.slabs;

import net.darmo_creations.jab.blocks.BlockMaterial;
import net.darmo_creations.jab.blocks.DecoratedBlock;
import net.darmo_creations.jab.blocks.behaviors.RedstoneOreBlockBehavior;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class RedstoneOreSlabBlock extends DecoratedSlabBlock {
  public static final BooleanProperty LIT = RedstoneOreBlock.LIT;

  public RedstoneOreSlabBlock(final BlockMaterial material) {
    super(material);
    DecoratedBlock.checkBehaviorType(RedstoneOreBlockBehavior.class, material);
    this.setDefaultState(this.getDefaultState().with(LIT, false));
  }

  @Override
  protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
    super.appendProperties(builder.add(LIT));
  }
}
