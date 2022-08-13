package net.darmo_creations.jab.blocks;

import net.darmo_creations.jab.blocks.behaviors.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.client.render.RenderLayer;

import javax.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * A material specifies the base block and behavior to apply to a {@link DecoratedBlock}.
 */
public enum BlockMaterial {
  // Woods
  ACACIA("acacia", Blocks.ACACIA_PLANKS, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  BIRCH("birch", Blocks.BIRCH_PLANKS, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  DARK_OAK("dark_oak", Blocks.DARK_OAK_PLANKS, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  JUNGLE("jungle", Blocks.JUNGLE_PLANKS, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  OAK("oak", Blocks.OAK_PLANKS, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  SPRUCE("spruce", Blocks.SPRUCE_PLANKS, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  CRIMSON_WOOD("crimson", Blocks.CRIMSON_PLANKS, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  WARPED_WOOD("warped", Blocks.WARPED_PLANKS, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),

  // Rocks
  ANCIENT_DEBRIS("ancient_debris", Blocks.ANCIENT_DEBRIS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  ANDESITE("andesite", Blocks.ANDESITE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BEDROCK("bedrock", Blocks.BEDROCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BLACKSTONE("blackstone", Blocks.BLACKSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BRICKS("brick", Blocks.BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CALCITE("calcite", Blocks.CALCITE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),

  WHITE_CONCRETE("white_concrete", Blocks.WHITE_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  ORANGE_CONCRETE("orange_concrete", Blocks.ORANGE_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  MAGENTA_CONCRETE("magenta_concrete", Blocks.MAGENTA_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIGHT_BLUE_CONCRETE("light_blue_concrete", Blocks.LIGHT_BLUE_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  YELLOW_CONCRETE("yellow_concrete", Blocks.YELLOW_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIME_CONCRETE("lime_concrete", Blocks.LIME_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PINK_CONCRETE("pink_concrete", Blocks.PINK_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GRAY_CONCRETE("gray_concrete", Blocks.GRAY_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIGHT_GRAY_CONCRETE("light_gray_concrete", Blocks.LIGHT_GRAY_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CYAN_CONCRETE("cyan_concrete", Blocks.CYAN_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PURPLE_CONCRETE("purple_concrete", Blocks.PURPLE_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BLUE_CONCRETE("blue_concrete", Blocks.BLUE_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BROWN_CONCRETE("brown_concrete", Blocks.BROWN_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GREEN_CONCRETE("green_concrete", Blocks.GREEN_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  RED_CONCRETE("red_concrete", Blocks.RED_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BLACK_CONCRETE("black_concrete", Blocks.BLACK_CONCRETE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),

  CHISELED_DEEPSLATE("chiseled_deepslate", Blocks.CHISELED_DEEPSLATE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CHISELED_NETHER_BRICKS("chiseled_nether_brick", Blocks.CHISELED_NETHER_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CHISELED_POLISHED_BLACKSTONE("chiseled_polished_blackstone", Blocks.CHISELED_POLISHED_BLACKSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CHISELED_QUARTZ_BLOCK("chiseled_quartz_block", Blocks.CHISELED_QUARTZ_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CHISELED_RED_SANDSTONE("chiseled_red_sandstone", Blocks.CHISELED_RED_SANDSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CHISELED_SANDSTONE("chiseled_sandstone", Blocks.CHISELED_SANDSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CHISELED_STONE_BRICKS("chiseled_stone_brick", Blocks.CHISELED_STONE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  COBBLED_DEEPSLATE("cobbled_deepslate", Blocks.COBBLED_DEEPSLATE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  COBBLESTONE("cobblestone", Blocks.COBBLESTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  TUBE_CORAL("tube_coral", Blocks.TUBE_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, LivingCoralBlockBehavior.class),
  BRAIN_CORAL("brain_coral", Blocks.BRAIN_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, LivingCoralBlockBehavior.class),
  BUBBLE_CORAL("bubble_coral", Blocks.BUBBLE_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, LivingCoralBlockBehavior.class),
  FIRE_CORAL("fire_coral", Blocks.FIRE_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, LivingCoralBlockBehavior.class),
  HORN_CORAL("horn_coral", Blocks.HORN_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, LivingCoralBlockBehavior.class),
  DEAD_TUBE_CORAL("dead_tube_coral", Blocks.DEAD_TUBE_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEAD_BRAIN_CORAL("dead_brain_coral", Blocks.DEAD_BRAIN_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEAD_BUBBLE_CORAL("dead_bubble_coral", Blocks.DEAD_BUBBLE_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEAD_FIRE_CORAL("dead_fire_coral", Blocks.DEAD_FIRE_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEAD_HORN_CORAL("dead_horn_coral", Blocks.DEAD_HORN_CORAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CRACKED_DEEPSLATE_BRICKS("cracked_deepslate_brick", Blocks.CRACKED_DEEPSLATE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CRACKED_DEEPSLATE_TILES("cracked_deepslate_tile", Blocks.CRACKED_DEEPSLATE_TILES, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CRACKED_NETHER_BRICKS("cracked_nether_brick", Blocks.CRACKED_NETHER_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CRACKED_POLISHED_BLACKSTONE_BRICKS("cracked_polished_blackstone_brick", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CRACKED_STONE_BRICKS("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CRYING_OBSIDIAN("crying_obsidian", Blocks.CRYING_OBSIDIAN, ButtonType.STONE, PressurePlateType.STONE, CryingObsidianBehavior.class),
  CUT_RED_SANDSTONE("cut_red_sandstone", Blocks.CUT_RED_SANDSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CUT_SANDSTONE("cut_sandstone", Blocks.CUT_SANDSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DARK_PRISMARINE("dark_prismarine", Blocks.DARK_PRISMARINE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE("deepslate", Blocks.DEEPSLATE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_BRICKS("deepslate_brick", Blocks.DEEPSLATE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_TILES("deepslate_tile", Blocks.DEEPSLATE_TILES, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DIORITE("diorite", Blocks.DIORITE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DRIPSTONE("dripstone", Blocks.DRIPSTONE_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  END_STONE("end_stone", Blocks.END_STONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  END_STONE_BRICKS("end_stone_brick", Blocks.END_STONE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GILDED_BLACKSTONE("gilded_blackstone", Blocks.GILDED_BLACKSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GLOWSTONE("glowstone", Blocks.GLOWSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GRANITE("granite", Blocks.GRANITE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  MAGMA("magma", Blocks.MAGMA_BLOCK, ButtonType.STONE, PressurePlateType.STONE, MagmaBlockBehavior.class),
  MOSSY_COBBLESTONE("mossy_cobblestone", Blocks.MOSSY_COBBLESTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  MOSSY_STONE_BRICKS("mossy_stone_brick", Blocks.MOSSY_STONE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  NETHER_BRICKS("nether_brick", Blocks.NETHER_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  NETHERRACK("netherrack", Blocks.NETHERRACK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class), // TODO
  OBSIDIAN("obsidian", Blocks.OBSIDIAN, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  POLISHED_ANDESITE("polished_andesite", Blocks.POLISHED_ANDESITE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  POLISHED_BLACKSTONE("polished_blackstone", Blocks.POLISHED_BLACKSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  POLISHED_BLACKSTONE_BRICKS("polished_blackstone_brick", Blocks.POLISHED_BLACKSTONE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  POLISHED_DEEPSLATE("polished_deepslate", Blocks.POLISHED_DEEPSLATE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  POLISHED_DIORITE("polished_diorite", Blocks.POLISHED_DIORITE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  POLISHED_GRANITE("polished_granite", Blocks.POLISHED_GRANITE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PRISMARINE("prismarine", Blocks.PRISMARINE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PRISMARINE_BRICKS("prismarine_brick", Blocks.PRISMARINE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PURPUR("purpur", Blocks.PURPUR_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  QUARTZ("quartz", Blocks.QUARTZ_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  QUARTZ_BRICKS("quartz_brick", Blocks.QUARTZ_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  RED_NETHER_BRICKS("red_nether_brick", Blocks.RED_NETHER_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  RED_SANDSTONE("red_sandstone", Blocks.RED_SANDSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SANDSTONE("sandstone", Blocks.SANDSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SEA_LANTERN("sea_lantern", Blocks.SEA_LANTERN, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SMOOTH_BASALT("smooth_basalt", Blocks.SMOOTH_BASALT, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SMOOTH_QUARTZ("smooth_quartz", Blocks.SMOOTH_QUARTZ, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SMOOTH_RED_SANDSTONE("smooth_red_sandstone", Blocks.SMOOTH_RED_SANDSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SMOOTH_SANDSTONE("smooth_sandstone", Blocks.SMOOTH_SANDSTONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SMOOTH_STONE("smooth_stone", Blocks.SMOOTH_STONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  STONE("stone", Blocks.STONE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  STONE_BRICKS("stone_brick", Blocks.STONE_BRICKS, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  TERRACOTTA("terracotta", Blocks.TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),

  WHITE_TERRACOTTA("white_terracotta", Blocks.WHITE_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  ORANGE_TERRACOTTA("orange_terracotta", Blocks.ORANGE_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  MAGENTA_TERRACOTTA("magenta_terracotta", Blocks.MAGENTA_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIGHT_BLUE_TERRACOTTA("light_blue_terracotta", Blocks.LIGHT_BLUE_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  YELLOW_TERRACOTTA("yellow_terracotta", Blocks.YELLOW_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIME_TERRACOTTA("lime_terracotta", Blocks.LIME_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PINK_TERRACOTTA("pink_terracotta", Blocks.PINK_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GRAY_TERRACOTTA("gray_terracotta", Blocks.GRAY_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIGHT_GRAY_TERRACOTTA("light_gray_terracotta", Blocks.LIGHT_GRAY_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CYAN_TERRACOTTA("cyan_terracotta", Blocks.CYAN_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PURPLE_TERRACOTTA("purple_terracotta", Blocks.PURPLE_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BLUE_TERRACOTTA("blue_terracotta", Blocks.BLUE_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BROWN_TERRACOTTA("brown_terracotta", Blocks.BROWN_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GREEN_TERRACOTTA("green_terracotta", Blocks.GREEN_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  RED_TERRACOTTA("red_terracotta", Blocks.RED_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BLACK_TERRACOTTA("black_terracotta", Blocks.BLACK_TERRACOTTA, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),

  TUFF("tuff", Blocks.TUFF, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),

  COAL_ORE("coal_ore", Blocks.COAL_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  COPPER_ORE("copper_ore", Blocks.COPPER_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  IRON_ORE("iron_ore", Blocks.IRON_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GOLD_ORE("gold_ore", Blocks.GOLD_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DIAMOND_ORE("diamond_ore", Blocks.DIAMOND_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  EMERALD_ORE("emerald_ore", Blocks.EMERALD_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LAPIS_ORE("lapis_ore", Blocks.LAPIS_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  REDSTONE_ORE("redstone_ore", Blocks.REDSTONE_ORE, ButtonType.STONE, PressurePlateType.STONE, RedstoneOreBlockBehavior.class),

  DEEPSLATE_COAL_ORE("deepslate_coal_ore", Blocks.DEEPSLATE_COAL_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_COPPER_ORE("deepslate_copper_ore", Blocks.DEEPSLATE_COPPER_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_IRON_ORE("deepslate_iron_ore", Blocks.DEEPSLATE_IRON_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_GOLD_ORE("deepslate_gold_ore", Blocks.DEEPSLATE_GOLD_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_DIAMOND_ORE("deepslate_diamond_ore", Blocks.DEEPSLATE_DIAMOND_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_EMERALD_ORE("deepslate_emerald_ore", Blocks.DEEPSLATE_EMERALD_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_LAPIS_ORE("deepslate_lapis_ore", Blocks.DEEPSLATE_LAPIS_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DEEPSLATE_REDSTONE_ORE("deepslate_redstone_ore", Blocks.DEEPSLATE_REDSTONE_ORE, ButtonType.STONE, PressurePlateType.STONE, RedstoneOreBlockBehavior.class),

  NETHER_QUARTZ_ORE("nether_quartz_ore", Blocks.NETHER_QUARTZ_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  NETHER_GOLD_ORE("nether_gold_ore", Blocks.NETHER_GOLD_ORE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),

  // Powdered blocks
  SAND("sand", Blocks.SAND, null, PressurePlateType.STONE, FallingBlockBehavior.class),
  RED_SAND("red_sand", Blocks.RED_SAND, null, PressurePlateType.STONE, FallingBlockBehavior.class),
  GRAVEL("gravel", Blocks.GRAVEL, null, PressurePlateType.STONE, FallingBlockBehavior.class),

  WHITE_CONCRETE_POWDER("white_concrete_powder", Blocks.WHITE_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  ORANGE_CONCRETE_POWDER("orange_concrete_powder", Blocks.ORANGE_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  MAGENTA_CONCRETE_POWDER("magenta_concrete_powder", Blocks.MAGENTA_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  LIGHT_BLUE_CONCRETE_POWDER("light_blue_concrete_powder", Blocks.LIGHT_BLUE_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  YELLOW_CONCRETE_POWDER("yellow_concrete_powder", Blocks.YELLOW_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  LIME_CONCRETE_POWDER("lime_concrete_powder", Blocks.LIME_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  PINK_CONCRETE_POWDER("pink_concrete_powder", Blocks.PINK_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  GRAY_CONCRETE_POWDER("gray_concrete_powder", Blocks.GRAY_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  LIGHT_GRAY_CONCRETE_POWDER("light_gray_concrete_powder", Blocks.LIGHT_GRAY_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  CYAN_CONCRETE_POWDER("cyan_concrete_powder", Blocks.CYAN_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  PURPLE_CONCRETE_POWDER("purple_concrete_powder", Blocks.PURPLE_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  BLUE_CONCRETE_POWDER("blue_concrete_powder", Blocks.BLUE_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  BROWN_CONCRETE_POWDER("brown_concrete_powder", Blocks.BROWN_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  GREEN_CONCRETE_POWDER("green_concrete_powder", Blocks.GREEN_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  RED_CONCRETE_POWDER("red_concrete_powder", Blocks.RED_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),
  BLACK_CONCRETE_POWDER("black_concrete_powder", Blocks.BLACK_CONCRETE_POWDER, null, PressurePlateType.STONE, ConcretePowderBlockBehavior.class),

  // Gem and metal blocks
  AMETHYST("amethyst", Blocks.AMETHYST_BLOCK, ButtonType.STONE, PressurePlateType.STONE, AmethystBlockBehavior.class),
  COAL("coal", Blocks.COAL_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  COPPER("copper", Blocks.COPPER_BLOCK, ButtonType.STONE, PressurePlateType.LIGHT, OxidizableBlockBehavior.class),
  EXPOSED_COPPER("exposed_copper", Blocks.EXPOSED_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, OxidizableBlockBehavior.class),
  WEATHERED_COPPER("weathered_copper", Blocks.WEATHERED_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, OxidizableBlockBehavior.class),
  OXIDIZED_COPPER("oxidized_copper", Blocks.OXIDIZED_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, OxidizableBlockBehavior.class),
  WAXED_COPPER("waxed_copper", Blocks.WAXED_COPPER_BLOCK, ButtonType.STONE, PressurePlateType.LIGHT, WaxedBlockBehavior.class),
  WAXED_EXPOSED_COPPER("waxed_exposed_copper", Blocks.WAXED_EXPOSED_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, WaxedBlockBehavior.class),
  WAXED_WEATHERED_COPPER("waxed_weathered_copper", Blocks.WAXED_WEATHERED_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, WaxedBlockBehavior.class),
  WAXED_OXIDIZED_COPPER("waxed_oxidized_copper", Blocks.WAXED_OXIDIZED_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, WaxedBlockBehavior.class),
  CUT_COPPER("cut_copper", Blocks.CUT_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, OxidizableBlockBehavior.class),
  EXPOSED_CUT_COPPER("exposed_cut_copper", Blocks.EXPOSED_CUT_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, OxidizableBlockBehavior.class),
  WEATHERED_CUT_COPPER("weathered_cut_copper", Blocks.WEATHERED_CUT_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, OxidizableBlockBehavior.class),
  OXIDIZED_CUT_COPPER("oxidized_cut_copper", Blocks.OXIDIZED_CUT_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, OxidizableBlockBehavior.class),
  WAXED_CUT_COPPER("waxed_cut_copper", Blocks.WAXED_CUT_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, WaxedBlockBehavior.class),
  WAXED_EXPOSED_CUT_COPPER("waxed_exposed_cut_copper", Blocks.WAXED_EXPOSED_CUT_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, WaxedBlockBehavior.class),
  WAXED_WEATHERED_CUT_COPPER("waxed_weathered_cut_copper", Blocks.WAXED_WEATHERED_CUT_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, WaxedBlockBehavior.class),
  WAXED_OXIDIZED_CUT_COPPER("waxed_oxidized_cut_copper", Blocks.WAXED_OXIDIZED_CUT_COPPER, ButtonType.STONE, PressurePlateType.LIGHT, WaxedBlockBehavior.class),
  DIAMOND("diamond", Blocks.DIAMOND_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  EMERALD("emerald", Blocks.EMERALD_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  IRON("iron", Blocks.IRON_BLOCK, ButtonType.STONE, PressurePlateType.HEAVY, BlockBehavior.class),
  GOLD("gold", Blocks.GOLD_BLOCK, ButtonType.STONE, PressurePlateType.LIGHT, BlockBehavior.class),
  LAPIS("lapis", Blocks.LAPIS_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  NETHERITE("netherite", Blocks.NETHERITE_BLOCK, ButtonType.STONE, PressurePlateType.HEAVY, BlockBehavior.class),
  RAW_COPPER("raw_copper", Blocks.RAW_COPPER_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  RAW_IRON("raw_iron", Blocks.RAW_IRON_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  RAW_GOLD("raw_gold", Blocks.RAW_GOLD_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  REDSTONE("redstone", Blocks.REDSTONE_BLOCK, ButtonType.STONE, PressurePlateType.STONE, RedstoneBlockBehavior.class),

  // Glass
  GLASS("glass", Blocks.GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getCutout()),
  TINTED_GLASS("tinted_glass", Blocks.TINTED_GLASS, ButtonType.STONE, PressurePlateType.STONE, TintedGlassBlockBehavior.class, RenderLayer.getTranslucent()),

  WHITE_STAINED_GLASS("white_stained_glass", Blocks.WHITE_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  ORANGE_STAINED_GLASS("orange_stained_glass", Blocks.ORANGE_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  MAGENTA_STAINED_GLASS("magenta_stained_glass", Blocks.MAGENTA_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  LIGHT_BLUE_STAINED_GLASS("light_blue_stained_glass", Blocks.LIGHT_BLUE_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  YELLOW_STAINED_GLASS("yellow_stained_glass", Blocks.YELLOW_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  LIME_STAINED_GLASS("lime_stained_glass", Blocks.LIME_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  PINK_STAINED_GLASS("pink_stained_glass", Blocks.PINK_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  GRAY_STAINED_GLASS("gray_stained_glass", Blocks.GRAY_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  LIGHT_GRAY_STAINED_GLASS("light_gray_stained_glass", Blocks.LIGHT_GRAY_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  CYAN_STAINED_GLASS("cyan_stained_glass", Blocks.CYAN_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  PURPLE_STAINED_GLASS("purple_stained_glass", Blocks.PURPLE_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  BLUE_STAINED_GLASS("blue_stained_glass", Blocks.BLUE_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  BROWN_STAINED_GLASS("brown_stained_glass", Blocks.BROWN_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  GREEN_STAINED_GLASS("green_stained_glass", Blocks.GREEN_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  RED_STAINED_GLASS("red_stained_glass", Blocks.RED_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),
  BLACK_STAINED_GLASS("black_stained_glass", Blocks.BLACK_STAINED_GLASS, ButtonType.STONE, PressurePlateType.STONE, GlassBlockBehavior.class, RenderLayer.getTranslucent()),

  // Other
  BLUE_ICE("blue_ice", Blocks.BLUE_ICE, ButtonType.STONE, PressurePlateType.STONE, TransparentBlockBehavior.class),
  CLAY("clay", Blocks.CLAY, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CHARCOAL("charcoal", ModBlocks.CHARCOAL_BLOCK, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  COARSE_DIRT("coarse_dirt", Blocks.COARSE_DIRT, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CRIMSON_NYLIUM("crimson_nylium", Blocks.CRIMSON_NYLIUM, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class), // TODO
  DIRT("dirt", Blocks.DIRT, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  DRIED_KELP("dried_kelp", Blocks.DRIED_KELP_BLOCK, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  GRASS("grass", Blocks.GRASS_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class), // TODO
  HONEYCOMB("honeycomb", Blocks.HONEYCOMB_BLOCK, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  ICE("ice", Blocks.ICE, ButtonType.STONE, PressurePlateType.STONE, IceBlockBehavior.class, RenderLayer.getTranslucent()),
  MOSS("moss", Blocks.MOSS_BLOCK, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class), // TODO
  BROWN_MUSHROOM("brown_mushroom", Blocks.BROWN_MUSHROOM_BLOCK, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  RED_MUSHROOM("red_mushroom", Blocks.RED_MUSHROOM_BLOCK, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  MYCELIUM("mycelium", Blocks.MYCELIUM, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class), // TODO
  NETHER_WART("nether_wart", Blocks.NETHER_WART_BLOCK, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  PODZOL("podzol", Blocks.PODZOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class), // TODO
  PACKED_ICE("packed_ice", Blocks.PACKED_ICE, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PUMPKIN("pumpkin", Blocks.PUMPKIN, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),
  ROOTED_DIRT("rooted_dirt", Blocks.ROOTED_DIRT, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class), // TODO
  SHROOMLIGHT("shroomlight", Blocks.SHROOMLIGHT, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SNOW("snow", Blocks.SNOW_BLOCK, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  SOUL_SAND("soul_sand", Blocks.SOUL_SAND, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class), // TODO
  SOUL_SOIL("soul_soil", Blocks.SOUL_SOIL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  WARPED_NYLIUM("warped_nylium", Blocks.WARPED_NYLIUM, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class), // TODO
  WARPED_WART("warped_wart", Blocks.WARPED_WART_BLOCK, ButtonType.WOOD, PressurePlateType.WOOD, BlockBehavior.class),

  WHITE_WOOL("white_wool", Blocks.WHITE_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  ORANGE_WOOL("orange_wool", Blocks.ORANGE_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  MAGENTA_WOOL("magenta_wool", Blocks.MAGENTA_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIGHT_BLUE_WOOL("light_blue_wool", Blocks.LIGHT_BLUE_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  YELLOW_WOOL("yellow_wool", Blocks.YELLOW_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIME_WOOL("lime_wool", Blocks.LIME_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PINK_WOOL("pink_wool", Blocks.PINK_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GRAY_WOOL("gray_wool", Blocks.GRAY_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  LIGHT_GRAY_WOOL("light_gray_wool", Blocks.LIGHT_GRAY_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  CYAN_WOOL("cyan_wool", Blocks.CYAN_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  PURPLE_WOOL("purple_wool", Blocks.PURPLE_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BLUE_WOOL("blue_wool", Blocks.BLUE_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BROWN_WOOL("brown_wool", Blocks.BROWN_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  GREEN_WOOL("green_wool", Blocks.GREEN_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  RED_WOOL("red_wool", Blocks.RED_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  BLACK_WOOL("black_wool", Blocks.BLACK_WOOL, ButtonType.STONE, PressurePlateType.STONE, BlockBehavior.class),
  ;

  private final String name;
  private final Block baseBlock;
  private final ButtonType buttonType;
  private final PressurePlateType pressurePlateType;
  private final Class<? extends BlockBehavior> blockBehaviorClass;
  private final RenderLayer renderLayer;

  BlockMaterial(final String name, final Block baseBlock, ButtonType buttonType, PressurePlateType pressurePlateType, Class<? extends BlockBehavior> blockBehaviorClass) {
    this(name, baseBlock, buttonType, pressurePlateType, blockBehaviorClass, null);
  }

  BlockMaterial(final String name, final Block baseBlock, ButtonType buttonType, PressurePlateType pressurePlateType, Class<? extends BlockBehavior> blockBehaviorClass, RenderLayer renderLayer) {
    this.name = name;
    this.baseBlock = baseBlock;
    this.buttonType = buttonType;
    this.pressurePlateType = pressurePlateType;
    this.blockBehaviorClass = blockBehaviorClass;
    this.renderLayer = renderLayer;
  }

  /**
   * Returns this material’s name.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the block from which to copy properties.
   */
  public Block getBaseBlock() {
    return this.baseBlock;
  }

  /**
   * Returns the type of button for this material.
   * May be null.
   */
  @Nullable
  public ButtonType getButtonType() {
    return this.buttonType;
  }

  /**
   * Returns the type of pressure plate for this material.
   * May be null.
   */
  @Nullable
  public PressurePlateType getPressurePlateType() {
    return this.pressurePlateType;
  }

  /**
   * Returns the {@link BlockBehavior} class to instanciate for this material.
   */
  public Class<? extends BlockBehavior> getBlockBehaviorClass() {
    return this.blockBehaviorClass;
  }

  /**
   * Instanciates the {@link BlockBehavior} class associated to this material for the given block.
   *
   * @param block The block to associate the behavior to.
   * @return The behavior instance.
   */
  public BlockBehavior createBehaviorForBlock(final Block block) {
    try {
      return this.getBlockBehaviorClass().getConstructor(Block.class).newInstance(block);
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Returns the hardened concrete material associated to this material.
   * Will be null for materials that are not a type of concrete powder.
   */
  public BlockMaterial getHardenedConcreteMaterial() {
    return switch (this) {
      case WHITE_CONCRETE_POWDER -> WHITE_CONCRETE;
      case ORANGE_CONCRETE_POWDER -> ORANGE_CONCRETE;
      case MAGENTA_CONCRETE_POWDER -> MAGENTA_CONCRETE;
      case LIGHT_BLUE_CONCRETE_POWDER -> LIGHT_BLUE_CONCRETE;
      case YELLOW_CONCRETE_POWDER -> YELLOW_CONCRETE;
      case LIME_CONCRETE_POWDER -> LIME_CONCRETE;
      case PINK_CONCRETE_POWDER -> PINK_CONCRETE;
      case GRAY_CONCRETE_POWDER -> GRAY_CONCRETE;
      case LIGHT_GRAY_CONCRETE_POWDER -> LIGHT_GRAY_CONCRETE;
      case CYAN_CONCRETE_POWDER -> CYAN_CONCRETE;
      case PURPLE_CONCRETE_POWDER -> PURPLE_CONCRETE;
      case BLUE_CONCRETE_POWDER -> BLUE_CONCRETE;
      case BROWN_CONCRETE_POWDER -> BROWN_CONCRETE;
      case GREEN_CONCRETE_POWDER -> GREEN_CONCRETE;
      case RED_CONCRETE_POWDER -> RED_CONCRETE;
      case BLACK_CONCRETE_POWDER -> BLACK_CONCRETE;
      default -> null;
    };
  }

  /**
   * Returns the dead coral material associated to this material.
   * Will be null for materials that are not a type of living coral.
   */
  public BlockMaterial getDeadCoralMaterial() {
    return switch (this) {
      case TUBE_CORAL -> DEAD_TUBE_CORAL;
      case BRAIN_CORAL -> DEAD_BRAIN_CORAL;
      case BUBBLE_CORAL -> DEAD_BUBBLE_CORAL;
      case FIRE_CORAL -> DEAD_FIRE_CORAL;
      case HORN_CORAL -> DEAD_HORN_CORAL;
      default -> null;
    };
  }

  /**
   * Returns the next oxidation material for this material.
   * Will be null for materials that are not a type of non-fully-oxidized copper.
   */
  public BlockMaterial getNextOxidationMaterial() {
    return switch (this) {
      case COPPER -> EXPOSED_COPPER;
      case EXPOSED_COPPER -> WEATHERED_COPPER;
      case WEATHERED_COPPER -> OXIDIZED_COPPER;
      case CUT_COPPER -> EXPOSED_CUT_COPPER;
      case EXPOSED_CUT_COPPER -> WEATHERED_CUT_COPPER;
      case WEATHERED_CUT_COPPER -> OXIDIZED_CUT_COPPER;
      default -> null;
    };
  }

  /**
   * Returns the previous oxidation material for this material.
   * Will be null for materials that are not a type of oxidized copper.
   */
  public BlockMaterial getPreviousOxidationMaterial() {
    return switch (this) {
      case EXPOSED_COPPER -> COPPER;
      case WEATHERED_COPPER -> EXPOSED_COPPER;
      case OXIDIZED_COPPER -> WEATHERED_COPPER;
      case EXPOSED_CUT_COPPER -> CUT_COPPER;
      case WEATHERED_CUT_COPPER -> EXPOSED_CUT_COPPER;
      case OXIDIZED_CUT_COPPER -> WEATHERED_CUT_COPPER;
      default -> null;
    };
  }

  /**
   * Returns the oxidation level for this material.
   * Will be null for materials that are not a type of copper.
   */
  public Oxidizable.OxidationLevel getOxidationLevel() {
    return switch (this) {
      case COPPER, WAXED_COPPER, CUT_COPPER, WAXED_CUT_COPPER -> Oxidizable.OxidationLevel.UNAFFECTED;
      case EXPOSED_COPPER, WAXED_EXPOSED_COPPER, EXPOSED_CUT_COPPER, WAXED_EXPOSED_CUT_COPPER ->
          Oxidizable.OxidationLevel.EXPOSED;
      case WEATHERED_COPPER, WAXED_WEATHERED_COPPER, WEATHERED_CUT_COPPER, WAXED_WEATHERED_CUT_COPPER ->
          Oxidizable.OxidationLevel.WEATHERED;
      case OXIDIZED_COPPER, WAXED_OXIDIZED_COPPER, OXIDIZED_CUT_COPPER, WAXED_OXIDIZED_CUT_COPPER ->
          Oxidizable.OxidationLevel.OXIDIZED;
      default -> null;
    };
  }

  public BlockMaterial getWaxedMaterial() {
    return switch (this) {
      case COPPER -> WAXED_COPPER;
      case EXPOSED_COPPER -> WAXED_EXPOSED_COPPER;
      case WEATHERED_COPPER -> WAXED_WEATHERED_COPPER;
      case OXIDIZED_COPPER -> WAXED_OXIDIZED_COPPER;
      case CUT_COPPER -> WAXED_CUT_COPPER;
      case EXPOSED_CUT_COPPER -> WAXED_EXPOSED_CUT_COPPER;
      case WEATHERED_CUT_COPPER -> WAXED_WEATHERED_CUT_COPPER;
      case OXIDIZED_CUT_COPPER -> WAXED_OXIDIZED_CUT_COPPER;
      default -> null;
    };
  }

  public BlockMaterial getUnwaxedMaterial() {
    return switch (this) {
      case WAXED_COPPER -> COPPER;
      case WAXED_EXPOSED_COPPER -> EXPOSED_COPPER;
      case WAXED_WEATHERED_COPPER -> WEATHERED_COPPER;
      case WAXED_OXIDIZED_COPPER -> OXIDIZED_COPPER;
      case WAXED_CUT_COPPER -> CUT_COPPER;
      case WAXED_EXPOSED_CUT_COPPER -> EXPOSED_CUT_COPPER;
      case WAXED_WEATHERED_CUT_COPPER -> WEATHERED_CUT_COPPER;
      case WAXED_OXIDIZED_CUT_COPPER -> OXIDIZED_CUT_COPPER;
      default -> null;
    };
  }

  /**
   * Returns the render layer type for this material.
   * Will be null for materials that use the default layer.
   */
  @Nullable
  public RenderLayer getRenderLayer() {
    return this.renderLayer;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
