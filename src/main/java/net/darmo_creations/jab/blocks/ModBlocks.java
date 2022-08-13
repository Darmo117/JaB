package net.darmo_creations.jab.blocks;

import net.darmo_creations.jab.JaB;
import net.darmo_creations.jab.blocks.behaviors.*;
import net.darmo_creations.jab.mixins.FireBlockMixin;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.*;
import java.util.function.Function;

/**
 * Declares all blocks added by this mod.
 */
@SuppressWarnings("unused")
public final class ModBlocks {
  public static final Block CHARCOAL_BLOCK =
      register("charcoal_block", new Block(AbstractBlock.Settings.of(Material.WOOD, MapColor.BLACK).requiresTool().strength(5, 6)));

  static {
    FlammableBlockRegistry.getDefaultInstance().add(CHARCOAL_BLOCK, 5, 5);
  }

  public static final Map<BlockMaterial, Block> WOODEN_BUTTONS = new HashMap<>();
  public static final Map<BlockMaterial, Block> STONE_BUTTONS = new HashMap<>();
  public static final Map<BlockMaterial, Block> WOODEN_PRESSURE_PLATES = new HashMap<>();
  public static final Map<BlockMaterial, Block> STONE_PRESSURE_PLATES = new HashMap<>();
  public static final Map<BlockMaterial, Block> GATES = new HashMap<>();
  public static final Map<BlockMaterial, Block> FENCES = new HashMap<>();
  public static final Map<BlockMaterial, Block> WALLS = new HashMap<>();
  public static final Map<BlockMaterial, Block> SLABS = new HashMap<>();
  public static final Map<BlockMaterial, Block> STAIRS = new HashMap<>();
  public static final Map<BlockMaterial, Block> SIGNS = new HashMap<>();

  public static final List<Map<BlockMaterial, Block>> BLOCK_TYPES = Arrays.asList(
      WOODEN_BUTTONS,
      STONE_BUTTONS,
      WOODEN_PRESSURE_PLATES,
      STONE_PRESSURE_PLATES,
      GATES,
      FENCES,
      WALLS,
      SLABS,
      STAIRS,
      SIGNS
  );

