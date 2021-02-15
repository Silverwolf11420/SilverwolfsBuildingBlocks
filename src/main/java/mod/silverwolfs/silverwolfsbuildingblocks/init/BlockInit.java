package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.object.blocks.*;
import mod.silverwolfs.silverwolfsbuildingblocks.util.WoodenPlank;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SilverwolfsBuildingBlocks.MOD_ID);


    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
        ITEMS.register(modBus);

    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, BlockInit::itemDefault);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        ITEMS.register(name, itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(final RegistryObject<? extends Block> block) {
        return item(block, SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance);
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final ItemGroup itemGroup) {
        return () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup));
    }

    //Blocks
    public static final RegistryObject<Block> THATCH_BLOCK = BLOCKS.register("thatch_block", () -> new Block(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F, 0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> BAMBOO_BLOCK = BLOCKS.register("bamboo_block", () -> new Block(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F, 0.5F)));

    public static final RegistryObject<Block> ACACIA_BEAM_UP = BLOCKS.register("acacia_beam_up", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> ACACIA_BEAM_MIDDLE = BLOCKS.register("acacia_beam_middle", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> ACACIA_BEAM_DOWN = BLOCKS.register("acacia_beam_down", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> BIRCH_BEAM_UP = BLOCKS.register("birch_beam_up", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> BIRCH_BEAM_MIDDLE = BLOCKS.register("birch_beam_middle", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> BIRCH_BEAM_DOWN = BLOCKS.register("birch_beam_down", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> OAK_BEAM_UP = BLOCKS.register("oak_beam_up", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> OAK_BEAM_MIDDLE = BLOCKS.register("oak_beam_middle", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> OAK_BEAM_DOWN = BLOCKS.register("oak_beam_down", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> JUNGLE_BEAM_UP = BLOCKS.register("jungle_beam_up", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> JUNGLE_BEAM_MIDDLE = BLOCKS.register("jungle_beam_middle", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> JUNGLE_BEAM_DOWN = BLOCKS.register("jungle_beam_down", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> SPRUCE_BEAM_UP = BLOCKS.register("spruce_beam_up", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> SPRUCE_BEAM_MIDDLE = BLOCKS.register("spruce_beam_middle", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> SPRUCE_BEAM_DOWN = BLOCKS.register("spruce_beam_down", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_UP = BLOCKS.register("dark_oak_beam_up", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_MIDDLE = BLOCKS.register("dark_oak_beam_middle", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_DOWN = BLOCKS.register("dark_oak_beam_down", () -> new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> MOSSY_STONE = BLOCKS.register("mossy_stone", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE = BLOCKS.register("more_mossy_stone", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE = BLOCKS.register("mossy_andesite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE = BLOCKS.register("more_mossy_andesite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));

    public static final RegistryObject<Block> BAMBOO_BUTTON = BLOCKS.register("bamboo_button", () -> new ModWoodButtonBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO).hardnessAndResistance(0.5F, 0.5F)));
    public static final RegistryObject<Block> THATCH_BUTTON = BLOCKS.register("thatch_button", () -> new ModWoodButtonBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F, 0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MOSSY_STONE_BUTTON = BLOCKS.register("mossy_stone_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_BUTTON = BLOCKS.register("more_mossy_stone_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BUTTON = BLOCKS.register("mossy_andesite_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_BUTTON = BLOCKS.register("more_mossy_andesite_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));

    public static final RegistryObject<Block> THATCH_DOOR = BLOCKS.register("thatch_door", () -> new ModDoors(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F, 0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> BAMBOO_DOOR = BLOCKS.register("bamboo_door", () -> new ModDoors(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F, 0.5F)));

    public static final RegistryObject<Block> BAMBOO_FENCE = BLOCKS.register("bamboo_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> BAMBOO_FENCE_GATE = BLOCKS.register("bamboo_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> THATCH_FENCE = BLOCKS.register("thatch_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> THATCH_FENCE_GATE = BLOCKS.register("thatch_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).harvestTool(ToolType.HOE)));

    public static final RegistryObject<Block> MOSSY_STONE_WALL = BLOCKS.register("mossy_stone_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_WALL = BLOCKS.register("more_mossy_stone_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_WALL = BLOCKS.register("mossy_andesite_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_WALL = BLOCKS.register("more_mossy_andesite_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));

    public static final RegistryObject<ModLadderBlock> BAMBOO_LADDER = BLOCKS.register("bamboo_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> THATCH_LADDER = BLOCKS.register("thatch_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER).harvestTool(ToolType.HOE)));

    public static final RegistryObject<Block> BAMBOO_PRESSURE_PLATE = BLOCKS.register("bamboo_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> THATCH_PRESSURE_PLATE = BLOCKS.register("thatch_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MOSSY_STONE_PRESSURE_PLATE = BLOCKS.register("mossy_stone_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_PRESSURE_PLATE = BLOCKS.register("more_mossy_stone_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_PRESSURE_PLATE = BLOCKS.register("mossy_andesite_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_PRESSURE_PLATE = BLOCKS.register("more_mossy_andesite_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));

    public static final RegistryObject<Block> THATCH_SLAB = BLOCKS.register("thatch_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_SLAB = BLOCKS.register("bamboo_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> MOSSY_STONE_SLAB = BLOCKS.register("mossy_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.MOSSY_STONE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_SLAB = BLOCKS.register("more_mossy_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.MORE_MOSSY_STONE.get())));
    public static final RegistryObject<Block> MOSSY_ANDESITE_SLAB = BLOCKS.register("mossy_andesite_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.MOSSY_ANDESITE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_SLAB = BLOCKS.register("more_mossy_andesite_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.MORE_MOSSY_ANDESITE.get())));

    public static final RegistryObject<Block> THATCH_STAIRS = BLOCKS.register("thatch_stairs", () -> new StairsBlock(() -> BlockInit.THATCH_BLOCK.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_STAIRS = BLOCKS.register("bamboo_stairs", () -> new StairsBlock(() -> BlockInit.BAMBOO_BLOCK.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> MOSSY_STONE_STAIRS = BLOCKS.register("mossy_stone_stairs", () -> new StairsBlock(() -> BlockInit.MOSSY_STONE.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.MOSSY_STONE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_STAIRS = BLOCKS.register("more_mossy_stone_stairs", () -> new StairsBlock(() -> BlockInit.MORE_MOSSY_STONE.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.MORE_MOSSY_STONE.get())));
    public static final RegistryObject<Block> MOSSY_ANDESITE_STAIRS = BLOCKS.register("mossy_andesite_stairs", () -> new StairsBlock(() -> BlockInit.MOSSY_ANDESITE.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.MOSSY_ANDESITE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_STAIRS = BLOCKS.register("more_mossy_andesite_stairs", () -> new StairsBlock(() -> BlockInit.MORE_MOSSY_ANDESITE.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.MORE_MOSSY_ANDESITE.get())));

    public static final RegistryObject<Block> BAMBOO_TRAPDOOR = BLOCKS.register("bamboo_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F).notSolid()));
    public static final RegistryObject<Block> THATCH_TRAPDOOR = BLOCKS.register("thatch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).notSolid()));

    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> PLANKS = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICKS = new ArrayList<>();
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> BUTTONS = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICK_BUTTONS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICK_BUTTONS = new ArrayList<>();
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> DOORS = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> FENCES = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> FENCE_GATES = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICK_WALLS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICK_WALLS = new ArrayList<>();
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> LADDERS = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> PRESSURE_PLATES = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICK_PRESSURE_PLATES = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICK_PRESSURE_PLATES = new ArrayList<>();
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> SLABS = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICK_SLABS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICK_SLABS = new ArrayList<>();
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> STAIRS = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICK_STAIRS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICK_STAIRS = new ArrayList<>();
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> TRAPDOORS = new EnumMap<>(WoodenPlank.class);

    static {
        for (DyeColor color : DyeColor.values()) {

            BRICKS.add(register(color.getTranslationKey() + "_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICKS.add(register(color.getTranslationKey() + "_stone_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            BRICK_BUTTONS.add(register(color.getTranslationKey() + "_brick_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICK_BUTTONS.add(register(color.getTranslationKey() + "_stone_brick_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            BRICK_WALLS.add(register(color.getTranslationKey() + "_brick_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICK_WALLS.add(register(color.getTranslationKey() + "_stone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            BRICK_PRESSURE_PLATES.add(register(color.getTranslationKey() + "_brick_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICK_PRESSURE_PLATES.add(register(color.getTranslationKey() + "_stone_brick_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            BRICK_SLABS.add(register(color.getTranslationKey() + "_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICK_SLABS.add(register(color.getTranslationKey() + "_stone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            BRICK_STAIRS.add(register(color.getTranslationKey() + "_brick_stairs", () -> new StairsBlock(Blocks.BRICKS.getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICK_STAIRS.add(register(color.getTranslationKey() + "_stone_brick_stairs", () -> new StairsBlock(Blocks.STONE_BRICKS.getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));

            for (WoodenPlank plank : WoodenPlank.values()) {
                PLANKS.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_plank",
                                () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
                BUTTONS.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_button",
                                () -> new ModWoodButtonBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
                ArrayList<RegistryObject<Block>> doors = DOORS.getOrDefault(plank, new ArrayList<>());

                doors.add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_door",
                        () -> new ModDoors(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                ));
                DOORS.put(plank, doors);
                FENCES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_fence",
                                () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE))
                        ));
                FENCE_GATES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_fence_gate",
                                () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE))
                        ));
                ArrayList<RegistryObject<Block>> ladders = LADDERS.getOrDefault(plank, new ArrayList<>());

                ladders.add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_ladder",
                        () -> new ModLadderBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                ));
                LADDERS.put(plank, ladders);
                PRESSURE_PLATES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_pressure_plate",
                                () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
                SLABS.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_slab",
                                () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
                STAIRS.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_stairs",
                                () -> new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)))
                        );
                ArrayList<RegistryObject<Block>> trapdoors = TRAPDOORS.getOrDefault(plank, new ArrayList<>());

                trapdoors.add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_trapdoor",
                        () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                ));
                TRAPDOORS.put(plank, trapdoors);
            }
        }
    }
}
