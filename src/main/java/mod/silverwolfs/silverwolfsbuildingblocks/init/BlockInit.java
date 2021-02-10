package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.util.WoodenPlank;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, BlockInit::itemDefault);
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

    //Blocks
    public static final RegistryObject<Block> THATCH_BLOCK = SilverwolfsBuildingBlocks.BLOCKS.register("thatch_block", () -> new Block(Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F, 0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> BAMBOO_BLOCK = SilverwolfsBuildingBlocks.BLOCKS.register("bamboo_block", () -> new Block(Block.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F, 0.5F)));

    public static final RegistryObject<Block> ACACIA_BEAM_UP = SilverwolfsBuildingBlocks.BLOCKS.register("acacia_beam_up", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> ACACIA_BEAM_MIDDLE = SilverwolfsBuildingBlocks.BLOCKS.register("acacia_beam_middle", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> ACACIA_BEAM_DOWN = SilverwolfsBuildingBlocks.BLOCKS.register("acacia_beam_down", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> BIRCH_BEAM_UP = SilverwolfsBuildingBlocks.BLOCKS.register("birch_beam_up", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> BIRCH_BEAM_MIDDLE = SilverwolfsBuildingBlocks.BLOCKS.register("birch_beam_middle", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> BIRCH_BEAM_DOWN = SilverwolfsBuildingBlocks.BLOCKS.register("birch_beam_down", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> OAK_BEAM_UP = SilverwolfsBuildingBlocks.BLOCKS.register("oak_beam_up", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> OAK_BEAM_MIDDLE = SilverwolfsBuildingBlocks.BLOCKS.register("oak_beam_middle", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> OAK_BEAM_DOWN = SilverwolfsBuildingBlocks.BLOCKS.register("oak_beam_down", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> JUNGLE_BEAM_UP = SilverwolfsBuildingBlocks.BLOCKS.register("jungle_beam_up", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> JUNGLE_BEAM_MIDDLE = SilverwolfsBuildingBlocks.BLOCKS.register("jungle_beam_middle", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> JUNGLE_BEAM_DOWN = SilverwolfsBuildingBlocks.BLOCKS.register("jungle_beam_down", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> SPRUCE_BEAM_UP = SilverwolfsBuildingBlocks.BLOCKS.register("spruce_beam_up", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> SPRUCE_BEAM_MIDDLE = SilverwolfsBuildingBlocks.BLOCKS.register("spruce_beam_middle", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> SPRUCE_BEAM_DOWN = SilverwolfsBuildingBlocks.BLOCKS.register("spruce_beam_down", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_UP = SilverwolfsBuildingBlocks.BLOCKS.register("dark_oak_beam_up", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_MIDDLE = SilverwolfsBuildingBlocks.BLOCKS.register("dark_oak_beam_middle", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> DARK_OAK_BEAM_DOWN = SilverwolfsBuildingBlocks.BLOCKS.register("dark_oak_beam_down", () -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> MOSSY_STONE = SilverwolfsBuildingBlocks.BLOCKS.register("mossy_stone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE = SilverwolfsBuildingBlocks.BLOCKS.register("more_mossy_stone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE = SilverwolfsBuildingBlocks.BLOCKS.register("mossy_andesite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE = SilverwolfsBuildingBlocks.BLOCKS.register("more_mossy_andesite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));

    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> PLANKS = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICKS = new ArrayList<>();


    static {
        for (DyeColor color : DyeColor.values()) {

            BRICKS.add(register(color.getTranslationKey() + "_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICKS.add(register(color.getTranslationKey() + "_stone_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));

            for (WoodenPlank plank : WoodenPlank.values()) {
                PLANKS.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_plank",
                                () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
            }
        }
    }
}
