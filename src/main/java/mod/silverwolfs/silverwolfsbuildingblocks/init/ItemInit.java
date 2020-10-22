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

}
