package mod.silverwolfs.silverwolfsbuildingblocks.datagen;

import net.minecraft.data.*;
import net.minecraft.item.DyeColor;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		super.registerRecipes(consumer);
		for (DyeColor color : DyeColor.values()) {
			// Loop add items, which only has 16 colours.

			/*for (WoodenPlank plank : WoodenPlank.values()) {
				ShapedRecipeBuilder.shapedRecipe(FencesWallsInit.FENCES.get(plank).get(color.getId()).get(), 3).key('x', BlockInit.BLACK_STAINED_ACACIA_PLANKS.get()).key('y', ItemInit.BLACK_ACACIA_STICK.get()).patternLine("xyx").patternLine("xyx").setGroup("coloured_" + plank.name().toLowerCase() + "_fence").build(consumer);
			}*/
		}
	}
}
