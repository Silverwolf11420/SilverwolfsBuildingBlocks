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
    public static final RegistryObject<Item> THATCH = addToTab(ITEMS.register("thatch", () -> new Item(new Item.Properties())));

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

    public static final RegistryObject<BlockItem> THATCH_BLOCK_ITEM = addToTab(ITEMS.register("thatch_block", () -> new BlockItem(BlockInit.THATCH_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_BUTTON_ITEM = addToTab(ITEMS.register("thatch_button", () -> new BlockItem(BlockInit.THATCH_BUTTON.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_DOOR_ITEM = addToTab(ITEMS.register("thatch_door", () -> new BlockItem(BlockInit.THATCH_DOOR.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_FENCE_ITEM = addToTab(ITEMS.register("thatch_fence", () -> new BlockItem(BlockInit.THATCH_FENCE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_FENCE_GATE_ITEM = addToTab(ITEMS.register("thatch_fence_gate", () -> new BlockItem(BlockInit.THATCH_FENCE_GATE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_LADDER_ITEM = addToTab(ITEMS.register("thatch_ladder", () -> new BlockItem(BlockInit.THATCH_LADDER.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_PRESSURE_PLATE_ITEM = addToTab(ITEMS.register("thatch_pressure_plate", () -> new BlockItem(BlockInit.THATCH_PRESSURE_PLATE.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_SLAB_ITEM = addToTab(ITEMS.register("thatch_slab", () -> new BlockItem(BlockInit.THATCH_SLAB.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_STAIRS_ITEM = addToTab(ITEMS.register("thatch_stairs", () -> new BlockItem(BlockInit.THATCH_STAIRS.get(), new Item.Properties())));
    public static final RegistryObject<BlockItem> THATCH_TRAPDOOR_ITEM = addToTab(ITEMS.register("thatch_trapdoor", () -> new BlockItem(BlockInit.THATCH_TRAPDOOR.get(), new Item.Properties())));


}