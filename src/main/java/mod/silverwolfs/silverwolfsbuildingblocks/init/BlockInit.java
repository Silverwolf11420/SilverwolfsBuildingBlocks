package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.object.blocks.*;
import mod.silverwolfs.silverwolfsbuildingblocks.util.WoodenPlank;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.particles.ParticleTypes;
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

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);

    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, BlockInit::itemDefault);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        ItemInit.ITEMS.register(name, itemCreator.apply(ret));
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
    public static final RegistryObject<Block> THATCH_BLOCK = BLOCKS.register("thatch_block", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F, 0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> THATCH_BUTTON = BLOCKS.register("thatch_button", () -> new ModWoodButtonBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F, 0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> THATCH_FENCE = BLOCKS.register("thatch_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> THATCH_FENCE_GATE = BLOCKS.register("thatch_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> THATCH_DOOR = BLOCKS.register("thatch_door", () -> new ModDoors(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F, 0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<ModLadderBlock> THATCH_LADDER = BLOCKS.register("thatch_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> THATCH_PRESSURE_PLATE = BLOCKS.register("thatch_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> THATCH_SLAB = BLOCKS.register("thatch_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> THATCH_STAIRS = BLOCKS.register("thatch_stairs", () -> new StairsBlock(() -> BlockInit.THATCH_BLOCK.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> THATCH_TRAPDOOR = BLOCKS.register("thatch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).notSolid()));

    public static final RegistryObject<Block> BAMBOO_BLOCK = BLOCKS.register("bamboo_block", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F, 0.5F)));
    public static final RegistryObject<Block> BAMBOO_BUTTON = BLOCKS.register("bamboo_button", () -> new ModWoodButtonBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO).hardnessAndResistance(0.5F, 0.5F)));
    public static final RegistryObject<Block> BAMBOO_DOOR = BLOCKS.register("bamboo_door", () -> new ModDoors(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F, 0.5F)));
    public static final RegistryObject<Block> BAMBOO_FENCE = BLOCKS.register("bamboo_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> BAMBOO_FENCE_GATE = BLOCKS.register("bamboo_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<ModLadderBlock> BAMBOO_LADDER = BLOCKS.register("bamboo_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<Block> BAMBOO_PRESSURE_PLATE = BLOCKS.register("bamboo_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> BAMBOO_SLAB = BLOCKS.register("bamboo_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_STAIRS = BLOCKS.register("bamboo_stairs", () -> new StairsBlock(() -> BlockInit.BAMBOO_BLOCK.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_TRAPDOOR = BLOCKS.register("bamboo_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F).notSolid()));
