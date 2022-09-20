
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.scraplandsbyfzprules.block.ThunderReedBlock;
import net.mcreator.scraplandsbyfzprules.block.ThunderProcessorBlock;
import net.mcreator.scraplandsbyfzprules.block.ScrapSolarPanelBlock;
import net.mcreator.scraplandsbyfzprules.block.ScrapPileBlock;
import net.mcreator.scraplandsbyfzprules.block.ScrapPaneBlockBlock;
import net.mcreator.scraplandsbyfzprules.block.ScrapFlowerBlock;
import net.mcreator.scraplandsbyfzprules.block.ScrapBricksBlock;
import net.mcreator.scraplandsbyfzprules.block.RustyTopBlock;
import net.mcreator.scraplandsbyfzprules.block.RustyDirtBlock;
import net.mcreator.scraplandsbyfzprules.block.RoboticLogBlock;
import net.mcreator.scraplandsbyfzprules.block.RoboCropsSmallBlock;
import net.mcreator.scraplandsbyfzprules.block.RoboCropsBlock;
import net.mcreator.scraplandsbyfzprules.BattleOfTheRacesByFzprulesMod;

public class BattleOfTheRacesByFzprulesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BattleOfTheRacesByFzprulesMod.MODID);
	public static final RegistryObject<Block> RUSTY_DIRT = REGISTRY.register("rusty_dirt", () -> new RustyDirtBlock());
	public static final RegistryObject<Block> RUSTY_TOP = REGISTRY.register("rusty_top", () -> new RustyTopBlock());
	public static final RegistryObject<Block> SCRAP_BRICKS = REGISTRY.register("scrap_bricks", () -> new ScrapBricksBlock());
	public static final RegistryObject<Block> SCRAP_PANE_BLOCK = REGISTRY.register("scrap_pane_block", () -> new ScrapPaneBlockBlock());
	public static final RegistryObject<Block> SCRAP_PILE = REGISTRY.register("scrap_pile", () -> new ScrapPileBlock());
	public static final RegistryObject<Block> ROBOTIC_LOG = REGISTRY.register("robotic_log", () -> new RoboticLogBlock());
	public static final RegistryObject<Block> SCRAP_SOLAR_PANEL = REGISTRY.register("scrap_solar_panel", () -> new ScrapSolarPanelBlock());
	public static final RegistryObject<Block> SCRAP_FLOWER = REGISTRY.register("scrap_flower", () -> new ScrapFlowerBlock());
	public static final RegistryObject<Block> ROBO_CROPS = REGISTRY.register("robo_crops", () -> new RoboCropsBlock());
	public static final RegistryObject<Block> ROBO_CROPS_SMALL = REGISTRY.register("robo_crops_small", () -> new RoboCropsSmallBlock());
	public static final RegistryObject<Block> THUNDER_REED = REGISTRY.register("thunder_reed", () -> new ThunderReedBlock());
	public static final RegistryObject<Block> THUNDER_PROCESSOR = REGISTRY.register("thunder_processor", () -> new ThunderProcessorBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ScrapFlowerBlock.registerRenderLayer();
			RoboCropsBlock.registerRenderLayer();
			RoboCropsSmallBlock.registerRenderLayer();
			ThunderReedBlock.registerRenderLayer();
		}
	}
}