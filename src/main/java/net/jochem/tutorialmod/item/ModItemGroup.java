package net.jochem.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.jochem.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COOKIES = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "cookies"), () -> new ItemStack(ModItems.COOKIE_DOUGH));
}
