package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.util.WoodenPlank;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class StairsInit {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, StairsInit::itemDefault);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        SilverwolfsBuildingBlocks.ITEMS.register(name, itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return SilverwolfsBuildingBlocks.BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(final RegistryObject<? extends Block> block) {
        return item(block, SilverwolfsBuildingBlocks.SilverwolfsBlocksItemGroup.instance);
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final ItemGroup itemGroup) {
        return () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup));
    }

    //Stairs
    public static final RegistryObject<Block> THATCH_STAIRS = SilverwolfsBuildingBlocks.BLOCKS.register("thatch_stairs", () -> new StairsBlock(() -> BlockInit.THATCH_BLOCK.get().getDefaultState() , Block.Properties.from(BlockInit.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_STAIRS = SilverwolfsBuildingBlocks.BLOCKS.register("bamboo_stairs", () -> new StairsBlock(() -> BlockInit.BAMBOO_BLOCK.get().getDefaultState() , Block.Properties.from(BlockInit.BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> MOSSY_STONE_STAIRS = SilverwolfsBuildingBlocks.BLOCKS.register("mossy_stone_stairs", () -> new StairsBlock(() -> BlockInit.MOSSY_STONE.get().getDefaultState() , Block.Properties.from(BlockInit.MOSSY_STONE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_STAIRS = SilverwolfsBuildingBlocks.BLOCKS.register("more_mossy_stone_stairs", () -> new StairsBlock(() -> BlockInit.MORE_MOSSY_STONE.get().getDefaultState() , Block.Properties.from(BlockInit.MORE_MOSSY_STONE.get())));
    public static final RegistryObject<Block> MOSSY_ANDESITE_STAIRS = SilverwolfsBuildingBlocks.BLOCKS.register("mossy_andesite_stairs", () -> new StairsBlock(() -> BlockInit.MOSSY_ANDESITE.get().getDefaultState() , Block.Properties.from(BlockInit.MOSSY_ANDESITE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_STAIRS = SilverwolfsBuildingBlocks.BLOCKS.register("more_mossy_andesite_stairs", () -> new StairsBlock(() -> BlockInit.MORE_MOSSY_ANDESITE.get().getDefaultState() , Block.Properties.from(BlockInit.MORE_MOSSY_ANDESITE.get())));

    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> STAIRS = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICK_STAIRS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICK_STAIRS = new ArrayList<>();

    static {
        for (DyeColor color : DyeColor.values()) {

            BRICK_STAIRS.add(register(color.getTranslationKey() + "_brick_stairs", () -> new StairsBlock(.getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())))
            ;
            STONE_BRICK_STAIRS.add(register(color.getTranslationKey() + "_stone_brick_stairs", () -> new StairsBlock(.getDefaultState(), AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())))
            ;

            for (WoodenPlank plank : WoodenPlank.values()) {
                STAIRS.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_stairs",
                                () -> new StairsBlock(.getDefaultState(), Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
            }
        }
    }
}
