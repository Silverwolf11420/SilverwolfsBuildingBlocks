package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.object.blocks.ModPressurePlateBlock;
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

public class PressurePlateInit {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, PressurePlateInit::itemDefault);
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

    //Pressure Plate
    public static final RegistryObject<Block> BAMBOO_PRESSURE_PLATE = SilverwolfsBuildingBlocks.BLOCKS.register("bamboo_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO).hardnessAndResistance(0.5F,0.5F)));
    public static final RegistryObject<Block> THATCH_PRESSURE_PLATE = SilverwolfsBuildingBlocks.BLOCKS.register("thatch_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MOSSY_STONE_PRESSURE_PLATE = SilverwolfsBuildingBlocks.BLOCKS.register("mossy_stone_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_PRESSURE_PLATE = SilverwolfsBuildingBlocks.BLOCKS.register("more_mossy_stone_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MOSSY_ANDESITE_PRESSURE_PLATE = SilverwolfsBuildingBlocks.BLOCKS.register("mossy_andesite_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_PRESSURE_PLATE = SilverwolfsBuildingBlocks.BLOCKS.register("more_mossy_andesite_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F,6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool()));

    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> PRESSURE_PLATES = new EnumMap<>(WoodenPlank.class);
    public static ArrayList<RegistryObject<Block>> BRICK_PRESSURE_PLATES = new ArrayList<>();
    public static ArrayList<RegistryObject<Block>> STONE_BRICK_PRESSURE_PLATES = new ArrayList<>();

    static {
        for (DyeColor color : DyeColor.values()) {

            BRICK_PRESSURE_PLATES.add(register(color.getTranslationKey() + "_brick_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));
            STONE_BRICK_PRESSURE_PLATES.add(register(color.getTranslationKey() + "_stone_brick_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(0).setRequiresTool())));

            for (WoodenPlank plank : WoodenPlank.values()) {
                PRESSURE_PLATES.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_pressure_plate",
                                () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));
            }
        }
    }
}
