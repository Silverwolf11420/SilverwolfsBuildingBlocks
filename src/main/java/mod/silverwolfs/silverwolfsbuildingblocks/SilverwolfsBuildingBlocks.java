package mod.silverwolfs.silverwolfsbuildingblocks;

import mod.silverwolfs.silverwolfsbuildingblocks.init.*;
import mod.silverwolfs.silverwolfsbuildingblocks.util.RegistryHandler;
import mod.silverwolfs.silverwolfsbuildingblocks.util.WoodenPlank;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
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
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
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
        RegistryHandler.init(modEventbus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    //creative tabs
    public static class SilverwolfsBlocksItemGroup extends ItemGroup {
        public static final SilverwolfsBlocksItemGroup instance = new SilverwolfsBlocksItemGroup(ItemGroup.GROUPS.length, "itemtab");

        private SilverwolfsBlocksItemGroup(int index, String label) {
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
}



