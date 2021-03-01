package mod.silverwolfs.litesilverwolfsbuildingblocks;

import mod.silverwolfs.litesilverwolfsbuildingblocks.init.*;
import mod.silverwolfs.litesilverwolfsbuildingblocks.util.RegistryHandler;
import net.minecraft.block.Block;
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
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = LiteSilverwolfsBuildingBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@Mod("litesilverwolfsbuildingblocks")
public class LiteSilverwolfsBuildingBlocks {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "litesilverwolfsbuildingblocks";
    public static LiteSilverwolfsBuildingBlocks instance;

    public LiteSilverwolfsBuildingBlocks()
    {
        final IEventBus modEventbus = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryHandler.init(modEventbus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

//creative tabs
    public static class LiteSilverwolfsBuildingItemGroup extends ItemGroup{
        public static final LiteSilverwolfsBuildingItemGroup instance = new LiteSilverwolfsBuildingItemGroup(ItemGroup.GROUPS.length, "itemtab");
        private LiteSilverwolfsBuildingItemGroup(int index, String label)
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



