
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.IceButterflyEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelButterfly;

public class IceButterflyRenderer extends MobRenderer<IceButterflyEntity, ModelButterfly<IceButterflyEntity>> {
	public IceButterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelButterfly(context.bakeLayer(ModelButterfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IceButterflyEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/icebutterfly.png");
	}
}