  static {
    registerBlocks(SLABS, "_slab",
        DecoratedSlabBlock::new,
        FallingSlabBlock::new,
        ConcretePowderSlab::new,
        LivingCoralSlabBlock::new,
        RedstoneOreSlabBlock::new,
        OxidizableSlabBlock::new,
        BlockMaterial.ANCIENT_DEBRIS,
        BlockMaterial.BEDROCK,
        BlockMaterial.CALCITE,
        BlockMaterial.WHITE_CONCRETE,
        BlockMaterial.ORANGE_CONCRETE,
        BlockMaterial.MAGENTA_CONCRETE,
        BlockMaterial.LIGHT_BLUE_CONCRETE,
        BlockMaterial.YELLOW_CONCRETE,
        BlockMaterial.LIME_CONCRETE,
        BlockMaterial.PINK_CONCRETE,
        BlockMaterial.GRAY_CONCRETE,
        BlockMaterial.LIGHT_GRAY_CONCRETE,
        BlockMaterial.CYAN_CONCRETE,
        BlockMaterial.PURPLE_CONCRETE,
        BlockMaterial.BLUE_CONCRETE,
        BlockMaterial.BROWN_CONCRETE,
        BlockMaterial.GREEN_CONCRETE,
        BlockMaterial.RED_CONCRETE,
        BlockMaterial.BLACK_CONCRETE,
        BlockMaterial.TUBE_CORAL,
        BlockMaterial.BRAIN_CORAL,
        BlockMaterial.BUBBLE_CORAL,
        BlockMaterial.FIRE_CORAL,
        BlockMaterial.HORN_CORAL,
        BlockMaterial.DEAD_TUBE_CORAL,
        BlockMaterial.DEAD_BRAIN_CORAL,
        BlockMaterial.DEAD_BUBBLE_CORAL,
        BlockMaterial.DEAD_FIRE_CORAL,
        BlockMaterial.DEAD_HORN_CORAL,
        BlockMaterial.DEEPSLATE,
        BlockMaterial.CHISELED_DEEPSLATE,
        BlockMaterial.CHISELED_NETHER_BRICKS,
        BlockMaterial.CHISELED_POLISHED_BLACKSTONE,
        BlockMaterial.CHISELED_QUARTZ_BLOCK,
        BlockMaterial.CHISELED_RED_SANDSTONE,
        BlockMaterial.CHISELED_SANDSTONE,
        BlockMaterial.CHISELED_STONE_BRICKS,
        BlockMaterial.CRACKED_DEEPSLATE_BRICKS,
        BlockMaterial.CRACKED_DEEPSLATE_TILES,
        BlockMaterial.CRACKED_NETHER_BRICKS,
        BlockMaterial.CRACKED_POLISHED_BLACKSTONE_BRICKS,
        BlockMaterial.CRACKED_STONE_BRICKS,
        BlockMaterial.CRYING_OBSIDIAN,
        BlockMaterial.DRIPSTONE,
        BlockMaterial.END_STONE,
        BlockMaterial.GILDED_BLACKSTONE,
        BlockMaterial.GLOWSTONE,
        BlockMaterial.MAGMA,
        BlockMaterial.NETHERRACK,
        BlockMaterial.OBSIDIAN,
        BlockMaterial.QUARTZ_BRICKS,
        BlockMaterial.SEA_LANTERN,
        BlockMaterial.SMOOTH_BASALT,
        BlockMaterial.TERRACOTTA,
        BlockMaterial.WHITE_TERRACOTTA,
        BlockMaterial.ORANGE_TERRACOTTA,
        BlockMaterial.MAGENTA_TERRACOTTA,
        BlockMaterial.LIGHT_BLUE_TERRACOTTA,
        BlockMaterial.YELLOW_TERRACOTTA,
        BlockMaterial.LIME_TERRACOTTA,
        BlockMaterial.PINK_TERRACOTTA,
        BlockMaterial.GRAY_TERRACOTTA,
        BlockMaterial.LIGHT_GRAY_TERRACOTTA,
        BlockMaterial.CYAN_TERRACOTTA,
        BlockMaterial.PURPLE_TERRACOTTA,
        BlockMaterial.BLUE_TERRACOTTA,
        BlockMaterial.BROWN_TERRACOTTA,
        BlockMaterial.RED_TERRACOTTA,
        BlockMaterial.BLACK_TERRACOTTA,
        BlockMaterial.TUFF,
        BlockMaterial.COAL_ORE,
        BlockMaterial.COPPER_ORE,
        BlockMaterial.IRON_ORE,
        BlockMaterial.GOLD_ORE,
        BlockMaterial.DIAMOND_ORE,
        BlockMaterial.EMERALD_ORE,
        BlockMaterial.LAPIS_ORE,
        BlockMaterial.REDSTONE_ORE,
        BlockMaterial.DEEPSLATE_COAL_ORE,
        BlockMaterial.DEEPSLATE_COPPER_ORE,
        BlockMaterial.DEEPSLATE_IRON_ORE,
        BlockMaterial.DEEPSLATE_GOLD_ORE,
        BlockMaterial.DEEPSLATE_DIAMOND_ORE,
        BlockMaterial.DEEPSLATE_EMERALD_ORE,
        BlockMaterial.DEEPSLATE_LAPIS_ORE,
        BlockMaterial.DEEPSLATE_REDSTONE_ORE,
        BlockMaterial.NETHER_QUARTZ_ORE,
        BlockMaterial.NETHER_GOLD_ORE,
        BlockMaterial.SAND,
        BlockMaterial.RED_SAND,
        BlockMaterial.GRAVEL,
        BlockMaterial.WHITE_CONCRETE_POWDER,
        BlockMaterial.ORANGE_CONCRETE_POWDER,
        BlockMaterial.MAGENTA_CONCRETE_POWDER,
        BlockMaterial.LIGHT_BLUE_CONCRETE_POWDER,
        BlockMaterial.YELLOW_CONCRETE_POWDER,
        BlockMaterial.LIME_CONCRETE_POWDER,
        BlockMaterial.PINK_CONCRETE_POWDER,
        BlockMaterial.GRAY_CONCRETE_POWDER,
        BlockMaterial.LIGHT_GRAY_CONCRETE_POWDER,
        BlockMaterial.CYAN_CONCRETE_POWDER,
        BlockMaterial.BLUE_CONCRETE_POWDER,
        BlockMaterial.BROWN_CONCRETE_POWDER,
        BlockMaterial.GREEN_CONCRETE_POWDER,
        BlockMaterial.RED_CONCRETE_POWDER,
        BlockMaterial.BLACK_CONCRETE_POWDER,
        BlockMaterial.AMETHYST,
        BlockMaterial.COAL,
        BlockMaterial.COPPER,
        BlockMaterial.EXPOSED_COPPER,
        BlockMaterial.WEATHERED_COPPER,
        BlockMaterial.OXIDIZED_COPPER,
        BlockMaterial.WAXED_COPPER,
        BlockMaterial.WAXED_EXPOSED_COPPER,
        BlockMaterial.WAXED_WEATHERED_COPPER,
        BlockMaterial.WAXED_OXIDIZED_COPPER,
        BlockMaterial.DIAMOND,
        BlockMaterial.EMERALD,
        BlockMaterial.IRON,
        BlockMaterial.GOLD,
        BlockMaterial.LAPIS,
        BlockMaterial.NETHERITE,
        BlockMaterial.RAW_COPPER,
        BlockMaterial.RAW_IRON,
        BlockMaterial.RAW_GOLD,
        BlockMaterial.REDSTONE,
        BlockMaterial.GLASS,
        BlockMaterial.TINTED_GLASS,
        BlockMaterial.WHITE_STAINED_GLASS,
        BlockMaterial.ORANGE_STAINED_GLASS,
        BlockMaterial.MAGENTA_STAINED_GLASS,
        BlockMaterial.LIGHT_BLUE_STAINED_GLASS,
        BlockMaterial.YELLOW_STAINED_GLASS,
        BlockMaterial.LIME_STAINED_GLASS,
        BlockMaterial.PINK_STAINED_GLASS,
        BlockMaterial.GRAY_STAINED_GLASS,
        BlockMaterial.LIGHT_GRAY_STAINED_GLASS,
        BlockMaterial.CYAN_STAINED_GLASS,
        BlockMaterial.PURPLE_STAINED_GLASS,
        BlockMaterial.BLUE_STAINED_GLASS,
        BlockMaterial.BROWN_STAINED_GLASS,
        BlockMaterial.GREEN_STAINED_GLASS,
        BlockMaterial.RED_STAINED_GLASS,
        BlockMaterial.BLACK_STAINED_GLASS,
        BlockMaterial.BLUE_ICE,
        BlockMaterial.CLAY,
        BlockMaterial.CHARCOAL,
        BlockMaterial.COARSE_DIRT,
        BlockMaterial.CRIMSON_NYLIUM,
        BlockMaterial.DIRT,
        BlockMaterial.DRIED_KELP,
        BlockMaterial.GRASS,
        BlockMaterial.HONEYCOMB,
        BlockMaterial.MOSS,
        BlockMaterial.BROWN_MUSHROOM,
        BlockMaterial.RED_MUSHROOM,
        BlockMaterial.MYCELIUM,
        BlockMaterial.NETHER_WART,
        BlockMaterial.PODZOL,
        BlockMaterial.PACKED_ICE,
        BlockMaterial.PUMPKIN,
        BlockMaterial.ROOTED_DIRT,
        BlockMaterial.SHROOMLIGHT,
        BlockMaterial.SNOW,
        BlockMaterial.SOUL_SAND,
        BlockMaterial.SOUL_SOIL,
        BlockMaterial.WARPED_NYLIUM,
        BlockMaterial.WARPED_WART,
        BlockMaterial.WHITE_WOOL,
        BlockMaterial.ORANGE_WOOL,
        BlockMaterial.MAGENTA_WOOL,
        BlockMaterial.LIGHT_BLUE_WOOL,
        BlockMaterial.YELLOW_WOOL,
        BlockMaterial.LIME_WOOL,
        BlockMaterial.PINK_WOOL,
        BlockMaterial.GRAY_WOOL,
        BlockMaterial.LIGHT_GRAY_WOOL,
        BlockMaterial.CYAN_WOOL,
        BlockMaterial.PURPLE_WOOL,
        BlockMaterial.BLUE_WOOL,
        BlockMaterial.BROWN_WOOL,
        BlockMaterial.GREEN_WOOL,
        BlockMaterial.RED_WOOL,
        BlockMaterial.BLACK_WOOL
    );
  }

