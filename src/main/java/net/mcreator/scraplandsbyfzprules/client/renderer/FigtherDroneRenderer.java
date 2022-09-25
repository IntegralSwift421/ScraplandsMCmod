
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.FigtherDroneEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelDrone;

public class FigtherDroneRenderer extends MobRenderer<FigtherDroneEntity, ModelDrone<FigtherDroneEntity>> {
	public FigtherDroneRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDrone(context.bakeLayer(ModelDrone.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FigtherDroneEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/rougedrone.png");
	}
}
