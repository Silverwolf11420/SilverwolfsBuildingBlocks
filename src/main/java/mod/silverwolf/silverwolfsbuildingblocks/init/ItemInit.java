package mod.silverwolf.silverwolfsbuildingblocks.init;

import mod.silverwolf.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static mod.silverwolf.silverwolfsbuildingblocks.init.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SilverwolfsBuildingBlocks.MODID);

    //Items
    //public static final RegistryObject<Item> EXAMPLE_ITEM = addToTab(ITEMS.register("example_item", () -> new Item(new Item.Properties())));

    //Block Items
    public static final RegistryObject<BlockItem> BAMBOO_BLOCK_ITEM = addToTab(ITEMS.register("bamboo_block", () -> new BlockItem(BlockInit.BAMBOO_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_BUTTON_ITEM = addToTab(ITEMS.register("bamboo_button", () -> new BlockItem(BlockInit.BAMBOO_BUTTON.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_DOOR_ITEM = addToTab(ITEMS.register("bamboo_door", () -> new BlockItem(BlockInit.BAMBOO_DOOR.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_FENCE_ITEM = addToTab(ITEMS.register("bamboo_fence", () -> new BlockItem(BlockInit.BAMBOO_FENCE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_FENCE_GATE_ITEM = addToTab(ITEMS.register("bamboo_fence_gate", () -> new BlockItem(BlockInit.BAMBOO_FENCE_GATE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_LADDER_ITEM = addToTab(ITEMS.register("bamboo_ladder", () -> new BlockItem(BlockInit.BAMBOO_LADDER.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_PRESSURE_PLATE_ITEM = addToTab(ITEMS.register("bamboo_pressure_plate", () -> new BlockItem(BlockInit.BAMBOO_PRESSURE_PLATE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_SLAB_ITEM = addToTab(ITEMS.register("bamboo_slab", () -> new BlockItem(BlockInit.BAMBOO_SLAB.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_STAIRS_ITEM = addToTab(ITEMS.register("bamboo_stairs", () -> new BlockItem(BlockInit.BAMBOO_STAIRS.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> BAMBOO_TRAPDOOR_ITEM = addToTab(ITEMS.register("bamboo_trapdoor", () -> new BlockItem(BlockInit.BAMBOO_TRAPDOOR.get(), new Item.Properties())));



}