  private static void registerBlocks(
      Map<BlockMaterial, Block> registry,
      final String suffix,
      final Function<BlockMaterial, ? extends DecoratedBlock> genericBlockProvider,
      final Function<BlockMaterial, ? extends DecoratedBlock> fallingBlockProvider,
      final Function<BlockMaterial, ? extends DecoratedBlock> concretePowderBlockProvider,
      final Function<BlockMaterial, ? extends DecoratedBlock> livingCoralBlockProvider,
      final Function<BlockMaterial, ? extends DecoratedBlock> redstoneOreBlockProvider,
      final Function<BlockMaterial, ? extends DecoratedBlock> oxidizableBlockProvider,
      final BlockMaterial... materials
  ) {
    Objects.requireNonNull(suffix);
    Arrays.stream(materials).forEach(material -> {
      Function<BlockMaterial, ? extends DecoratedBlock> blockProvider = getBlockProvider(material, genericBlockProvider, fallingBlockProvider,
          concretePowderBlockProvider, livingCoralBlockProvider, redstoneOreBlockProvider, oxidizableBlockProvider);
      DecoratedBlock block = blockProvider.apply(material);
      registry.put(material, register(material.getName() + suffix, (Block) block));
      setFlammability(block);
    });
  }

  /**
   * Makes the given block flammable if the base one is too.
   *
   * @param block The block.
   */
  private static void setFlammability(DecoratedBlock block) {
    FireBlockMixin fireBlock = (FireBlockMixin) Blocks.FIRE;
    BlockState defaultState = block.getMaterial().getBaseBlock().getDefaultState();
    int burnChance = fireBlock.invokeGetBurnChance(defaultState);
    if (burnChance != 0) {
      FlammableBlockRegistry.getDefaultInstance().add((Block) block, burnChance, fireBlock.invokeGetSpreadChance(defaultState));
    }
  }

