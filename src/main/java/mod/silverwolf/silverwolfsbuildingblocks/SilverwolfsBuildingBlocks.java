package mod.silverwolf.silverwolfsbuildingblocks;

import mod.silverwolf.silverwolfsbuildingblocks.init.BlockInit;
import mod.silverwolf.silverwolfsbuildingblocks.init.CreativeTabInit;
import mod.silverwolf.silverwolfsbuildingblocks.init.ItemInit;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
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
