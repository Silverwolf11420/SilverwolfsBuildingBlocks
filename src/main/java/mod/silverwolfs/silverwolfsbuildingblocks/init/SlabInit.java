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

public class SlabInit {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, SlabInit::itemDefault);
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
    //Slab
    public static final RegistryObject<Block> THATCH_SLAB = SilverwolfsBuildingBlocks.BLOCKS.register("thatch_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_SLAB = SilverwolfsBuildingBlocks.BLOCKS.register("bamboo_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.BAMBOO_BLOCK.get())));
    public static final RegistryObject<Block> MOSSY_STONE_SLAB = SilverwolfsBuildingBlocks.BLOCKS.register("mossy_stone_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MOSSY_STONE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_SLAB = SilverwolfsBuildingBlocks.BLOCKS.register("more_mossy_stone_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MORE_MOSSY_STONE.get())));
    public static final RegistryObject<Block> MOSSY_ANDESITE_SLAB = SilverwolfsBuildingBlocks.BLOCKS.register("mossy_andesite_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MOSSY_ANDESITE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_SLAB = SilverwolfsBuildingBlocks.BLOCKS.register("more_mossy_andesite_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MORE_MOSSY_ANDESITE.get())));

    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> SLABS = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICK_SLABS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICK_SLABS = new ArrayList<>();

    static {
        for (DyeColor color : DyeColor.values()) {

            BRICK_SLABS.add(register(color.getTranslationKey() + "_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICK_SLABS.add(register(color.getTranslationKey() + "_stone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));

            for (WoodenPlank plank : WoodenPlank.values()) {
                SLABS.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_slab",
                                () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
            }
        }
    }
}
