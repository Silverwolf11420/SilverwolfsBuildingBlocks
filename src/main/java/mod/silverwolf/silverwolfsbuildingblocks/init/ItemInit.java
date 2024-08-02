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
    public static final RegistryObject<BlockItem> THATCH_BLOCK_ITEM = addToTab(ITEMS.register("thatch_block", () -> new BlockItem(BlockInit.THATCH_BLOCK.get(), new Item.Properties())));
}