/*
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

    public static final RegistryObject<ModLadderBlock> ACACIA_LADDER = BLOCKS.register("acacia_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BIRCH_LADDER = BLOCKS.register("birch_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> DARK_OAK_LADDER = BLOCKS.register("dark_oak_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> JUNGLE_LADDER = BLOCKS.register("jungle_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> SPRUCE_LADDER = BLOCKS.register("spruce_ladder", () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER)));
*/
    public static final RegistryObject<Block> MOSSY_STONE = BLOCKS.register("mossy_stone", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_STONE_BUTTON = BLOCKS.register("mossy_stone_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_STONE_WALL = BLOCKS.register("mossy_stone_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_STONE_PRESSURE_PLATE = BLOCKS.register("mossy_stone_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_STONE_SLAB = BLOCKS.register("mossy_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.MOSSY_STONE.get())));
    public static final RegistryObject<Block> MOSSY_STONE_STAIRS = BLOCKS.register("mossy_stone_stairs", () -> new StairsBlock(() -> BlockInit.MOSSY_STONE.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.MOSSY_STONE.get())));

    public static final RegistryObject<Block> MORE_MOSSY_STONE = BLOCKS.register("more_mossy_stone", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_BUTTON = BLOCKS.register("more_mossy_stone_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_WALL = BLOCKS.register("more_mossy_stone_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_PRESSURE_PLATE = BLOCKS.register("more_mossy_stone_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_SLAB = BLOCKS.register("more_mossy_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.MORE_MOSSY_STONE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_STAIRS = BLOCKS.register("more_mossy_stone_stairs", () -> new StairsBlock(() -> BlockInit.MORE_MOSSY_STONE.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.MORE_MOSSY_STONE.get())));

    public static final RegistryObject<Block> MOSSY_ANDESITE = BLOCKS.register("mossy_andesite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BUTTON = BLOCKS.register("mossy_andesite_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_WALL = BLOCKS.register("mossy_andesite_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_PRESSURE_PLATE = BLOCKS.register("mossy_andesite_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_SLAB = BLOCKS.register("mossy_andesite_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.MOSSY_ANDESITE.get())));
    public static final RegistryObject<Block> MOSSY_ANDESITE_STAIRS = BLOCKS.register("mossy_andesite_stairs", () -> new StairsBlock(() -> BlockInit.MOSSY_ANDESITE.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.MOSSY_ANDESITE.get())));

    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE = BLOCKS.register("more_mossy_andesite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_BUTTON = BLOCKS.register("more_mossy_andesite_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_WALL = BLOCKS.register("more_mossy_andesite_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_PRESSURE_PLATE = BLOCKS.register("more_mossy_andesite_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_SLAB = BLOCKS.register("more_mossy_andesite_slab", () -> new SlabBlock(AbstractBlock.Properties.from(BlockInit.MORE_MOSSY_ANDESITE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_STAIRS = BLOCKS.register("more_mossy_andesite_stairs", () -> new StairsBlock(() -> BlockInit.MORE_MOSSY_ANDESITE.get().getDefaultState() , AbstractBlock.Properties.from(BlockInit.MORE_MOSSY_ANDESITE.get())));
/*
    public static final RegistryObject<TorchBlock> ACACIA_TORCH = BLOCKS.register("acacia_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<WallTorchBlock> ACACIA_WALL_TORCH = BLOCKS.register("acacia_wall_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(ACACIA_TORCH.get()).setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<TorchBlock> BIRCH_TORCH = BLOCKS.register("birch_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<WallTorchBlock> BIRCH_WALL_TORCH = BLOCKS.register("birch_wall_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(BIRCH_TORCH.get()).setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<TorchBlock> DARK_OAK_TORCH = BLOCKS.register("dark_oak_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<WallTorchBlock> DARK_OAK_WALL_TORCH = BLOCKS.register("dark_oak_wall_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(DARK_OAK_TORCH.get()).setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<TorchBlock> JUNGLE_TORCH = BLOCKS.register("jungle_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<WallTorchBlock> JUNGLE_WALL_TORCH = BLOCKS.register("jungle_wall_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(JUNGLE_TORCH.get()).setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<TorchBlock> SPRUCE_TORCH = BLOCKS.register("spruce_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 14), ParticleTypes.FLAME));
    public static final RegistryObject<WallTorchBlock> SPRUCE_WALL_TORCH = BLOCKS.register("spruce_wall_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(SPRUCE_TORCH.get()).setLightLevel((state) -> 14), ParticleTypes.FLAME));

    public static final RegistryObject<TorchBlock> ACACIA_SOUL_TORCH = BLOCKS.register("acacia_soul_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<WallTorchBlock> ACACIA_WALL_SOUL_TORCH = BLOCKS.register("acacia_wall_soul_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(ACACIA_SOUL_TORCH.get()).setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<TorchBlock> BIRCH_SOUL_TORCH = BLOCKS.register("birch_soul_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<WallTorchBlock> BIRCH_WALL_SOUL_TORCH = BLOCKS.register("birch_wall_soul_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(BIRCH_SOUL_TORCH.get()).setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<TorchBlock> DARK_OAK_SOUL_TORCH = BLOCKS.register("dark_oak_soul_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<WallTorchBlock> DARK_OAK_WALL_SOUL_TORCH = BLOCKS.register("dark_oak_wall_soul_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(DARK_OAK_SOUL_TORCH.get()).setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<TorchBlock> JUNGLE_SOUL_TORCH = BLOCKS.register("jungle_soul_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<WallTorchBlock> JUNGLE_WALL_SOUL_TORCH = BLOCKS.register("jungle_wall_soul_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(JUNGLE_SOUL_TORCH.get()).setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<TorchBlock> SPRUCE_SOUL_TORCH = BLOCKS.register("spruce_soul_torch", () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<WallTorchBlock> SPRUCE_WALL_SOUL_TORCH = BLOCKS.register("spruce_wall_soul_torch", () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(SPRUCE_SOUL_TORCH.get()).setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME));
*/
    //block items
    public static final RegistryObject<BlockItem> THATCH_BLOCK_ITEM = ItemInit.ITEMS.register("thatch_block", () -> new BlockItem(THATCH_BLOCK.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_BUTTON_ITEM = ItemInit.ITEMS.register("thatch_button", () -> new BlockItem(THATCH_BUTTON.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_FENCE_ITEM = ItemInit.ITEMS.register("thatch_fence", () -> new BlockItem(THATCH_FENCE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_FENCE_GATE_ITEM = ItemInit.ITEMS.register("thatch_fence_gate", () -> new BlockItem(THATCH_FENCE_GATE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_DOOR_ITEM = ItemInit.ITEMS.register("thatch_door", () -> new BlockItem(THATCH_DOOR.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_LADDER_ITEM = ItemInit.ITEMS.register("thatch_ladder", () -> new BlockItem(THATCH_LADDER.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_PRESSURE_PLATE_ITEM = ItemInit.ITEMS.register("thatch_pressure_plate", () -> new BlockItem(THATCH_PRESSURE_PLATE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_SLAB_ITEM = ItemInit.ITEMS.register("thatch_slab", () -> new BlockItem(THATCH_SLAB.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_STAIRS_ITEM = ItemInit.ITEMS.register("thatch_stairs", () -> new BlockItem(THATCH_STAIRS.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> THATCH_TRAPDOOR_ITEM = ItemInit.ITEMS.register("thatch_trapdoor", () -> new BlockItem(THATCH_TRAPDOOR.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));

    public static final RegistryObject<BlockItem> BAMBOO_BLOCK_ITEM = ItemInit.ITEMS.register("bamboo_block", () -> new BlockItem(BAMBOO_BLOCK.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_BUTTON_ITEM = ItemInit.ITEMS.register("bamboo_button", () -> new BlockItem(BAMBOO_BUTTON.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_FENCE_ITEM = ItemInit.ITEMS.register("bamboo_fence", () -> new BlockItem(BAMBOO_FENCE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_FENCE_GATE_ITEM = ItemInit.ITEMS.register("bamboo_fence_gate", () -> new BlockItem(BAMBOO_FENCE_GATE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_DOOR_ITEM = ItemInit.ITEMS.register("bamboo_door", () -> new BlockItem(BAMBOO_DOOR.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_LADDER_ITEM = ItemInit.ITEMS.register("bamboo_ladder", () -> new BlockItem(BAMBOO_LADDER.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_PRESSURE_PLATE_ITEM = ItemInit.ITEMS.register("bamboo_pressure_plate", () -> new BlockItem(BAMBOO_PRESSURE_PLATE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_SLAB_ITEM = ItemInit.ITEMS.register("bamboo_slab", () -> new BlockItem(BAMBOO_SLAB.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_STAIRS_ITEM = ItemInit.ITEMS.register("bamboo_stairs", () -> new BlockItem(BAMBOO_STAIRS.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BAMBOO_TRAPDOOR_ITEM = ItemInit.ITEMS.register("bamboo_trapdoor", () -> new BlockItem(BAMBOO_TRAPDOOR.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
/*
    public static final RegistryObject<BlockItem> ACACIA_BEAM_UP_ITEM = ItemInit.ITEMS.register("acacia_beam_up", () -> new BlockItem(ACACIA_BEAM_UP.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> ACACIA_BEAM_MIDDLE_ITEM = ItemInit.ITEMS.register("acacia_beam_middle", () -> new BlockItem(ACACIA_BEAM_MIDDLE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> ACACIA_BEAM_DOWN_ITEM = ItemInit.ITEMS.register("acacia_beam_down", () -> new BlockItem(ACACIA_BEAM_DOWN.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BIRCH_BEAM_UP_ITEM = ItemInit.ITEMS.register("birch_beam_up", () -> new BlockItem(BIRCH_BEAM_UP.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BIRCH_BEAM_MIDDLE_ITEM = ItemInit.ITEMS.register("birch_beam_middle", () -> new BlockItem(BIRCH_BEAM_MIDDLE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BIRCH_BEAM_DOWN_ITEM = ItemInit.ITEMS.register("birch_beam_down", () -> new BlockItem(BIRCH_BEAM_DOWN.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> DARK_OAK_BEAM_UP_ITEM = ItemInit.ITEMS.register("dark_oak_beam_up", () -> new BlockItem(DARK_OAK_BEAM_UP.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> DARK_OAK_BEAM_MIDDLE_ITEM = ItemInit.ITEMS.register("dark_oak_beam_middle", () -> new BlockItem(DARK_OAK_BEAM_MIDDLE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> DARK_OAK_BEAM_DOWN_ITEM = ItemInit.ITEMS.register("dark_oak_beam_down", () -> new BlockItem(DARK_OAK_BEAM_DOWN.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> JUNGLE_BEAM_UP_ITEM = ItemInit.ITEMS.register("jungle_beam_up", () -> new BlockItem(JUNGLE_BEAM_UP.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> JUNGLE_BEAM_MIDDLE_ITEM = ItemInit.ITEMS.register("jungle_beam_middle", () -> new BlockItem(JUNGLE_BEAM_MIDDLE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> JUNGLE_BEAM_DOWN_ITEM = ItemInit.ITEMS.register("jungle_beam_down", () -> new BlockItem(JUNGLE_BEAM_DOWN.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> OAK_BEAM_UP_ITEM = ItemInit.ITEMS.register("oak_beam_up", () -> new BlockItem(OAK_BEAM_UP.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> OAK_BEAM_MIDDLE_ITEM = ItemInit.ITEMS.register("oak_beam_middle", () -> new BlockItem(OAK_BEAM_MIDDLE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> OAK_BEAM_DOWN_ITEM = ItemInit.ITEMS.register("oak_beam_down", () -> new BlockItem(OAK_BEAM_DOWN.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> SPRUCE_BEAM_UP_ITEM = ItemInit.ITEMS.register("spruce_beam_up", () -> new BlockItem(SPRUCE_BEAM_UP.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> SPRUCE_BEAM_MIDDLE_ITEM = ItemInit.ITEMS.register("spruce_beam_middle", () -> new BlockItem(SPRUCE_BEAM_MIDDLE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> SPRUCE_BEAM_DOWN_ITEM = ItemInit.ITEMS.register("spruce_beam_down", () -> new BlockItem(SPRUCE_BEAM_DOWN.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));

    public static final RegistryObject<BlockItem> ACACIA_LADDER_ITEM = ItemInit.ITEMS.register("acacia_ladder", () -> new BlockItem(ACACIA_LADDER.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BIRCH_LADDER_ITEM = ItemInit.ITEMS.register("birch_ladder", () -> new BlockItem(BIRCH_LADDER.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> DARK_OAK_LADDER_ITEM = ItemInit.ITEMS.register("dark_oak_ladder", () -> new BlockItem(DARK_OAK_LADDER.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> JUNGLE_LADDER_ITEM = ItemInit.ITEMS.register("jungle_ladder", () -> new BlockItem(JUNGLE_LADDER.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> SPRUCE_LADDER_ITEM = ItemInit.ITEMS.register("spruce_ladder", () -> new BlockItem(SPRUCE_LADDER.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
*/
    public static final RegistryObject<BlockItem> MOSSY_STONE_BLOCK_ITEM = ItemInit.ITEMS.register("mossy_stone", () -> new BlockItem(MOSSY_STONE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_STONE_BUTTON_ITEM = ItemInit.ITEMS.register("mossy_stone_button", () -> new BlockItem(MOSSY_STONE_BUTTON.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_STONE_WALL_ITEM = ItemInit.ITEMS.register("mossy_stone_wall", () -> new BlockItem(MOSSY_STONE_WALL.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_STONE_PRESSURE_PLATE_ITEM = ItemInit.ITEMS.register("mossy_stone_pressure_plate", () -> new BlockItem(MOSSY_STONE_PRESSURE_PLATE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_STONE_SLAB_ITEM = ItemInit.ITEMS.register("mossy_stone_slab", () -> new BlockItem(MOSSY_STONE_SLAB.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_STONE_STAIRS_ITEM = ItemInit.ITEMS.register("mossy_stone_stairs", () -> new BlockItem(MOSSY_STONE_STAIRS.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));

    public static final RegistryObject<BlockItem> MORE_MOSSY_STONE_BLOCK_ITEM = ItemInit.ITEMS.register("more_mossy_stone", () -> new BlockItem(MORE_MOSSY_STONE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_STONE_BUTTON_ITEM = ItemInit.ITEMS.register("more_mossy_stone_button", () -> new BlockItem(MORE_MOSSY_STONE_BUTTON.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_STONE_WALL_ITEM = ItemInit.ITEMS.register("more_mossy_stone_wall", () -> new BlockItem(MORE_MOSSY_STONE_WALL.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_STONE_PRESSURE_PLATE_ITEM = ItemInit.ITEMS.register("more_mossy_stone_pressure_plate", () -> new BlockItem(MORE_MOSSY_STONE_PRESSURE_PLATE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_STONE_SLAB_ITEM = ItemInit.ITEMS.register("more_mossy_stone_slab", () -> new BlockItem(MORE_MOSSY_STONE_SLAB.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_STONE_STAIRS_ITEM = ItemInit.ITEMS.register("more_mossy_stone_stairs", () -> new BlockItem(MORE_MOSSY_STONE_STAIRS.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));

    public static final RegistryObject<BlockItem> MOSSY_ANDESITE_BLOCK_ITEM = ItemInit.ITEMS.register("mossy_andesite", () -> new BlockItem(MOSSY_ANDESITE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_ANDESITE_BUTTON_ITEM = ItemInit.ITEMS.register("mossy_andesite_button", () -> new BlockItem(MOSSY_ANDESITE_BUTTON.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_ANDESITE_WALL_ITEM = ItemInit.ITEMS.register("mossy_andesite_wall", () -> new BlockItem(MOSSY_ANDESITE_WALL.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_ANDESITE_PRESSURE_PLATE_ITEM = ItemInit.ITEMS.register("mossy_andesite_pressure_plate", () -> new BlockItem(MOSSY_ANDESITE_PRESSURE_PLATE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_ANDESITE_SLAB_ITEM = ItemInit.ITEMS.register("mossy_andesite_slab", () -> new BlockItem(MOSSY_ANDESITE_SLAB.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MOSSY_ANDESITE_STAIRS_ITEM = ItemInit.ITEMS.register("mossy_andesite_stairs", () -> new BlockItem(MOSSY_ANDESITE_STAIRS.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));

    public static final RegistryObject<BlockItem> MORE_MOSSY_ANDESITE_BLOCK_ITEM = ItemInit.ITEMS.register("more_mossy_andesite", () -> new BlockItem(MORE_MOSSY_ANDESITE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_ANDESITE_BUTTON_ITEM = ItemInit.ITEMS.register("more_mossy_andesite_button", () -> new BlockItem(MORE_MOSSY_ANDESITE_BUTTON.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_ANDESITE_WALL_ITEM = ItemInit.ITEMS.register("more_mossy_andesite_wall", () -> new BlockItem(MORE_MOSSY_ANDESITE_WALL.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_ANDESITE_PRESSURE_PLATE_ITEM = ItemInit.ITEMS.register("more_mossy_andesite_pressure_plate", () -> new BlockItem(MORE_MOSSY_ANDESITE_PRESSURE_PLATE.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_ANDESITE_SLAB_ITEM = ItemInit.ITEMS.register("more_mossy_andesite_slab", () -> new BlockItem(MORE_MOSSY_ANDESITE_SLAB.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> MORE_MOSSY_ANDESITE_STAIRS_ITEM = ItemInit.ITEMS.register("more_mossy_andesite_stairs", () -> new BlockItem(MORE_MOSSY_ANDESITE_STAIRS.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
/*
    public static final RegistryObject<BlockItem> ACACIA_TORCH_ITEM = ItemInit.ITEMS.register("acacia_torch", () -> new WallOrFloorItem(ACACIA_TORCH.get(), ACACIA_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BIRCH_TORCH_ITEM = ItemInit.ITEMS.register("birch_torch", () -> new WallOrFloorItem(BIRCH_TORCH.get(), BIRCH_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> DARK_OAK_TORCH_ITEM = ItemInit.ITEMS.register("dark_oak_torch", () -> new WallOrFloorItem(DARK_OAK_TORCH.get(), DARK_OAK_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> JUNGLE_TORCH_ITEM = ItemInit.ITEMS.register("jungle_torch", () -> new WallOrFloorItem(JUNGLE_TORCH.get(), JUNGLE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> SPRUCE_TORCH_ITEM = ItemInit.ITEMS.register("spruce_torch", () -> new WallOrFloorItem(SPRUCE_TORCH.get(), SPRUCE_WALL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));

    public static final RegistryObject<BlockItem> ACACIA_SOUL_TORCH_ITEM = ItemInit.ITEMS.register("acacia_soul_torch", () -> new WallOrFloorItem(ACACIA_SOUL_TORCH.get(), ACACIA_WALL_SOUL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> BIRCH_SOUL_TORCH_ITEM = ItemInit.ITEMS.register("birch_soul_torch", () -> new WallOrFloorItem(BIRCH_SOUL_TORCH.get(), BIRCH_WALL_SOUL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> DARK_OAK_SOUL_TORCH_ITEM = ItemInit.ITEMS.register("dark_oak_soul_torch", () -> new WallOrFloorItem(DARK_OAK_SOUL_TORCH.get(), DARK_OAK_WALL_SOUL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> JUNGLE_SOUL_TORCH_ITEM = ItemInit.ITEMS.register("jungle_soul_torch", () -> new WallOrFloorItem(JUNGLE_SOUL_TORCH.get(), JUNGLE_WALL_SOUL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
    public static final RegistryObject<BlockItem> SPRUCE_SOUL_TORCH_ITEM = ItemInit.ITEMS.register("spruce_soul_torch", () -> new WallOrFloorItem(SPRUCE_SOUL_TORCH.get(), SPRUCE_WALL_SOUL_TORCH.get(), new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance)));
*/
    //lists
    /*
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> BUTTONS = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> DOORS = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> FENCES = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> FENCE_GATES = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> LADDERS = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> PRESSURE_PLATES = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> SLABS = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> STAIRS = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> TRAPDOORS = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> TORCHES = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> WALL_TORCHES = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> SOUL_TORCHES = new EnumMap<>(WoodenPlank.class);
    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> WALL_SOUL_TORCHES = new EnumMap<>(WoodenPlank.class);*/

    public static ArrayList<RegistryObject<Block>> LIGHT_BRICKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> MEDIUM_BRICKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> DARK_BRICKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> LIGHT_BRICK_BUTTON = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> MEDIUM_BRICK_BUTTON = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> DARK_BRICK_BUTTON = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> LIGHT_BRICK_WALL = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> MEDIUM_BRICK_WALL = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> DARK_BRICK_WALL = new ArrayList<>();

    //public static ArrayList<RegistryObject<Block>> BRICK_WALLS = new ArrayList<>();
    //public static ArrayList<RegistryObject<Block>> BRICK_PRESSURE_PLATES = new ArrayList<>();
    //public static ArrayList<RegistryObject<Block>> BRICK_SLABS = new ArrayList<>();
    //public static ArrayList<RegistryObject<Block>> BRICK_STAIRS = new ArrayList<>();

    //public static ArrayList<RegistryObject<Block>> STONE_BRICKS = new ArrayList<>();
    //public static ArrayList<RegistryObject<Block>> STONE_BRICK_BUTTONS = new ArrayList<>();
    //public static ArrayList<RegistryObject<Block>> STONE_BRICK_WALLS = new ArrayList<>();
    //public static ArrayList<RegistryObject<Block>> STONE_BRICK_PRESSURE_PLATES = new ArrayList<>();
    //public static ArrayList<RegistryObject<Block>> STONE_BRICK_SLABS = new ArrayList<>();
    //public static ArrayList<RegistryObject<Block>> STONE_BRICK_STAIRS = new ArrayList<>();

    //public static ArrayList<RegistryObject<Block>> CLAY_BLOCKS = new ArrayList<>();

    public static ArrayList<RegistryObject<Block>> LIGHT_LOGS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> MEDIUM_LOGS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> DARK_LOGS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> LIGHT_PLANKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> MEDIUM_PLANKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> DARK_PLANKS = new ArrayList<>();

    static {
        for (DyeColor color : DyeColor.values()) {

            LIGHT_BRICKS.add(register(color.getTranslationKey() + "_light_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            MEDIUM_BRICKS.add(register(color.getTranslationKey() + "_medium_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            DARK_BRICKS.add(register(color.getTranslationKey() + "_dark_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            LIGHT_BRICK_BUTTON.add(register(color.getTranslationKey() + "_light_brick_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            MEDIUM_BRICK_BUTTON.add(register(color.getTranslationKey() + "_medium_brick_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            DARK_BRICK_BUTTON.add(register(color.getTranslationKey() + "_dark_brick_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            LIGHT_BRICK_WALL.add(register(color.getTranslationKey() + "_light_brick_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            MEDIUM_BRICK_WALL.add(register(color.getTranslationKey() + "_medium_brick_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            DARK_BRICK_WALL.add(register(color.getTranslationKey() + "_dark_brick_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));

            //BRICK_PRESSURE_PLATES.add(register(color.getTranslationKey() + "_brick_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            //BRICK_SLABS.add(register(color.getTranslationKey() + "_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            //BRICK_STAIRS.add(register(color.getTranslationKey() + "_brick_stairs", () -> new StairsBlock(Blocks.BRICKS.getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));

            //STONE_BRICKS.add(register(color.getTranslationKey() + "_stone_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            //STONE_BRICK_BUTTONS.add(register(color.getTranslationKey() + "_stone_brick_button", () -> new ModStoneButtonBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            //STONE_BRICK_WALLS.add(register(color.getTranslationKey() + "_stone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            //STONE_BRICK_PRESSURE_PLATES.add(register(color.getTranslationKey() + "_stone_brick_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            //STONE_BRICK_SLABS.add(register(color.getTranslationKey() + "_stone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            //STONE_BRICK_STAIRS.add(register(color.getTranslationKey() + "_stone_brick_stairs", () -> new StairsBlock(Blocks.STONE_BRICKS.getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));

            //CLAY_BLOCKS.add(register(color.getTranslationKey() + "_clay", () -> new Block(AbstractBlock.Properties.create(Material.CLAY).sound(SoundType.GROUND).hardnessAndResistance(0.6F, 0.6F).harvestTool(ToolType.SHOVEL).harvestLevel(0))));

            LIGHT_LOGS.add(register(color.getTranslationKey() + "_light_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))));
            MEDIUM_LOGS.add(register(color.getTranslationKey() + "_medium_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))));
            DARK_LOGS.add(register(color.getTranslationKey() + "_dark_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))));
            LIGHT_PLANKS.add(register(color.getTranslationKey() + "_light_planks", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))));
            MEDIUM_PLANKS.add(register(color.getTranslationKey() + "_medium_planks", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))));
            DARK_PLANKS.add(register(color.getTranslationKey() + "_dark_planks", () -> new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))));

            /*for (WoodenPlank plank : WoodenPlank.values()) {
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
                                () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
                FENCE_GATES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_fence_gate",
                                () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
                ArrayList<RegistryObject<Block>> ladders = LADDERS.getOrDefault(plank, new ArrayList<>());
                ladders.add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_ladder",
                        () -> new ModLadderBlock(AbstractBlock.Properties.from(Blocks.LADDER))
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
                TORCHES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_torch",
                                () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 14), ParticleTypes.FLAME)
                        ));
                WALL_TORCHES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_wall_torch",
                                () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(TORCHES.get()).setLightLevel((state) -> 14), ParticleTypes.FLAME)
                        ));
                SOUL_TORCHES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_soul_torch",
                                () -> new TorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME)
                        ));
                WALL_SOUL_TORCHES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_wall_soul_torch",
                                () -> new WallTorchBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).sound(SoundType.WOOD).doesNotBlockMovement().zeroHardnessAndResistance().lootFrom(SOUL_TORCHES.get()).setLightLevel((state) -> 10), ParticleTypes.SOUL_FIRE_FLAME)
                        ));
            }*/
        }
    }
}
