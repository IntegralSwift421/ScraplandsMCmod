
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.MotherdroneEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelMotherdrone;

public class MotherdroneRenderer extends MobRenderer<MotherdroneEntity, ModelMotherdrone<MotherdroneEntity>> {
	public MotherdroneRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMotherdrone(context.bakeLayer(ModelMotherdrone.LAYER_LOCATION)), 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(MotherdroneEntity entity) {
		return new ResourceLocation("hard_to_find_biomes_by_fzprules:textures/entities/motherdrone.png");
	}
}
