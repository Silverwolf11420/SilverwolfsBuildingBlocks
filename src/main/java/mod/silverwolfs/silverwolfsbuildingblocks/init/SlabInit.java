package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SlabInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MOD_ID);

    //Slab
    public static final RegistryObject<Block> THATCH_SLAB = BLOCKS.register("thatch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_SLAB = BLOCKS.register("bamboo_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> MOSSY_STONE_SLAB = BLOCKS.register("mossy_stone_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MOSSY_STONE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_SLAB = BLOCKS.register("more_mossy_stone_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MORE_MOSSY_STONE.get())));
    public static final RegistryObject<Block> MOSSY_ANDESITE_SLAB = BLOCKS.register("mossy_andesite_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MOSSY_ANDESITE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_SLAB = BLOCKS.register("more_mossy_andesite_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MORE_MOSSY_ANDESITE.get())));

    public static final RegistryObject<Block> BLACK_BRICK_SLAB = BLOCKS.register("black_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLACK_BRICKS.get())));
    public static final RegistryObject<Block> BLUE_BRICK_SLAB = BLOCKS.register("blue_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLUE_BRICKS.get())));
    public static final RegistryObject<Block> BROWN_BRICK_SLAB = BLOCKS.register("brown_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BROWN_BRICKS.get())));
    public static final RegistryObject<Block> CYAN_BRICK_SLAB = BLOCKS.register("cyan_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CYAN_BRICKS.get())));
    public static final RegistryObject<Block> GRAY_BRICK_SLAB = BLOCKS.register("gray_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GRAY_BRICKS.get())));
    public static final RegistryObject<Block> GREEN_BRICK_SLAB = BLOCKS.register("green_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GREEN_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_SLAB = BLOCKS.register("light_blue_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_BLUE_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_SLAB = BLOCKS.register("light_gray_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GRAY_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_BRICK_SLAB = BLOCKS.register("light_green_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GREEN_BRICKS.get())));
    public static final RegistryObject<Block> MAGENTA_BRICK_SLAB = BLOCKS.register("magenta_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAGENTA_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_BRICK_SLAB = BLOCKS.register("orange_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.ORANGE_BRICKS.get())));
    public static final RegistryObject<Block> PINK_BRICK_SLAB = BLOCKS.register("pink_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PINK_BRICKS.get())));
    public static final RegistryObject<Block> PURPLE_BRICK_SLAB = BLOCKS.register("purple_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PURPLE_BRICKS.get())));
    public static final RegistryObject<Block> RED_BRICK_SLAB = BLOCKS.register("red_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RED_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_BRICK_SLAB = BLOCKS.register("white_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WHITE_BRICKS.get())));
    public static final RegistryObject<Block> YELLOW_BRICK_SLAB = BLOCKS.register("yellow_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.YELLOW_BRICKS.get())));

    public static final RegistryObject<Block> BLACK_STONE_BRICK_SLAB = BLOCKS.register("black_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLACK_STONE_BRICKS.get())));
    public static final RegistryObject<Block> BLUE_STONE_BRICK_SLAB = BLOCKS.register("blue_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLUE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> BROWN_STONE_BRICK_SLAB = BLOCKS.register("brown_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BROWN_STONE_BRICKS.get())));
    public static final RegistryObject<Block> CYAN_STONE_BRICK_SLAB = BLOCKS.register("cyan_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CYAN_STONE_BRICKS.get())));
    public static final RegistryObject<Block> GRAY_STONE_BRICK_SLAB = BLOCKS.register("gray_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GRAY_STONE_BRICKS.get())));
    public static final RegistryObject<Block> GREEN_STONE_BRICK_SLAB = BLOCKS.register("green_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GREEN_STONE_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_STONE_BLUE_BRICK_SLAB = BLOCKS.register("light_blue_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_BLUE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_STONE_GRAY_BRICK_SLAB = BLOCKS.register("light_gray_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GRAY_STONE_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_STONE_GREEN_BRICK_SLAB = BLOCKS.register("light_green_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GREEN_STONE_BRICKS.get())));
    public static final RegistryObject<Block> MAGENTA_STONE_BRICK_SLAB = BLOCKS.register("magenta_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAGENTA_STONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_STONE_BRICK_SLAB = BLOCKS.register("orange_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.ORANGE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> PINK_STONE_BRICK_SLAB = BLOCKS.register("pink_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PINK_STONE_BRICKS.get())));
    public static final RegistryObject<Block> PURPLE_STONE_BRICK_SLAB = BLOCKS.register("purple_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PURPLE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> RED_STONE_BRICK_SLAB = BLOCKS.register("red_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RED_STONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_STONE_BRICK_SLAB = BLOCKS.register("white_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WHITE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> YELLOW_STONE_BRICK_SLAB = BLOCKS.register("yellow_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.YELLOW_STONE_BRICKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_ACACIA_SLAB = BLOCKS.register("black_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLACK_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_ACACIA_SLAB = BLOCKS.register("blue_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLUE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_ACACIA_SLAB = BLOCKS.register("brown_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BROWN_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_ACACIA_SLAB = BLOCKS.register("cyan_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CYAN_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_ACACIA_SLAB = BLOCKS.register("gray_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GRAY_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_ACACIA_SLAB = BLOCKS.register("green_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GREEN_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_ACACIA_SLAB = BLOCKS.register("light_blue_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_ACACIA_SLAB = BLOCKS.register("light_gray_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_ACACIA_SLAB = BLOCKS.register("light_green_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_ACACIA_SLAB = BLOCKS.register("magenta_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAGENTA_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_ACACIA_SLAB = BLOCKS.register("orange_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.ORANGE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_ACACIA_SLAB = BLOCKS.register("pink_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PINK_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_ACACIA_SLAB = BLOCKS.register("purple_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PURPLE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_ACACIA_SLAB = BLOCKS.register("red_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RED_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_ACACIA_SLAB = BLOCKS.register("white_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WHITE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_ACACIA_SLAB = BLOCKS.register("yellow_stained_acacia_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.YELLOW_STAINED_ACACIA_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_BIRCH_SLAB = BLOCKS.register("black_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLACK_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_BIRCH_SLAB = BLOCKS.register("blue_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLUE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_BIRCH_SLAB = BLOCKS.register("brown_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BROWN_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_BIRCH_SLAB = BLOCKS.register("cyan_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CYAN_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_BIRCH_SLAB = BLOCKS.register("gray_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GRAY_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_BIRCH_SLAB = BLOCKS.register("green_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GREEN_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BIRCH_SLAB = BLOCKS.register("light_blue_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BIRCH_SLAB = BLOCKS.register("light_gray_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_BIRCH_SLAB = BLOCKS.register("light_green_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_BIRCH_SLAB = BLOCKS.register("magenta_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAGENTA_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_BIRCH_SLAB = BLOCKS.register("orange_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.ORANGE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_BIRCH_SLAB = BLOCKS.register("pink_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PINK_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_BIRCH_SLAB = BLOCKS.register("purple_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PURPLE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_BIRCH_SLAB = BLOCKS.register("red_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RED_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_BIRCH_SLAB = BLOCKS.register("white_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WHITE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_BIRCH_SLAB = BLOCKS.register("yellow_stained_birch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.YELLOW_STAINED_BIRCH_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_DARK_OAK_SLAB = BLOCKS.register("black_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLACK_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_DARK_OAK_SLAB = BLOCKS.register("blue_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLUE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_DARK_OAK_SLAB = BLOCKS.register("brown_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BROWN_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_DARK_OAK_SLAB = BLOCKS.register("cyan_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CYAN_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_DARK_OAK_SLAB = BLOCKS.register("gray_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GRAY_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_DARK_OAK_SLAB = BLOCKS.register("green_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GREEN_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DARK_OAK_SLAB = BLOCKS.register("light_blue_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DARK_OAK_SLAB = BLOCKS.register("light_gray_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_DARK_OAK_SLAB = BLOCKS.register("light_green_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_DARK_OAK_SLAB = BLOCKS.register("magenta_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAGENTA_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_DARK_OAK_SLAB = BLOCKS.register("orange_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.ORANGE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_DARK_OAK_SLAB = BLOCKS.register("pink_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PINK_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_DARK_OAK_SLAB = BLOCKS.register("purple_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PURPLE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_DARK_OAK_SLAB = BLOCKS.register("red_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RED_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_DARK_OAK_SLAB = BLOCKS.register("white_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WHITE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_DARK_OAK_SLAB = BLOCKS.register("yellow_stained_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.YELLOW_STAINED_DARK_OAK_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_JUNGLE_SLAB = BLOCKS.register("black_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLACK_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_JUNGLE_SLAB = BLOCKS.register("blue_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLUE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_JUNGLE_SLAB = BLOCKS.register("brown_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BROWN_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_JUNGLE_SLAB = BLOCKS.register("cyan_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CYAN_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_JUNGLE_SLAB = BLOCKS.register("gray_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GRAY_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_JUNGLE_SLAB = BLOCKS.register("green_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GREEN_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_JUNGLE_SLAB = BLOCKS.register("light_blue_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_JUNGLE_SLAB = BLOCKS.register("light_gray_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_JUNGLE_SLAB = BLOCKS.register("light_green_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_JUNGLE_SLAB = BLOCKS.register("magenta_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAGENTA_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_JUNGLE_SLAB = BLOCKS.register("orange_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.ORANGE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_JUNGLE_SLAB = BLOCKS.register("pink_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PINK_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_JUNGLE_SLAB = BLOCKS.register("purple_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PURPLE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_JUNGLE_SLAB = BLOCKS.register("red_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RED_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_JUNGLE_SLAB = BLOCKS.register("white_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WHITE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_JUNGLE_SLAB = BLOCKS.register("yellow_stained_jungle_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.YELLOW_STAINED_JUNGLE_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_OAK_SLAB = BLOCKS.register("black_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLACK_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_OAK_SLAB = BLOCKS.register("blue_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLUE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_OAK_SLAB = BLOCKS.register("brown_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BROWN_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_OAK_SLAB = BLOCKS.register("cyan_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CYAN_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_OAK_SLAB = BLOCKS.register("gray_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GRAY_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_OAK_SLAB = BLOCKS.register("green_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GREEN_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_OAK_SLAB = BLOCKS.register("light_blue_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_OAK_SLAB = BLOCKS.register("light_gray_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_OAK_SLAB = BLOCKS.register("light_green_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_OAK_SLAB = BLOCKS.register("magenta_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAGENTA_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_OAK_SLAB = BLOCKS.register("orange_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.ORANGE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_OAK_SLAB = BLOCKS.register("pink_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PINK_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_OAK_SLAB = BLOCKS.register("purple_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PURPLE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_OAK_SLAB = BLOCKS.register("red_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RED_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_OAK_SLAB = BLOCKS.register("white_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WHITE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_OAK_SLAB = BLOCKS.register("yellow_stained_oak_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.YELLOW_STAINED_OAK_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_SPRUCE_SLAB = BLOCKS.register("black_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLACK_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_SPRUCE_SLAB = BLOCKS.register("blue_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BLUE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_SPRUCE_SLAB = BLOCKS.register("brown_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BROWN_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_SPRUCE_SLAB = BLOCKS.register("cyan_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.CYAN_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_SPRUCE_SLAB = BLOCKS.register("gray_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GRAY_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_SPRUCE_SLAB = BLOCKS.register("green_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.GREEN_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_SPRUCE_SLAB = BLOCKS.register("light_blue_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_SPRUCE_SLAB = BLOCKS.register("light_gray_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_SPRUCE_SLAB = BLOCKS.register("light_green_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_SPRUCE_SLAB = BLOCKS.register("magenta_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAGENTA_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_SPRUCE_SLAB = BLOCKS.register("orange_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.ORANGE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_SPRUCE_SLAB = BLOCKS.register("pink_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PINK_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_SPRUCE_SLAB = BLOCKS.register("purple_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.PURPLE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_SPRUCE_SLAB = BLOCKS.register("red_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RED_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_SPRUCE_SLAB = BLOCKS.register("white_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.WHITE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_SPRUCE_SLAB = BLOCKS.register("yellow_stained_spruce_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.YELLOW_STAINED_SPRUCE_PLANKS.get())));

}
