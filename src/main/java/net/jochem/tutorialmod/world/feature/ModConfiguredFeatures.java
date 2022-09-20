package net.jochem.tutorialmod.world.feature;

import net.jochem.tutorialmod.TutorialMod;
import net.jochem.tutorialmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_TANZANITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.COOKIE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_COOKIE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> COOKIE_ORE =
            ConfiguredFeatures.register("cookie_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TANZANITE_ORES, 9));


    public static void registerConfiguredFeatures() {
        TutorialMod.LOGGER.debug("Registering the ModComfiguredFeatures for " + TutorialMod.MOD_ID);
    }
}
