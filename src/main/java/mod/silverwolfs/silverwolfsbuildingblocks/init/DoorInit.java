package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.object.blocks.ModDoors;
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

public class DoorInit {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, DoorInit::itemDefault);
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

    //Door
    public static final RegistryObject<Block> THATCH_DOOR = SilverwolfsBuildingBlocks.BLOCKS.register("thatch_door", () -> new ModDoors(Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F, 0.5F).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> BAMBOO_DOOR = SilverwolfsBuildingBlocks.BLOCKS.register("bamboo_door", () -> new ModDoors(Block.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F, 0.5F)));

    public static Map<WoodenPlank, ArrayList<RegistryObject<Block>>> DOORS = new EnumMap<>(WoodenPlank.class);

    static {
        for (DyeColor color : DyeColor.values()) {

            for (WoodenPlank plank : WoodenPlank.values()) {
                DOORS.getOrDefault(plank, new ArrayList<>())
                        .add(register(color.getTranslationKey() + "_" + plank.name().toLowerCase() + "_door",
                                () -> new ModDoors(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.0F).harvestTool(ToolType.AXE))
                        ));

            }
        }
    }
}
