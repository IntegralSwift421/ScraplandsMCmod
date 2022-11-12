
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.scraplandsbyfzprules.client.model.ModelVolcanicArmor;
import net.mcreator.scraplandsbyfzprules.client.model.ModelTortise;
import net.mcreator.scraplandsbyfzprules.client.model.ModelSpell;
import net.mcreator.scraplandsbyfzprules.client.model.ModelSnowpile;
import net.mcreator.scraplandsbyfzprules.client.model.ModelSeer;
import net.mcreator.scraplandsbyfzprules.client.model.ModelProtogen;
import net.mcreator.scraplandsbyfzprules.client.model.ModelOrbonaut;
import net.mcreator.scraplandsbyfzprules.client.model.ModelMushroom;
import net.mcreator.scraplandsbyfzprules.client.model.ModelMotherdrone;
import net.mcreator.scraplandsbyfzprules.client.model.ModelIonGolem;
import net.mcreator.scraplandsbyfzprules.client.model.ModelFungus;
import net.mcreator.scraplandsbyfzprules.client.model.ModelFallingSpike;
import net.mcreator.scraplandsbyfzprules.client.model.ModelFairyArmor;
import net.mcreator.scraplandsbyfzprules.client.model.ModelElectron;
import net.mcreator.scraplandsbyfzprules.client.model.ModelDrone;
import net.mcreator.scraplandsbyfzprules.client.model.ModelButterfly;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HardToFindBiomesByFzprulesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelFallingSpike.LAYER_LOCATION, ModelFallingSpike::createBodyLayer);
		event.registerLayerDefinition(ModelIonGolem.LAYER_LOCATION, ModelIonGolem::createBodyLayer);
		event.registerLayerDefinition(ModelProtogen.LAYER_LOCATION, ModelProtogen::createBodyLayer);
		event.registerLayerDefinition(ModelElectron.LAYER_LOCATION, ModelElectron::createBodyLayer);
		event.registerLayerDefinition(ModelSnowpile.LAYER_LOCATION, ModelSnowpile::createBodyLayer);
		event.registerLayerDefinition(ModelSpell.LAYER_LOCATION, ModelSpell::createBodyLayer);
		event.registerLayerDefinition(ModelButterfly.LAYER_LOCATION, ModelButterfly::createBodyLayer);
		event.registerLayerDefinition(ModelFungus.LAYER_LOCATION, ModelFungus::createBodyLayer);
		event.registerLayerDefinition(ModelMotherdrone.LAYER_LOCATION, ModelMotherdrone::createBodyLayer);
		event.registerLayerDefinition(ModelMushroom.LAYER_LOCATION, ModelMushroom::createBodyLayer);
		event.registerLayerDefinition(ModelVolcanicArmor.LAYER_LOCATION, ModelVolcanicArmor::createBodyLayer);
		event.registerLayerDefinition(ModelFairyArmor.LAYER_LOCATION, ModelFairyArmor::createBodyLayer);
		event.registerLayerDefinition(ModelOrbonaut.LAYER_LOCATION, ModelOrbonaut::createBodyLayer);
		event.registerLayerDefinition(ModelSeer.LAYER_LOCATION, ModelSeer::createBodyLayer);
		event.registerLayerDefinition(ModelTortise.LAYER_LOCATION, ModelTortise::createBodyLayer);
		event.registerLayerDefinition(ModelDrone.LAYER_LOCATION, ModelDrone::createBodyLayer);
	}
}
