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
    public static final RegistryObject<ButtonBlock> BAMBOO_BUTTON = BLOCKS.register("bamboo_button", () -> new ButtonBlock(BlockSetType.BAMBOO, 30, BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noCollission()));
    public static final RegistryObject<DoorBlock> BAMBOO_DOOR = BLOCKS.register("bamboo_door", () -> new DoorBlock(new BlockSetType("bamboo"), BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noOcclusion()));
    public static final RegistryObject<FenceBlock> BAMBOO_FENCE = BLOCKS.register("bamboo_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<FenceGateBlock> BAMBOO_FENCE_GATE = BLOCKS.register("bamboo_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<LadderBlock> BAMBOO_LADDER = BLOCKS.register("bamboo_ladder", () -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noOcclusion()));
    public static final RegistryObject<PressurePlateBlock>  BAMBOO_PRESSURE_PLATE = BLOCKS.register("bamboo_pressure_plate", () -> new PressurePlateBlock(new BlockSetType("bamboo"), BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noCollission()));
    public static final RegistryObject<SlabBlock>  BAMBOO_SLAB = BLOCKS.register("bamboo_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<StairBlock> BAMBOO_STAIRS = BLOCKS.register("bamboo_stairs", () -> new StairBlock(BlockInit.BAMBOO_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO)));
    public static final RegistryObject<TrapDoorBlock> BAMBOO_TRAPDOOR = BLOCKS.register("bamboo_trapdoor", () -> new TrapDoorBlock(BlockSetType.BAMBOO, BlockBehaviour.Properties.ofFullCopy(BAMBOO_BLOCK.get()).strength(0.5f).sound(SoundType.BAMBOO).noOcclusion()));


}