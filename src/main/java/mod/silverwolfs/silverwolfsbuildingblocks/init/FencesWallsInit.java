package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FencesWallsInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MOD_ID);

    public static final RegistryObject<Block> BAMBOO_FENCE = BLOCKS.register("bamboo_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> BAMBOO_FENCE_GATE = BLOCKS.register("bamboo_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> THATCH_FENCE = BLOCKS.register("thatch_fence", () -> new FenceBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> THATCH_FENCE_GATE = BLOCKS.register("thatch_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F)));

    public static final RegistryObject<Block> MOSSY_STONE_WALL = BLOCKS.register("mossy_stone_wall", () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0)));


}
