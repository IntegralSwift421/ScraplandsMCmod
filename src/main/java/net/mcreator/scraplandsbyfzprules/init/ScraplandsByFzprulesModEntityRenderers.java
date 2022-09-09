
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.scraplandsbyfzprules.client.renderer.ScraplandianRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.ProtogenRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.OrbonautRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.MechaSlimeRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IonSlimeRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IonDroneRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ScraplandsByFzprulesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ScraplandsByFzprulesModEntities.MECHA_SLIME.get(), MechaSlimeRenderer::new);
		event.registerEntityRenderer(ScraplandsByFzprulesModEntities.ION_SLIME.get(), IonSlimeRenderer::new);
		event.registerEntityRenderer(ScraplandsByFzprulesModEntities.ION_DRONE.get(), IonDroneRenderer::new);
		event.registerEntityRenderer(ScraplandsByFzprulesModEntities.SCRAPLANDIAN.get(), ScraplandianRenderer::new);
		event.registerEntityRenderer(ScraplandsByFzprulesModEntities.PROTOGEN.get(), ProtogenRenderer::new);
		event.registerEntityRenderer(ScraplandsByFzprulesModEntities.THUNDERSHOCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ScraplandsByFzprulesModEntities.ORBONAUT.get(), OrbonautRenderer::new);
	}
}
