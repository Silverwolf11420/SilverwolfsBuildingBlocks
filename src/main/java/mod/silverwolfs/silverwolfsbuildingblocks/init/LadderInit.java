package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.object.blocks.ModLadderBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LadderInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MOD_ID);

    //Ladder
    public static final RegistryObject<ModLadderBlock> BAMBOO_LADDER = BLOCKS.register("bamboo_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> THATCH_LADDER = BLOCKS.register("thatch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));

    public static final RegistryObject<ModLadderBlock> ACACIA_LADDER = BLOCKS.register("acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLACK_ACACIA_LADDER = BLOCKS.register("black_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLUE_ACACIA_LADDER = BLOCKS.register("blue_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BROWN_ACACIA_LADDER = BLOCKS.register("brown_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> CYAN_ACACIA_LADDER = BLOCKS.register("cyan_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GRAY_ACACIA_LADDER = BLOCKS.register("gray_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GREEN_ACACIA_LADDER = BLOCKS.register("green_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_BLUE_ACACIA_LADDER = BLOCKS.register("light_blue_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GRAY_ACACIA_LADDER = BLOCKS.register("light_gray_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GREEN_ACACIA_LADDER = BLOCKS.register("light_green_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> MAGENTA_ACACIA_LADDER = BLOCKS.register("magenta_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> ORANGE_ACACIA_LADDER = BLOCKS.register("orange_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PINK_ACACIA_LADDER = BLOCKS.register("pink_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PURPLE_ACACIA_LADDER = BLOCKS.register("purple_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> RED_ACACIA_LADDER = BLOCKS.register("red_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> WHITE_ACACIA_LADDER = BLOCKS.register("white_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> YELLOW_ACACIA_LADDER = BLOCKS.register("yellow_acacia_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));

    public static final RegistryObject<ModLadderBlock> BIRCH_LADDER = BLOCKS.register("birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLACK_BIRCH_LADDER = BLOCKS.register("black_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLUE_BIRCH_LADDER = BLOCKS.register("blue_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BROWN_BIRCH_LADDER = BLOCKS.register("brown_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> CYAN_BIRCH_LADDER = BLOCKS.register("cyan_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GRAY_BIRCH_LADDER = BLOCKS.register("gray_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GREEN_BIRCH_LADDER = BLOCKS.register("green_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_BLUE_BIRCH_LADDER = BLOCKS.register("light_blue_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GRAY_BIRCH_LADDER = BLOCKS.register("light_gray_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GREEN_BIRCH_LADDER = BLOCKS.register("light_green_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> MAGENTA_BIRCH_LADDER = BLOCKS.register("magenta_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> ORANGE_BIRCH_LADDER = BLOCKS.register("orange_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PINK_BIRCH_LADDER = BLOCKS.register("pink_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PURPLE_BIRCH_LADDER = BLOCKS.register("purple_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> RED_BIRCH_LADDER = BLOCKS.register("red_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> WHITE_BIRCH_LADDER = BLOCKS.register("white_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> YELLOW_BIRCH_LADDER = BLOCKS.register("yellow_birch_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));

    public static final RegistryObject<ModLadderBlock> DARK_OAK_LADDER = BLOCKS.register("dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLACK_DARK_OAK_LADDER = BLOCKS.register("black_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLUE_DARK_OAK_LADDER = BLOCKS.register("blue_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BROWN_DARK_OAK_LADDER = BLOCKS.register("brown_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> CYAN_DARK_OAK_LADDER = BLOCKS.register("cyan_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GRAY_DARK_OAK_LADDER = BLOCKS.register("gray_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GREEN_DARK_OAK_LADDER = BLOCKS.register("green_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_BLUE_DARK_OAK_LADDER = BLOCKS.register("light_blue_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GRAY_DARK_OAK_LADDER = BLOCKS.register("light_gray_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GREEN_DARK_OAK_LADDER = BLOCKS.register("light_green_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> MAGENTA_DARK_OAK_LADDER = BLOCKS.register("magenta_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> ORANGE_DARK_OAK_LADDER = BLOCKS.register("orange_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PINK_DARK_OAK_LADDER = BLOCKS.register("pink_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PURPLE_DARK_OAK_LADDER = BLOCKS.register("purple_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> RED_DARK_OAK_LADDER = BLOCKS.register("red_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> WHITE_DARK_OAK_LADDER = BLOCKS.register("white_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> YELLOW_DARK_OAK_LADDER = BLOCKS.register("yellow_dark_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));

    public static final RegistryObject<ModLadderBlock> JUNGLE_LADDER = BLOCKS.register("jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLACK_JUNGLE_LADDER = BLOCKS.register("black_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLUE_JUNGLE_LADDER = BLOCKS.register("blue_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BROWN_JUNGLE_LADDER = BLOCKS.register("brown_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> CYAN_JUNGLE_LADDER = BLOCKS.register("cyan_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GRAY_JUNGLE_LADDER = BLOCKS.register("gray_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GREEN_JUNGLE_LADDER = BLOCKS.register("green_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_BLUE_JUNGLE_LADDER = BLOCKS.register("light_blue_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GRAY_JUNGLE_LADDER = BLOCKS.register("light_gray_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GREEN_JUNGLE_LADDER = BLOCKS.register("light_green_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> MAGENTA_JUNGLE_LADDER = BLOCKS.register("magenta_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> ORANGE_JUNGLE_LADDER = BLOCKS.register("orange_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PINK_JUNGLE_LADDER = BLOCKS.register("pink_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PURPLE_JUNGLE_LADDER = BLOCKS.register("purple_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> RED_JUNGLE_LADDER = BLOCKS.register("red_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> WHITE_JUNGLE_LADDER = BLOCKS.register("white_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> YELLOW_JUNGLE_LADDER = BLOCKS.register("yellow_jungle_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));

    public static final RegistryObject<ModLadderBlock> BLACK_OAK_LADDER = BLOCKS.register("black_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLUE_OAK_LADDER = BLOCKS.register("blue_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BROWN_OAK_LADDER = BLOCKS.register("brown_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> CYAN_OAK_LADDER = BLOCKS.register("cyan_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GRAY_OAK_LADDER = BLOCKS.register("gray_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GREEN_OAK_LADDER = BLOCKS.register("green_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_BLUE_OAK_LADDER = BLOCKS.register("light_blue_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GRAY_OAK_LADDER = BLOCKS.register("light_gray_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GREEN_OAK_LADDER = BLOCKS.register("light_green_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> MAGENTA_OAK_LADDER = BLOCKS.register("magenta_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> ORANGE_OAK_LADDER = BLOCKS.register("orange_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PINK_OAK_LADDER = BLOCKS.register("pink_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PURPLE_OAK_LADDER = BLOCKS.register("purple_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> RED_OAK_LADDER = BLOCKS.register("red_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> WHITE_OAK_LADDER = BLOCKS.register("white_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> YELLOW_OAK_LADDER = BLOCKS.register("yellow_oak_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));

    public static final RegistryObject<ModLadderBlock> SPRUCE_LADDER = BLOCKS.register("spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLACK_SPRUCE_LADDER = BLOCKS.register("black_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BLUE_SPRUCE_LADDER = BLOCKS.register("blue_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> BROWN_SPRUCE_LADDER = BLOCKS.register("brown_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> CYAN_SPRUCE_LADDER = BLOCKS.register("cyan_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GRAY_SPRUCE_LADDER = BLOCKS.register("gray_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> GREEN_SPRUCE_LADDER = BLOCKS.register("green_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_BLUE_SPRUCE_LADDER = BLOCKS.register("light_blue_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GRAY_SPRUCE_LADDER = BLOCKS.register("light_gray_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> LIGHT_GREEN_SPRUCE_LADDER = BLOCKS.register("light_green_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> MAGENTA_SPRUCE_LADDER = BLOCKS.register("magenta_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> ORANGE_SPRUCE_LADDER = BLOCKS.register("orange_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PINK_SPRUCE_LADDER = BLOCKS.register("pink_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> PURPLE_SPRUCE_LADDER = BLOCKS.register("purple_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> RED_SPRUCE_LADDER = BLOCKS.register("red_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> WHITE_SPRUCE_LADDER = BLOCKS.register("white_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<ModLadderBlock> YELLOW_SPRUCE_LADDER = BLOCKS.register("yellow_spruce_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));

}
