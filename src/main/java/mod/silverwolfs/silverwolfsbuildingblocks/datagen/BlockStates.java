package mod.silverwolfs.silverwolfsbuildingblocks.datagen;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.init.BlockInit;
import mod.silverwolfs.silverwolfsbuildingblocks.util.WoodenPlank;
import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {


	public BlockStates(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
		super(gen, modid, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		/*for (DyeColor color : DyeColor.values()) {

			simpleBlock(BlockInit.CLAY_BLOCKS.get(color.getId()), new ResourceLocation(SilverwolfsBuildingBlocks.MOD_ID, color.getTranslationKey() + "_clay"));

			for (WoodenPlank plank : WoodenPlank.values()) {
				logBlock(BlockInit.LOGS.get(plank).get(color.getId()), new ResourceLocation(SilverwolfsBuildingBlocks.MOD_ID, color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_log"));
			}
		}*/
	}
}
