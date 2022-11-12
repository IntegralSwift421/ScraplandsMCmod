
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
import net.mcreator.scraplandsbyfzprules.client.renderer.FairyFungusRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.FairyFungiThrowableRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.ElectronRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HardToFindBiomesByFzprulesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.MECHA_SLIME.get(), MechaSlimeRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ION_SLIME.get(), IonSlimeRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ION_DRONE.get(), IonDroneRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.SCRAPLANDIAN.get(), ScraplandianRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.PROTOGEN.get(), ProtogenRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.THUNDERSHOCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ORBONAUT.get(), OrbonautRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ION_GIANT.get(), IonGiantRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.INFECTED_SCRAPLANDIAN.get(), InfectedScraplandianRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.INFECTED_PROTOGEN.get(), InfectedProtogenRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.MOTHERDRONE.get(), MotherdroneRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.FIGTHER_DRONE.get(), FigtherDroneRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.FROZEN.get(), FrozenRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.SNOW_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.SNOWPILE.get(), SnowpileRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ICE_BUTTERFLY.get(), IceButterflyRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.SNOWLAND_HUNTER.get(), SnowlandHunterRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.SNOWLAND_FURRY.get(), SnowlandFurryRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.SNOWLAND_SHADOW.get(), SnowlandShadowRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ICE_WISP.get(), IceWispRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ICE_SEER.get(), IceSeerRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ICE_SPIKE.get(), IceSpikeRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.FAIRYCRYSTAL_WAND.get(), FairycrystalWandRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.DIAMOND_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.EMERALD_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.TOPAZ_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.SNOWSHELL.get(), SnowshellRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.MAGMASHELL.get(), MagmashellRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.FAIRY_FUNGUS.get(), FairyFungusRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.FAIRY_FUNGI_THROWABLE.get(), FairyFungiThrowableRenderer::new);
		event.registerEntityRenderer(HardToFindBiomesByFzprulesModEntities.ELECTRON.get(), ElectronRenderer::new);
	}
}
