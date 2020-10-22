package mod.silverwolfs.silverwolfsbuildingblocks.util;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.init.BlockInit;
import mod.silverwolfs.silverwolfsbuildingblocks.init.DoorInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SilverwolfsBuildingBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        //Doors
        RenderTypeLookup.setRenderLayer(DoorInit.THATCH_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.BAMBOO_DOOR.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(DoorInit.BLACK_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.BLUE_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.BROWN_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.CYAN_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.GRAY_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.GREEN_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_BLUE_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_GRAY_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_GREEN_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.MAGENTA_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.ORANGE_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.PINK_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.PURPLE_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.RED_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.WHITE_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.YELLOW_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(DoorInit.BLACK_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.BLUE_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.BROWN_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.CYAN_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.GRAY_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.GREEN_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_BLUE_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_GRAY_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_GREEN_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.MAGENTA_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.ORANGE_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.PINK_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.PURPLE_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.RED_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.WHITE_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.YELLOW_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(DoorInit.BLACK_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.BLUE_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.BROWN_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.CYAN_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.GRAY_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.GREEN_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_BLUE_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_GRAY_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.LIGHT_GREEN_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.MAGENTA_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.ORANGE_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.PINK_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.PURPLE_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.RED_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.WHITE_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.YELLOW_STAINED_OAK_DOOR.get(), RenderType.getCutout());

    }
}
