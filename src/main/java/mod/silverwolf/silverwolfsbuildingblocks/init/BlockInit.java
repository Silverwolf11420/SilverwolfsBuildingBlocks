package mod.silverwolf.silverwolfsbuildingblocks.init;

import mod.silverwolf.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MODID);

    public static final RegistryObject<Block> THATCH_BLOCK = BLOCKS.register("thatch_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).strength(0.5f, 0.5f).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<DoorBlock> THATCH_DOOR = BLOCKS.register("thatch_door", () -> new DoorBlock(new BlockSetType("thatch"), BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).strength(0.5f, 0.5f).sound(SoundType.WET_GRASS)));


}