
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.OrbonautEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelOrbonaut;

public class OrbonautRenderer extends MobRenderer<OrbonautEntity, ModelOrbonaut<OrbonautEntity>> {
	public OrbonautRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelOrbonaut(context.bakeLayer(ModelOrbonaut.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrbonautEntity entity) {
		return new ResourceLocation("scraplands_by_fzprules:textures/entities/orbonauttexture.png");
	}
}
