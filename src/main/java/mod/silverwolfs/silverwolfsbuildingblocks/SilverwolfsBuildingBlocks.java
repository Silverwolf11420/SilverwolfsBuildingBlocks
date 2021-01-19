package mod.silverwolfs.silverwolfsbuildingblocks;

import mod.silverwolfs.silverwolfsbuildingblocks.init.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = SilverwolfsBuildingBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@Mod("silverwolfsbuildingblocks")
public class SilverwolfsBuildingBlocks {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "silverwolfsbuildingblocks";
    public static SilverwolfsBuildingBlocks instance;

    public SilverwolfsBuildingBlocks()
    {
        final IEventBus modEventbus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventbus.addListener(this::setup);
        modEventbus.addListener(this::doClientStuff);

        ItemInit.ITEMS.register(modEventbus);
        BlockInit.BLOCKS.register(modEventbus);
        ButtonInit.BLOCKS.register(modEventbus);
        DoorInit.BLOCKS.register(modEventbus);
        LadderInit.BLOCKS.register(modEventbus);
        PressurePlateInit.BLOCKS.register(modEventbus);
        SlabInit.BLOCKS.register(modEventbus);
        StairsInit.BLOCKS.register(modEventbus);
        TrapdoorsInit.BLOCKS.register(modEventbus);
        FencesWallsInit.BLOCKS.register(modEventbus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        StairsInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        SlabInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        DoorInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        ButtonInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        PressurePlateInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LadderInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        TrapdoorsInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        FencesWallsInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(SilverwolfsBlocksItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {
    }
//creative tabs
    public static class SilverwolfsItemGroup extends ItemGroup{
        public static final SilverwolfsItemGroup instance = new SilverwolfsItemGroup(ItemGroup.GROUPS.length, "itemtab");
        private SilverwolfsItemGroup(int index, String label)
        {
            super(index, label);
        }
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.RED_BRICK.get());
        }
        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }

    public static class SilverwolfsBlocksItemGroup extends ItemGroup{
        public static final SilverwolfsBlocksItemGroup instance = new SilverwolfsBlocksItemGroup(ItemGroup.GROUPS.length, "blocktab");
        private SilverwolfsBlocksItemGroup(int index, String label)
        {
            super(index, label);
        }
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInit.OAK_BEAM_MIDDLE.get());
        }
        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }
}



