package mod.silverwolfs.silverwolfsbuildingblocks;

import mod.silverwolfs.silverwolfsbuildingblocks.init.*;
import mod.silverwolfs.silverwolfsbuildingblocks.util.RegistryHandler;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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
    public static final ItemGroup TAB = new ItemGroup("SBBTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.THATCH_BLOCK.get());
        }
        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }.setBackgroundImage(new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png"));
}