  private static Function<BlockMaterial, ? extends DecoratedBlock> getBlockProvider(
      BlockMaterial material,
      Function<BlockMaterial, ? extends DecoratedBlock> genericBlockProvider,
      Function<BlockMaterial, ? extends DecoratedBlock> fallingBlockProvider,
      Function<BlockMaterial, ? extends DecoratedBlock> concretePowderBlockProvider,
      Function<BlockMaterial, ? extends DecoratedBlock> livingCoralBlockProvider,
      Function<BlockMaterial, ? extends DecoratedBlock> redstoneOreBlockProvider,
      final Function<BlockMaterial, ? extends DecoratedBlock> oxidizableBlockProvider
  ) {
    Function<BlockMaterial, ? extends DecoratedBlock> blockProvider;
    if (material.getBlockBehaviorClass() == FallingBlockBehavior.class) {
      blockProvider = fallingBlockProvider;
    } else if (material.getBlockBehaviorClass() == ConcretePowderBlockBehavior.class) {
      blockProvider = concretePowderBlockProvider;
    } else if (material.getBlockBehaviorClass() == LivingCoralBlockBehavior.class) {
      blockProvider = livingCoralBlockProvider;
    } else if (material.getBlockBehaviorClass() == RedstoneOreBlockBehavior.class) {
      blockProvider = redstoneOreBlockProvider;
    } else if (material.getBlockBehaviorClass() == OxidizableBlockBehavior.class) {
      blockProvider = oxidizableBlockProvider;
    } else {
      blockProvider = genericBlockProvider;
    }
    return blockProvider;
  }

  /**
   * Registers a block and puts it in the mod’s item group.
   *
   * @param name  Block’s name.
   * @param block Block to register.
   * @param <T>   Type of the block to register.
   * @return The registered block.
   */
  private static <T extends Block> T register(final String name, final T block) {
    Registry.register(Registry.BLOCK, new Identifier(JaB.MOD_ID, name), block);
    Registry.register(Registry.ITEM, new Identifier(JaB.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(JaB.ITEM_GROUP)));
    return block;
  }

  /**
   * Registers render layers for some block.
   * <p>
   * Must be called on client only.
   */
  public static void registerBlockRenderLayers() {
    // Only register non-solid material layers
    List<BlockMaterial> nonSolids = Arrays.stream(BlockMaterial.values()).filter(m -> m.getRenderLayer() != null).toList();
    BLOCK_TYPES.forEach(map -> {
      for (BlockMaterial material : nonSolids) {
        if (map.containsKey(material)) {
          BlockRenderLayerMap.INSTANCE.putBlock(map.get(material), material.getRenderLayer());
        }
      }
    });
  }

  private ModBlocks() {
  }
}
