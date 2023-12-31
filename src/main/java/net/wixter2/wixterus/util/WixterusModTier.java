package net.wixter2.wixterus.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.wixter2.wixterus.WixterusMod;
import net.wixter2.wixterus.item.ModItems;
import net.wixter2.wixterus.util.ModTags;

import java.util.List;

public class WixterusModTier  {
    public static  final Tier WIXTERUS = TierSortingRegistry.registerTier(
            new ForgeTier(5,2400,8,0 , 19 ,
                    ModTags.Blocks.NEED_WIXTERUS_TOOL , () -> Ingredient.of(ModItems.WIXTERUS.get())),
            new ResourceLocation(WixterusMod.MOD_ID , "wixterus") , List.of(Tiers.NETHERITE), List.of()
    );
}
