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

}