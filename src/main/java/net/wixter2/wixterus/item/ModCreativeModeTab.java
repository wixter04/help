package net.wixter2.wixterus.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wixter2.wixterus.WixterusMod;

public class ModCreativeModeTab {
    public  static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WixterusMod.MOD_ID);


    public  static  final RegistryObject<CreativeModeTab> WIXTERUS_TAB = CREATIVE_MODE_TABS.register("wixterus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.WIXTERUS.get()))
                    .title(Component.translatable("creativetab.wixterus_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItem.WIXTERUS.get());
                        pOutput.accept(ModItem.RAW_WIXTERUS.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
