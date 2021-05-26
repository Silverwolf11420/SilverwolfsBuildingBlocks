package mod.silverwolfs.silverwolfsbuildingblocks.util;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import mod.silverwolfs.silverwolfsbuildingblocks.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.DyeColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SilverwolfsBuildingBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        RenderTypeLookup.setRenderLayer(BlockInit.THATCH_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.THATCH_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.THATCH_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_WALL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_WALL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_WALL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_WALL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_WALL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_WALL_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_WALL_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_WALL_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_WALL_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_SOUL_TORCH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_WALL_SOUL_TORCH.get(), RenderType.getCutout());

        /*for (DyeColor color : DyeColor.values()) {

            for (WoodenPlank plank : WoodenPlank.values()) {
                RenderTypeLookup.setRenderLayer(BlockInit.DOORS.get(plank).get(color.getId()).get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.LADDERS.get(plank).get(color.getId()).get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.TRAPDOORS.get(plank).get(color.getId()).get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.TORCHES.get(plank).get(color.getId()).get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.WALL_TORCHES.get(plank).get(color.getId()).get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.SOUL_TORCHES.get(plank).get(color.getId()).get(), RenderType.getCutout());
                RenderTypeLookup.setRenderLayer(BlockInit.WALL_SOUL_TORCHES.get(plank).get(color.getId()).get(), RenderType.getCutout());
            }
        }*/
    }
}
