
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.scraplandsbyfzprules.world.features.plants.ThunderReedFeature;
import net.mcreator.scraplandsbyfzprules.world.features.plants.StormRoseFeature;
import net.mcreator.scraplandsbyfzprules.world.features.plants.StormBellFeature;
import net.mcreator.scraplandsbyfzprules.world.features.plants.ScrapFlowerFeature;
import net.mcreator.scraplandsbyfzprules.world.features.plants.RoboCropsSmallFeature;
import net.mcreator.scraplandsbyfzprules.world.features.plants.RoboCropsFeature;
import net.mcreator.scraplandsbyfzprules.world.features.plants.IceBlossomFeature;
import net.mcreator.scraplandsbyfzprules.world.features.plants.FairyFungiFeature;
import net.mcreator.scraplandsbyfzprules.BattleOfTheRacesByFzprulesMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class BattleOfTheRacesByFzprulesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES,
			BattleOfTheRacesByFzprulesMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> SCRAP_FLOWER = register("scrap_flower", ScrapFlowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ScrapFlowerFeature.GENERATE_BIOMES, ScrapFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROBO_CROPS = register("robo_crops", RoboCropsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RoboCropsFeature.GENERATE_BIOMES, RoboCropsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROBO_CROPS_SMALL = register("robo_crops_small", RoboCropsSmallFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RoboCropsSmallFeature.GENERATE_BIOMES,
					RoboCropsSmallFeature::placedFeature));
	public static final RegistryObject<Feature<?>> THUNDER_REED = register("thunder_reed", ThunderReedFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ThunderReedFeature.GENERATE_BIOMES, ThunderReedFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ICE_BLOSSOM = register("ice_blossom", IceBlossomFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, IceBlossomFeature.GENERATE_BIOMES, IceBlossomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FAIRY_FUNGI = register("fairy_fungi", FairyFungiFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, FairyFungiFeature.GENERATE_BIOMES, FairyFungiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STORM_ROSE = register("storm_rose", StormRoseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, StormRoseFeature.GENERATE_BIOMES, StormRoseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STORM_BELL = register("storm_bell", StormBellFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, StormBellFeature.GENERATE_BIOMES, StormBellFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
