package mod.silverwolf.silverwolfsbuildingblocks.init;

import mod.silverwolf.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MODID);

    public static final RegistryObject<Block> BAMBOO_BLOCK = BLOCKS.register("bamboo_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<ButtonBlock> BAMBOO_BUTTON = BLOCKS.register("bamboo_button", () -> new ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noCollission()));
    public static final RegistryObject<DoorBlock> BAMBOO_DOOR = BLOCKS.register("bamboo_door", () -> new DoorBlock(new BlockSetType("oak"), BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noOcclusion()));
    public static final RegistryObject<FenceBlock> BAMBOO_FENCE = BLOCKS.register("bamboo_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<FenceGateBlock> BAMBOO_FENCE_GATE = BLOCKS.register("bamboo_fence_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<LadderBlock> BAMBOO_LADDER = BLOCKS.register("bamboo_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noOcclusion()));
    public static final RegistryObject<PressurePlateBlock>  BAMBOO_PRESSURE_PLATE = BLOCKS.register("bamboo_pressure_plate", () -> new PressurePlateBlock(new BlockSetType("oak"), BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noCollission()));
    public static final RegistryObject<SlabBlock>  BAMBOO_SLAB = BLOCKS.register("bamboo_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<StairBlock> BAMBOO_STAIRS = BLOCKS.register("bamboo_stairs", () -> new StairBlock(BlockInit.BAMBOO_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<TrapDoorBlock> BAMBOO_TRAPDOOR = BLOCKS.register("bamboo_trapdoor", () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noOcclusion()));

    public static final RegistryObject<Block> THATCH_BLOCK = BLOCKS.register("thatch_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).strength(0.5f).sound(SoundType.CROP)));
    public static final RegistryObject<ButtonBlock> THATCH_BUTTON = BLOCKS.register("thatch_button", () -> new ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP).noCollission()));
    public static final RegistryObject<DoorBlock> THATCH_DOOR = BLOCKS.register("thatch_door", () -> new DoorBlock(new BlockSetType("oak"), BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP).noOcclusion()));
    public static final RegistryObject<FenceBlock> THATCH_FENCE = BLOCKS.register("thatch_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP)));
    public static final RegistryObject<FenceGateBlock> THATCH_FENCE_GATE = BLOCKS.register("thatch_fence_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP)));
    public static final RegistryObject<LadderBlock> THATCH_LADDER = BLOCKS.register("thatch_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP).noOcclusion()));
    public static final RegistryObject<PressurePlateBlock>  THATCH_PRESSURE_PLATE = BLOCKS.register("thatch_pressure_plate", () -> new PressurePlateBlock(new BlockSetType("oak"), BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP).noCollission()));
    public static final RegistryObject<SlabBlock>  THATCH_SLAB = BLOCKS.register("thatch_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP)));
    public static final RegistryObject<StairBlock> THATCH_STAIRS = BLOCKS.register("thatch_stairs", () -> new StairBlock(BlockInit.THATCH_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP)));
    public static final RegistryObject<TrapDoorBlock> THATCH_TRAPDOOR = BLOCKS.register("thatch_trapdoor", () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(THATCH_BLOCK.get()).strength(0.5f).sound(SoundType.CROP).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_BEAM_UP = BLOCKS.register("acacia_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_BEAM_MIDDLE = BLOCKS.register("acacia_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_BEAM_DOWN = BLOCKS.register("acacia_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_BEAM_UP = BLOCKS.register("birch_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_BEAM_MIDDLE = BLOCKS.register("birch_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_BEAM_DOWN = BLOCKS.register("birch_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_BEAM_UP = BLOCKS.register("cherry_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_BEAM_MIDDLE = BLOCKS.register("cherry_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_BEAM_DOWN = BLOCKS.register("cherry_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CRIMSON_BEAM_UP = BLOCKS.register("crimson_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_HYPHAE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CRIMSON_BEAM_MIDDLE = BLOCKS.register("crimson_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_HYPHAE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CRIMSON_BEAM_DOWN = BLOCKS.register("crimson_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_HYPHAE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_UP = BLOCKS.register("dark_oak_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_MIDDLE = BLOCKS.register("dark_oak_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_DOWN = BLOCKS.register("dark_oak_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_BEAM_UP = BLOCKS.register("jungle_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_BEAM_MIDDLE = BLOCKS.register("jungle_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_BEAM_DOWN = BLOCKS.register("jungle_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MANGROVE_BEAM_UP = BLOCKS.register("mangrove_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MANGROVE_BEAM_MIDDLE = BLOCKS.register("mangrove_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MANGROVE_BEAM_DOWN = BLOCKS.register("mangrove_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OAK_BEAM_UP = BLOCKS.register("oak_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OAK_BEAM_MIDDLE = BLOCKS.register("oak_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OAK_BEAM_DOWN = BLOCKS.register("oak_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_BEAM_UP = BLOCKS.register("spruce_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_BEAM_MIDDLE = BLOCKS.register("spruce_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_BEAM_DOWN = BLOCKS.register("spruce_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_BEAM_UP = BLOCKS.register("warped_beam_up", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_BEAM_MIDDLE = BLOCKS.register("warped_beam_middle", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_BEAM_DOWN = BLOCKS.register("warped_beam_down", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HYPHAE).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<LadderBlock> ACACIA_LADDER = BLOCKS.register("acacia_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> BIRCH_LADDER = BLOCKS.register("birch_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> CHERRY_LADDER = BLOCKS.register("cherry_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> CRIMSON_LADDER = BLOCKS.register("crimson_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> DARK_OAK_LADDER = BLOCKS.register("dark_oak_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> JUNGLE_LADDER = BLOCKS.register("jungle_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> MANGROVE_LADDER = BLOCKS.register("mangrove_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> OAK_LADDER = BLOCKS.register("oak_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> SPRUCE_LADDER = BLOCKS.register("spruce_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));
    public static final RegistryObject<LadderBlock> WARPED_LADDER = BLOCKS.register("warped_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).strength(0.5f).sound(SoundType.LADDER).noOcclusion()));

}