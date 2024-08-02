package mod.silverwolf.silverwolfsbuildingblocks.events;

import mod.silverwolf.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolf.silverwolfsbuildingblocks.init.BlockInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SilverwolfsBuildingBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CommonModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        //ItemBlockRenderTypes.setRenderLayer(BlockInit.THATCH_BLOCK.get(), RenderType.cutout());
    }
}
