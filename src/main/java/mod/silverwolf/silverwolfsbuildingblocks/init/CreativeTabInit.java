package mod.silverwolf.silverwolfsbuildingblocks.init;

import mod.silverwolf.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = SilverwolfsBuildingBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SilverwolfsBuildingBlocks.MODID);

    public static final List<Supplier<? extends ItemLike>> TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> SBB = TABS.register("sbb_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.sbb_tab"))
                    .icon(ItemInit.THATCH_BLOCK_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .withSearchBar()
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}
