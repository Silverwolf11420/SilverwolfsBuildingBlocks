package mod.silverwolfs.silverwolfsbuildingblocks.util;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.init.DoorInit;
import mod.silverwolfs.silverwolfsbuildingblocks.init.FencesWallsInit;
import mod.silverwolfs.silverwolfsbuildingblocks.init.LadderInit;
import mod.silverwolfs.silverwolfsbuildingblocks.init.TrapdoorsInit;
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
        RenderTypeLookup.setRenderLayer(DoorInit.LIME_STAINED_ACACIA_DOOR.get(), RenderType.getCutout());
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
        RenderTypeLookup.setRenderLayer(DoorInit.LIME_STAINED_JUNGLE_DOOR.get(), RenderType.getCutout());
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
        RenderTypeLookup.setRenderLayer(DoorInit.LIME_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.MAGENTA_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.ORANGE_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.PINK_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.PURPLE_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.RED_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.WHITE_STAINED_OAK_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(DoorInit.YELLOW_STAINED_OAK_DOOR.get(), RenderType.getCutout());

        //Ladders
        RenderTypeLookup.setRenderLayer(LadderInit.BAMBOO_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.THATCH_LADDER.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(LadderInit.ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLACK_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLUE_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BROWN_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.CYAN_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GRAY_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GREEN_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_BLUE_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_GRAY_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIME_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.MAGENTA_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.ORANGE_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PINK_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PURPLE_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.RED_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.WHITE_ACACIA_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.YELLOW_ACACIA_LADDER.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(LadderInit.BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLACK_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLUE_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BROWN_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.CYAN_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GRAY_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GREEN_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_BLUE_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_GRAY_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIME_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.MAGENTA_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.ORANGE_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PINK_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PURPLE_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.RED_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.WHITE_BIRCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.YELLOW_BIRCH_LADDER.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(LadderInit.DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLACK_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLUE_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BROWN_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.CYAN_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GRAY_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GREEN_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_BLUE_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_GRAY_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIME_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.MAGENTA_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.ORANGE_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PINK_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PURPLE_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.RED_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.WHITE_DARK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.YELLOW_DARK_OAK_LADDER.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(LadderInit.JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLACK_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLUE_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BROWN_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.CYAN_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GRAY_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GREEN_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_BLUE_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_GRAY_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIME_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.MAGENTA_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.ORANGE_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PINK_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PURPLE_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.RED_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.WHITE_JUNGLE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.YELLOW_JUNGLE_LADDER.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(LadderInit.BLACK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLUE_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BROWN_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.CYAN_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GRAY_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GREEN_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_BLUE_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_GRAY_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIME_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.MAGENTA_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.ORANGE_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PINK_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PURPLE_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.RED_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.WHITE_OAK_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.YELLOW_OAK_LADDER.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(LadderInit.SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLACK_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BLUE_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.BROWN_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.CYAN_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GRAY_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.GREEN_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_BLUE_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIGHT_GRAY_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.LIME_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.MAGENTA_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.ORANGE_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PINK_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.PURPLE_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.RED_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.WHITE_SPRUCE_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LadderInit.YELLOW_SPRUCE_LADDER.get(), RenderType.getCutout());

        //trapdoors
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BAMBOO_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.THATCH_TRAPDOOR.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BLACK_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BLUE_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BROWN_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.CYAN_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.GRAY_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.GREEN_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIGHT_BLUE_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIGHT_GRAY_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIME_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.MAGENTA_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.ORANGE_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.PINK_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.PURPLE_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.RED_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.WHITE_ACACIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.YELLOW_ACACIA_TRAPDOOR.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BLACK_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BLUE_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BROWN_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.CYAN_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.GRAY_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.GREEN_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIGHT_BLUE_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIGHT_GRAY_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIME_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.MAGENTA_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.ORANGE_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.PINK_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.PURPLE_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.RED_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.WHITE_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.YELLOW_JUNGLE_TRAPDOOR.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BLACK_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BLUE_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.BROWN_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.CYAN_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.GRAY_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.GREEN_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIGHT_BLUE_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIGHT_GRAY_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.LIME_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.MAGENTA_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.ORANGE_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.PINK_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.PURPLE_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.RED_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.WHITE_OAK_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TrapdoorsInit.YELLOW_OAK_TRAPDOOR.get(), RenderType.getCutout());

    }
}
