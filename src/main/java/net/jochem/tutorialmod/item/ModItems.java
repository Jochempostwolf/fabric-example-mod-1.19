package net.jochem.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jochem.tutorialmod.TutorialMod;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COOKIE_DOUGH = registerItem("cookie_dough",
            new Item(new FabricItemSettings().group(ModItemGroup.COOKIES)));
    public static final Item GRANDMAS_DOUGH =registerItem("grandmas_dough",
            new Item(new FabricItemSettings().group(ModItemGroup.COOKIES)));
    public static final Item BAKED_COOKIE = registerItem("baked_cookie",
            new Item(new FabricItemSettings().group(ModItemGroup.COOKIES)
                    .food(new FoodComponent.Builder().snack().hunger(5).saturationModifier(5f).build())));
    public static final Item GRANDMAS_COOKIE = registerItem("grandmas_cookie",
            new Item(new FabricItemSettings().group(ModItemGroup.COOKIES)
                    .food(new FoodComponent.Builder().snack().hunger(6).saturationModifier(7f).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
