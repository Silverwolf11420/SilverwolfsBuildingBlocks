package mod.silverwolfs.silverwolfsbuildingblocks.datagen;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.init.BlockInit;
import mod.silverwolfs.silverwolfsbuildingblocks.init.StairsInit;
import mod.silverwolfs.silverwolfsbuildingblocks.util.WoodenPlank;
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
		for (DyeColor color : DyeColor.values()) {


			/*for (WoodenPlank plank : WoodenPlank.values()) {
				stairsBlock(StairsInit.WOODEN_STAIRS.get(plank).get(color.getId()), new ResourceLocation(SilverwolfsBuildingBlocks.MOD_ID, color.getTranslationKey() + "_stained_" + plank.name().toLowerCase() + "_planks"));
			}*/
		}
	}
}
