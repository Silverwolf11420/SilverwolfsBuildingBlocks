package mod.silverwolf.silverwolfsbuildingblocks;

import mod.silverwolf.silverwolfsbuildingblocks.init.BlockInit;
import mod.silverwolf.silverwolfsbuildingblocks.init.CreativeTabInit;
import mod.silverwolf.silverwolfsbuildingblocks.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SilverwolfsBuildingBlocks.MODID)
public class SilverwolfsBuildingBlocks {
    public static final String MODID = "silverwolfsbuildingblocks";

    public SilverwolfsBuildingBlocks() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);

    }
}
