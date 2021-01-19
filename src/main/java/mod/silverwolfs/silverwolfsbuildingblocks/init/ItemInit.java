package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SilverwolfsBuildingBlocks.MOD_ID);

    public static final RegistryObject<Item> THATCH = ITEMS.register("thatch", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> ACACIA_STICK = ITEMS.register("acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BIRCH_STICK = ITEMS.register("birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> OAK_STICK = ITEMS.register("oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> JUNGLE_STICK = ITEMS.register("jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> DARK_OAK_STICK = ITEMS.register("dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> SPRUCE_STICK = ITEMS.register("spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_CLAY_BALL = ITEMS.register("black_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_CLAY_BALL = ITEMS.register("blue_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_CLAY_BALL = ITEMS.register("brown_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_CLAY_BALL = ITEMS.register("cyan_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_CLAY_BALL = ITEMS.register("gray_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_CLAY_BALL = ITEMS.register("green_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_CLAY_BALL = ITEMS.register("light_blue_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_CLAY_BALL = ITEMS.register("light_gray_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GREEN_CLAY_BALL = ITEMS.register("light_green_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_CLAY_BALL = ITEMS.register("magenta_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_CLAY_BALL = ITEMS.register("orange_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PINK_CLAY_BALL = ITEMS.register("pink_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_CLAY_BALL = ITEMS.register("purple_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> RED_CLAY_BALL = ITEMS.register("red_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_CLAY_BALL = ITEMS.register("white_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_CLAY_BALL = ITEMS.register("yellow_clay_ball", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_BRICK = ITEMS.register("black_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_BRICK = ITEMS.register("blue_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_BRICK = ITEMS.register("brown_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_BRICK = ITEMS.register("cyan_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_BRICK = ITEMS.register("gray_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_BRICK = ITEMS.register("green_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = ITEMS.register("light_blue_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = ITEMS.register("light_gray_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GREEN_BRICK = ITEMS.register("light_green_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_BRICK = ITEMS.register("magenta_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_BRICK = ITEMS.register("orange_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PINK_BRICK = ITEMS.register("pink_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_BRICK = ITEMS.register("purple_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> RED_BRICK = ITEMS.register("red_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_BRICK = ITEMS.register("white_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_BRICK = ITEMS.register("yellow_brick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_ACACIA_STICK = ITEMS.register("black_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_ACACIA_STICK = ITEMS.register("blue_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_ACACIA_STICK = ITEMS.register("brown_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_ACACIA_STICK = ITEMS.register("cyan_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_ACACIA_STICK = ITEMS.register("gray_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_ACACIA_STICK = ITEMS.register("green_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_ACACIA_STICK = ITEMS.register("light_blue_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_ACACIA_STICK = ITEMS.register("light_gray_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GREEN_ACACIA_STICK = ITEMS.register("light_green_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_ACACIA_STICK = ITEMS.register("magenta_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_ACACIA_STICK = ITEMS.register("orange_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PINK_ACACIA_STICK = ITEMS.register("pink_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_ACACIA_STICK = ITEMS.register("purple_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> RED_ACACIA_STICK = ITEMS.register("red_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_ACACIA_STICK = ITEMS.register("white_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_ACACIA_STICK = ITEMS.register("yellow_acacia_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_BIRCH_STICK = ITEMS.register("black_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_BIRCH_STICK = ITEMS.register("blue_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_BIRCH_STICK = ITEMS.register("brown_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_BIRCH_STICK = ITEMS.register("cyan_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_BIRCH_STICK = ITEMS.register("gray_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_BIRCH_STICK = ITEMS.register("green_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_BIRCH_STICK = ITEMS.register("light_blue_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_BIRCH_STICK = ITEMS.register("light_gray_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GREEN_BIRCH_STICK = ITEMS.register("light_green_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_BIRCH_STICK = ITEMS.register("magenta_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_BIRCH_STICK = ITEMS.register("orange_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PINK_BIRCH_STICK = ITEMS.register("pink_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_BIRCH_STICK = ITEMS.register("purple_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> RED_BIRCH_STICK = ITEMS.register("red_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_BIRCH_STICK = ITEMS.register("white_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_BIRCH_STICK = ITEMS.register("yellow_birch_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_DARK_OAK_STICK = ITEMS.register("black_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_DARK_OAK_STICK = ITEMS.register("blue_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_DARK_OAK_STICK = ITEMS.register("brown_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_DARK_OAK_STICK = ITEMS.register("cyan_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_DARK_OAK_STICK = ITEMS.register("gray_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_DARK_OAK_STICK = ITEMS.register("green_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_DARK_OAK_STICK = ITEMS.register("light_blue_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_DARK_OAK_STICK = ITEMS.register("light_gray_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GREEN_DARK_OAK_STICK = ITEMS.register("light_green_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_DARK_OAK_STICK = ITEMS.register("magenta_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_DARK_OAK_STICK = ITEMS.register("orange_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PINK_DARK_OAK_STICK = ITEMS.register("pink_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_DARK_OAK_STICK = ITEMS.register("purple_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> RED_DARK_OAK_STICK = ITEMS.register("red_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_DARK_OAK_STICK = ITEMS.register("white_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_DARK_OAK_STICK = ITEMS.register("yellow_dark_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_JUNGLE_STICK = ITEMS.register("black_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_JUNGLE_STICK = ITEMS.register("blue_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_JUNGLE_STICK = ITEMS.register("brown_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_JUNGLE_STICK = ITEMS.register("cyan_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_JUNGLE_STICK = ITEMS.register("gray_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_JUNGLE_STICK = ITEMS.register("green_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_JUNGLE_STICK = ITEMS.register("light_blue_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_JUNGLE_STICK = ITEMS.register("light_gray_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GREEN_JUNGLE_STICK = ITEMS.register("light_green_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_JUNGLE_STICK = ITEMS.register("magenta_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_JUNGLE_STICK = ITEMS.register("orange_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PINK_JUNGLE_STICK = ITEMS.register("pink_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_JUNGLE_STICK = ITEMS.register("purple_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> RED_JUNGLE_STICK = ITEMS.register("red_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_JUNGLE_STICK = ITEMS.register("white_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_JUNGLE_STICK = ITEMS.register("yellow_jungle_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_OAK_STICK = ITEMS.register("black_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_OAK_STICK = ITEMS.register("blue_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_OAK_STICK = ITEMS.register("brown_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_OAK_STICK = ITEMS.register("cyan_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_OAK_STICK = ITEMS.register("gray_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_OAK_STICK = ITEMS.register("green_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_OAK_STICK = ITEMS.register("light_blue_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_OAK_STICK = ITEMS.register("light_gray_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GREEN_OAK_STICK = ITEMS.register("light_green_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_OAK_STICK = ITEMS.register("magenta_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_OAK_STICK = ITEMS.register("orange_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PINK_OAK_STICK = ITEMS.register("pink_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_OAK_STICK = ITEMS.register("purple_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> RED_OAK_STICK = ITEMS.register("red_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_OAK_STICK = ITEMS.register("white_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_OAK_STICK = ITEMS.register("yellow_oak_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_SPRUCE_STICK = ITEMS.register("black_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_SPRUCE_STICK = ITEMS.register("blue_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_SPRUCE_STICK = ITEMS.register("brown_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_SPRUCE_STICK = ITEMS.register("cyan_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_SPRUCE_STICK = ITEMS.register("gray_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_SPRUCE_STICK = ITEMS.register("green_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_SPRUCE_STICK = ITEMS.register("light_blue_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_SPRUCE_STICK = ITEMS.register("light_gray_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GREEN_SPRUCE_STICK = ITEMS.register("light_green_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_SPRUCE_STICK = ITEMS.register("magenta_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_SPRUCE_STICK = ITEMS.register("orange_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PINK_SPRUCE_STICK = ITEMS.register("pink_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_SPRUCE_STICK = ITEMS.register("purple_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> RED_SPRUCE_STICK = ITEMS.register("red_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_SPRUCE_STICK = ITEMS.register("white_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_SPRUCE_STICK = ITEMS.register("yellow_spruce_stick", () -> new Item(new Item.Properties().group(SilverwolfsBuildingBlocks.SilverwolfsItemGroup.instance)));

}
