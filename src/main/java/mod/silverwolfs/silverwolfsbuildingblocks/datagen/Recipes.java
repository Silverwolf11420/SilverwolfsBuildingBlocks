package mod.silverwolfs.silverwolfsbuildingblocks.datagen;

import mod.silverwolfs.silverwolfsbuildingblocks.init.BlockInit;
import mod.silverwolfs.silverwolfsbuildingblocks.util.WoodenPlank;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.DyeColor;
import net.minecraft.item.DyeItem;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		super.registerRecipes(consumer);
		/*for (DyeColor color : DyeColor.values()) {
			// Loop add items, which only has 16 colours.

			ShapelessRecipeBuilder.shapelessRecipe(BlockInit.CLAY_BLOCKS.get(color.getId()).get(), 1).addIngredient(Blocks.CLAY).addIngredient(DyeItem.getItem(color)).setGroup("colored_clay").build(consumer);

			for (WoodenPlank plank : WoodenPlank.values()) {
				ShapelessRecipeBuilder.shapelessRecipe(BlockInit.LOGS.get(plank).get(color.getId()).get(), 1).addIngredient(Blocks.ACACIA_LOG).addIngredient(DyeItem.getItem(color)).setGroup("colored_" + plank.name().toLowerCase() + "_log").build(consumer);

				//ShapedRecipeBuilder.shapedRecipe(FencesWallsInit.FENCES.get(plank).get(color.getId()).get(), 3).key('x', BlockInit.BLACK_STAINED_ACACIA_PLANKS.get()).key('y', ItemInit.BLACK_ACACIA_STICK.get()).patternLine("xyx").patternLine("xyx").setGroup("coloured_" + plank.name().toLowerCase() + "_fence").build(consumer);
			}
		}*/
	}
}
