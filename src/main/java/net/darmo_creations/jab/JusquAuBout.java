package net.darmo_creations.jab;

import net.darmo_creations.jab.blocks.BlockMaterial;
import net.darmo_creations.jab.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

// TODO block tags

/**
 * Mod’s main class.
 */
public class JusquAuBout implements ModInitializer {
  public static final String MOD_ID = "jab";

  // Creative mode’s item groups
  public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
      new Identifier(MOD_ID, "item_group"),
      () -> new ItemStack(ModBlocks.SLABS.get(BlockMaterial.DIAMOND))
  );

  @Override
  public void onInitialize() {
    ModBlocks.registerBlockRenderLayers();
  }
}
