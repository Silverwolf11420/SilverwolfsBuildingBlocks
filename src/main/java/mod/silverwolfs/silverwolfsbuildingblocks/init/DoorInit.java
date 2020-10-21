package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.object.blocks.ModDoors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DoorInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MOD_ID);

    public static final RegistryObject<Block> THATCH_DOOR = BLOCKS.register("thatch_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> BAMBOO_DOOR = BLOCKS.register("bamboo_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> BLACK_STAINED_ACACIA_DOOR = BLOCKS.register("black_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> BLUE_STAINED_ACACIA_DOOR = BLOCKS.register("blue_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> BROWN_STAINED_ACACIA_DOOR = BLOCKS.register("brown_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> CYAN_STAINED_ACACIA_DOOR = BLOCKS.register("cyan_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> GRAY_STAINED_ACACIA_DOOR = BLOCKS.register("gray_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> GREEN_STAINED_ACACIA_DOOR = BLOCKS.register("green_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_ACACIA_DOOR = BLOCKS.register("light_blue_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_ACACIA_DOOR = BLOCKS.register("light_gray_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_ACACIA_DOOR = BLOCKS.register("light_green_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> MAGENTA_STAINED_ACACIA_DOOR = BLOCKS.register("magenta_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> ORANGE_STAINED_ACACIA_DOOR = BLOCKS.register("orange_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> PINK_STAINED_ACACIA_DOOR = BLOCKS.register("pink_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> PURPLE_STAINED_ACACIA_DOOR = BLOCKS.register("purple_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> RED_STAINED_ACACIA_DOOR = BLOCKS.register("red_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> WHITE_STAINED_ACACIA_DOOR = BLOCKS.register("white_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));
    public static final RegistryObject<Block> YELLOW_STAINED_ACACIA_DOOR = BLOCKS.register("yellow_stained_acacia_door", () -> new ModDoors(Block.Properties.from(Blocks.ACACIA_DOOR)));

    public static final RegistryObject<Block> BLACK_STAINED_BIRCH_DOOR = BLOCKS.register("black_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> BLUE_STAINED_BIRCH_DOOR = BLOCKS.register("blue_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> BROWN_STAINED_BIRCH_DOOR = BLOCKS.register("brown_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> CYAN_STAINED_BIRCH_DOOR = BLOCKS.register("cyan_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> GRAY_STAINED_BIRCH_DOOR = BLOCKS.register("gray_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> GREEN_STAINED_BIRCH_DOOR = BLOCKS.register("green_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BIRCH_DOOR = BLOCKS.register("light_blue_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BIRCH_DOOR = BLOCKS.register("light_gray_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_BIRCH_DOOR = BLOCKS.register("light_green_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> MAGENTA_STAINED_BIRCH_DOOR = BLOCKS.register("magenta_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> ORANGE_STAINED_BIRCH_DOOR = BLOCKS.register("orange_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> PINK_STAINED_BIRCH_DOOR = BLOCKS.register("pink_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> PURPLE_STAINED_BIRCH_DOOR = BLOCKS.register("purple_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> RED_STAINED_BIRCH_DOOR = BLOCKS.register("red_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> WHITE_STAINED_BIRCH_DOOR = BLOCKS.register("white_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));
    public static final RegistryObject<Block> YELLOW_STAINED_BIRCH_DOOR = BLOCKS.register("yellow_stained_birch_door", () -> new ModDoors(Block.Properties.from(Blocks.BIRCH_DOOR)));

    public static final RegistryObject<Block> BLACK_STAINED_DARK_OAK_DOOR = BLOCKS.register("black_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> BLUE_STAINED_DARK_OAK_DOOR = BLOCKS.register("blue_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> BROWN_STAINED_DARK_OAK_DOOR = BLOCKS.register("brown_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> CYAN_STAINED_DARK_OAK_DOOR = BLOCKS.register("cyan_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> GRAY_STAINED_DARK_OAK_DOOR = BLOCKS.register("gray_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> GREEN_STAINED_DARK_OAK_DOOR = BLOCKS.register("green_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DARK_OAK_DOOR = BLOCKS.register("light_blue_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DARK_OAK_DOOR = BLOCKS.register("light_gray_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_DARK_OAK_DOOR = BLOCKS.register("light_green_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> MAGENTA_STAINED_DARK_OAK_DOOR = BLOCKS.register("magenta_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> ORANGE_STAINED_DARK_OAK_DOOR = BLOCKS.register("orange_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> PINK_STAINED_DARK_OAK_DOOR = BLOCKS.register("pink_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> PURPLE_STAINED_DARK_OAK_DOOR = BLOCKS.register("purple_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> RED_STAINED_DARK_OAK_DOOR = BLOCKS.register("red_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> WHITE_STAINED_DARK_OAK_DOOR = BLOCKS.register("white_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));
    public static final RegistryObject<Block> YELLOW_STAINED_DARK_OAK_DOOR = BLOCKS.register("yellow_stained_dark_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.DARK_OAK_DOOR)));

    public static final RegistryObject<Block> BLACK_STAINED_JUNGLE_DOOR = BLOCKS.register("black_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> BLUE_STAINED_JUNGLE_DOOR = BLOCKS.register("blue_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> BROWN_STAINED_JUNGLE_DOOR = BLOCKS.register("brown_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> CYAN_STAINED_JUNGLE_DOOR = BLOCKS.register("cyan_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> GRAY_STAINED_JUNGLE_DOOR = BLOCKS.register("gray_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> GREEN_STAINED_JUNGLE_DOOR = BLOCKS.register("green_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_JUNGLE_DOOR = BLOCKS.register("light_blue_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_JUNGLE_DOOR = BLOCKS.register("light_gray_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_JUNGLE_DOOR = BLOCKS.register("light_green_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> MAGENTA_STAINED_JUNGLE_DOOR = BLOCKS.register("magenta_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> ORANGE_STAINED_JUNGLE_DOOR = BLOCKS.register("orange_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> PINK_STAINED_JUNGLE_DOOR = BLOCKS.register("pink_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> PURPLE_STAINED_JUNGLE_DOOR = BLOCKS.register("purple_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> RED_STAINED_JUNGLE_DOOR = BLOCKS.register("red_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> WHITE_STAINED_JUNGLE_DOOR = BLOCKS.register("white_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));
    public static final RegistryObject<Block> YELLOW_STAINED_JUNGLE_DOOR = BLOCKS.register("yellow_stained_jungle_door", () -> new ModDoors(Block.Properties.from(Blocks.JUNGLE_DOOR)));

    public static final RegistryObject<Block> BLACK_STAINED_OAK_DOOR = BLOCKS.register("black_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> BLUE_STAINED_OAK_DOOR = BLOCKS.register("blue_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> BROWN_STAINED_OAK_DOOR = BLOCKS.register("brown_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> CYAN_STAINED_OAK_DOOR = BLOCKS.register("cyan_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> GRAY_STAINED_OAK_DOOR = BLOCKS.register("gray_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> GREEN_STAINED_OAK_DOOR = BLOCKS.register("green_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_OAK_DOOR = BLOCKS.register("light_blue_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_OAK_DOOR = BLOCKS.register("light_gray_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_OAK_DOOR = BLOCKS.register("light_green_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> MAGENTA_STAINED_OAK_DOOR = BLOCKS.register("magenta_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> ORANGE_STAINED_OAK_DOOR = BLOCKS.register("orange_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> PINK_STAINED_OAK_DOOR = BLOCKS.register("pink_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> PURPLE_STAINED_OAK_DOOR = BLOCKS.register("purple_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> RED_STAINED_OAK_DOOR = BLOCKS.register("red_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> WHITE_STAINED_OAK_DOOR = BLOCKS.register("white_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> YELLOW_STAINED_OAK_DOOR = BLOCKS.register("yellow_stained_oak_door", () -> new ModDoors(Block.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> BLACK_STAINED_SPRUCE_DOOR = BLOCKS.register("black_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> BLUE_STAINED_SPRUCE_DOOR = BLOCKS.register("blue_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> BROWN_STAINED_SPRUCE_DOOR = BLOCKS.register("brown_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> CYAN_STAINED_SPRUCE_DOOR = BLOCKS.register("cyan_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> GRAY_STAINED_SPRUCE_DOOR = BLOCKS.register("gray_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> GREEN_STAINED_SPRUCE_DOOR = BLOCKS.register("green_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_SPRUCE_DOOR = BLOCKS.register("light_blue_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_SPRUCE_DOOR = BLOCKS.register("light_gray_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_SPRUCE_DOOR = BLOCKS.register("light_green_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> MAGENTA_STAINED_SPRUCE_DOOR = BLOCKS.register("magenta_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> ORANGE_STAINED_SPRUCE_DOOR = BLOCKS.register("orange_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> PINK_STAINED_SPRUCE_DOOR = BLOCKS.register("pink_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> PURPLE_STAINED_SPRUCE_DOOR = BLOCKS.register("purple_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> RED_STAINED_SPRUCE_DOOR = BLOCKS.register("red_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> WHITE_STAINED_SPRUCE_DOOR = BLOCKS.register("white_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));
    public static final RegistryObject<Block> YELLOW_STAINED_SPRUCE_DOOR = BLOCKS.register("yellow_stained_spruce_door", () -> new ModDoors(Block.Properties.from(Blocks.SPRUCE_DOOR)));

}
