
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.scraplandsbyfzprules.client.model.ModelProtogen;
import net.mcreator.scraplandsbyfzprules.client.model.ModelOrbonaut;
import net.mcreator.scraplandsbyfzprules.client.model.ModelDrone;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ScraplandsByFzprulesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelProtogen.LAYER_LOCATION, ModelProtogen::createBodyLayer);
		event.registerLayerDefinition(ModelOrbonaut.LAYER_LOCATION, ModelOrbonaut::createBodyLayer);
		event.registerLayerDefinition(ModelDrone.LAYER_LOCATION, ModelDrone::createBodyLayer);
	}
}
