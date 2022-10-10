
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.scraplandsbyfzprules.client.renderer.SnowshellRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.SnowpileRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.SnowlandShadowRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.SnowlandHunterRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.SnowlandFurryRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.ScraplandianRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.ProtogenRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.OrbonautRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.MotherdroneRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.MechaSlimeRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.MagmashellRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IonSlimeRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IonGiantRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IonDroneRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.InfectedScraplandianRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.InfectedProtogenRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IceWispRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IceSpikeRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IceSeerRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IceButterflyRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.FrozenRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.FigtherDroneRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.FairycrystalWandRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BattleOfTheRacesByFzprulesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.MECHA_SLIME.get(), MechaSlimeRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.ION_SLIME.get(), IonSlimeRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.ION_DRONE.get(), IonDroneRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.SCRAPLANDIAN.get(), ScraplandianRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.PROTOGEN.get(), ProtogenRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.THUNDERSHOCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.ORBONAUT.get(), OrbonautRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.ION_GIANT.get(), IonGiantRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.INFECTED_SCRAPLANDIAN.get(), InfectedScraplandianRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.INFECTED_PROTOGEN.get(), InfectedProtogenRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.MOTHERDRONE.get(), MotherdroneRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.FIGTHER_DRONE.get(), FigtherDroneRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.FROZEN.get(), FrozenRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.SNOW_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.SNOWPILE.get(), SnowpileRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.ICE_BUTTERFLY.get(), IceButterflyRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.SNOWLAND_HUNTER.get(), SnowlandHunterRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.SNOWLAND_FURRY.get(), SnowlandFurryRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.SNOWLAND_SHADOW.get(), SnowlandShadowRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.ICE_WISP.get(), IceWispRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.ICE_SEER.get(), IceSeerRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.ICE_SPIKE.get(), IceSpikeRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.FAIRYCRYSTAL_WAND.get(), FairycrystalWandRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.DIAMOND_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.EMERALD_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.TOPAZ_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.SNOWSHELL.get(), SnowshellRenderer::new);
		event.registerEntityRenderer(BattleOfTheRacesByFzprulesModEntities.MAGMASHELL.get(), MagmashellRenderer::new);
	}
}
