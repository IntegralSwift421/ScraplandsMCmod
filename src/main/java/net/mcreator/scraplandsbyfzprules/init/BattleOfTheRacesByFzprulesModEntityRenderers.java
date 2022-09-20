
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
import net.mcreator.scraplandsbyfzprules.client.renderer.IonGiantRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.IonDroneRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.InfectedScraplandianRenderer;
import net.mcreator.scraplandsbyfzprules.client.renderer.InfectedProtogenRenderer;

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
	}
}
