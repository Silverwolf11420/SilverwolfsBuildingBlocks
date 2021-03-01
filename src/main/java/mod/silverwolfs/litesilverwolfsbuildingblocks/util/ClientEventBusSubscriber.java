package mod.silverwolfs.litesilverwolfsbuildingblocks.util;

import mod.silverwolfs.litesilverwolfsbuildingblocks.LiteSilverwolfsBuildingBlocks;
import mod.silverwolfs.litesilverwolfsbuildingblocks.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.DyeColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = LiteSilverwolfsBuildingBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        //Doors
        RenderTypeLookup.setRenderLayer(BlockInit.THATCH_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.THATCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.THATCH_TRAPDOOR.get(), RenderType.getCutout());

        for (DyeColor color : DyeColor.values()) {

            for (WoodenPlank plank : WoodenPlank.values()) {
                RenderTypeLookup.setRenderLayer(BlockInit.DOORS.get(plank).get(color.getId()).get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.LADDERS.get(plank).get(color.getId()).get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.TRAPDOORS.get(plank).get(color.getId()).get(), RenderType.getCutout());
            }
        }
    }
}
