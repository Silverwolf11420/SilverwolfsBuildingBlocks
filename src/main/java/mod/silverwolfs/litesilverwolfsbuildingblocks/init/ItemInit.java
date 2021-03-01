package mod.silverwolfs.litesilverwolfsbuildingblocks.init;

import mod.silverwolfs.litesilverwolfsbuildingblocks.LiteSilverwolfsBuildingBlocks;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LiteSilverwolfsBuildingBlocks.MOD_ID);

    public static void init(IEventBus modBus) {
        ITEMS.register(modBus);
    }
    public static final RegistryObject<Item> THATCH = ITEMS.register("thatch", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));

    public static final RegistryObject<Item> ACACIA_STICK = ITEMS.register("acacia_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BIRCH_STICK = ITEMS.register("birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> OAK_STICK = ITEMS.register("oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> JUNGLE_STICK = ITEMS.register("jungle_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> DARK_OAK_STICK = ITEMS.register("dark_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> SPRUCE_STICK = ITEMS.register("spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_CLAY_BALL = ITEMS.register("black_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_CLAY_BALL = ITEMS.register("blue_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_CLAY_BALL = ITEMS.register("brown_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_CLAY_BALL = ITEMS.register("cyan_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_CLAY_BALL = ITEMS.register("gray_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_CLAY_BALL = ITEMS.register("green_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_CLAY_BALL = ITEMS.register("light_blue_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_CLAY_BALL = ITEMS.register("light_gray_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIME_CLAY_BALL = ITEMS.register("lime_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_CLAY_BALL = ITEMS.register("magenta_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_CLAY_BALL = ITEMS.register("orange_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PINK_CLAY_BALL = ITEMS.register("pink_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_CLAY_BALL = ITEMS.register("purple_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> RED_CLAY_BALL = ITEMS.register("red_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_CLAY_BALL = ITEMS.register("white_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_CLAY_BALL = ITEMS.register("yellow_clay_ball", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_BRICK = ITEMS.register("black_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_BRICK = ITEMS.register("blue_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_BRICK = ITEMS.register("brown_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_BRICK = ITEMS.register("cyan_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_BRICK = ITEMS.register("gray_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_BRICK = ITEMS.register("green_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = ITEMS.register("light_blue_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = ITEMS.register("light_gray_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIME_BRICK = ITEMS.register("lime_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_BRICK = ITEMS.register("magenta_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_BRICK = ITEMS.register("orange_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PINK_BRICK = ITEMS.register("pink_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_BRICK = ITEMS.register("purple_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> RED_BRICK = ITEMS.register("red_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_BRICK = ITEMS.register("white_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_BRICK = ITEMS.register("yellow_brick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_BIRCH_STICK = ITEMS.register("black_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_BIRCH_STICK = ITEMS.register("blue_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_BIRCH_STICK = ITEMS.register("brown_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_BIRCH_STICK = ITEMS.register("cyan_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_BIRCH_STICK = ITEMS.register("gray_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_BIRCH_STICK = ITEMS.register("green_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_BIRCH_STICK = ITEMS.register("light_blue_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_BIRCH_STICK = ITEMS.register("light_gray_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIME_BIRCH_STICK = ITEMS.register("lime_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_BIRCH_STICK = ITEMS.register("magenta_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_BIRCH_STICK = ITEMS.register("orange_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PINK_BIRCH_STICK = ITEMS.register("pink_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_BIRCH_STICK = ITEMS.register("purple_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> RED_BIRCH_STICK = ITEMS.register("red_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_BIRCH_STICK = ITEMS.register("white_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_BIRCH_STICK = ITEMS.register("yellow_birch_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_OAK_STICK = ITEMS.register("black_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_OAK_STICK = ITEMS.register("blue_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_OAK_STICK = ITEMS.register("brown_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_OAK_STICK = ITEMS.register("cyan_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_OAK_STICK = ITEMS.register("gray_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_OAK_STICK = ITEMS.register("green_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_OAK_STICK = ITEMS.register("light_blue_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_OAK_STICK = ITEMS.register("light_gray_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIME_OAK_STICK = ITEMS.register("lime_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_OAK_STICK = ITEMS.register("magenta_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_OAK_STICK = ITEMS.register("orange_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PINK_OAK_STICK = ITEMS.register("pink_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_OAK_STICK = ITEMS.register("purple_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> RED_OAK_STICK = ITEMS.register("red_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_OAK_STICK = ITEMS.register("white_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_OAK_STICK = ITEMS.register("yellow_oak_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));

    public static final RegistryObject<Item> BLACK_SPRUCE_STICK = ITEMS.register("black_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BLUE_SPRUCE_STICK = ITEMS.register("blue_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> BROWN_SPRUCE_STICK = ITEMS.register("brown_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> CYAN_SPRUCE_STICK = ITEMS.register("cyan_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GRAY_SPRUCE_STICK = ITEMS.register("gray_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_SPRUCE_STICK = ITEMS.register("green_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_BLUE_SPRUCE_STICK = ITEMS.register("light_blue_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_GRAY_SPRUCE_STICK = ITEMS.register("light_gray_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> LIME_SPRUCE_STICK = ITEMS.register("lime_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> MAGENTA_SPRUCE_STICK = ITEMS.register("magenta_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> ORANGE_SPRUCE_STICK = ITEMS.register("orange_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PINK_SPRUCE_STICK = ITEMS.register("pink_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> PURPLE_SPRUCE_STICK = ITEMS.register("purple_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> RED_SPRUCE_STICK = ITEMS.register("red_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> WHITE_SPRUCE_STICK = ITEMS.register("white_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));
    public static final RegistryObject<Item> YELLOW_SPRUCE_STICK = ITEMS.register("yellow_spruce_stick", () -> new Item(new Item.Properties().group(LiteSilverwolfsBuildingBlocks.LiteSilverwolfsBuildingItemGroup.instance)));

}
