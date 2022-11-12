
package net.mcreator.scraplandsbyfzprules.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModEntities;
import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModBlocks;

import java.util.List;

public class LifelessScraplandsBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(0.690476190477f, 0.776190476191f),
			Climate.Parameter.span(-1.042857142857f, -0.957142857143f), Climate.Parameter.span(0.477142857143f, 0.562857142857f),
			Climate.Parameter.span(0.557142857143f, 0.642857142857f), Climate.Parameter.point(0),
			Climate.Parameter.span(0.139301640329f, 0.225015926043f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-6724096).waterFogColor(329011)
				.skyColor(7972607).foliageColorOverride(-6737152).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("hard_to_find_biomes_by_fzprules:tree_lifeless_scraplands",
						FeatureUtils.register("hard_to_find_biomes_by_fzprules:tree_lifeless_scraplands", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(
										BlockStateProvider.simple(HardToFindBiomesByFzprulesModBlocks.ROBOTIC_LOG.get().defaultBlockState()),
										new StraightTrunkPlacer(7, 2, 0),
										BlockStateProvider.simple(HardToFindBiomesByFzprulesModBlocks.SCRAP_SOLAR_PANEL.get().defaultBlockState()),
										new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
										.ignoreVines().build()),
						List.of(CountPlacement.of(3), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("hard_to_find_biomes_by_fzprules:grass_lifeless_scraplands", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("hard_to_find_biomes_by_fzprules:disk_gravel_lifeless_scraplands",
						FeatureUtils.register("hard_to_find_biomes_by_fzprules:disk_gravel_lifeless_scraplands", Feature.DISK,
								new DiskConfiguration(Blocks.GRAVEL.defaultBlockState(), UniformInt.of(2, 5), 2,
										List.of(HardToFindBiomesByFzprulesModBlocks.RUSTY_TOP.get().defaultBlockState(),
												HardToFindBiomesByFzprulesModBlocks.RUSTY_DIRT.get().defaultBlockState()))),
						List.of(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDesertVegetation(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER,
				new MobSpawnSettings.SpawnerData(HardToFindBiomesByFzprulesModEntities.MECHA_SLIME.get(), 120, 1, 3));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(HardToFindBiomesByFzprulesModEntities.ION_SLIME.get(), 90, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER,
				new MobSpawnSettings.SpawnerData(HardToFindBiomesByFzprulesModEntities.ION_DRONE.get(), 100, 4, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE,
				new MobSpawnSettings.SpawnerData(HardToFindBiomesByFzprulesModEntities.SCRAPLANDIAN.get(), 20, 3, 5));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(HardToFindBiomesByFzprulesModEntities.PROTOGEN.get(), 20, 3, 5));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(HardToFindBiomesByFzprulesModEntities.ORBONAUT.get(), 2, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER,
				new MobSpawnSettings.SpawnerData(HardToFindBiomesByFzprulesModEntities.INFECTED_PROTOGEN.get(), 100, 2, 4));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER,
				new MobSpawnSettings.SpawnerData(HardToFindBiomesByFzprulesModEntities.INFECTED_SCRAPLANDIAN.get(), 150, 2, 5));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.NONE).temperature(1.6f).downfall(0f)
				.specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
