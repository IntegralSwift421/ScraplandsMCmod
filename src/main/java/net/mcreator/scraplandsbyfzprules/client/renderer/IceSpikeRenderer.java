
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.IceSpikeEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelFallingSpike;

public class IceSpikeRenderer extends MobRenderer<IceSpikeEntity, ModelFallingSpike<IceSpikeEntity>> {
	public IceSpikeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFallingSpike(context.bakeLayer(ModelFallingSpike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IceSpikeEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/iceicle.png");
	}
}
