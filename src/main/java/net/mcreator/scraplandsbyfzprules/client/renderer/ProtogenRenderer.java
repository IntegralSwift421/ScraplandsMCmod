
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.ProtogenEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelProtogen;

public class ProtogenRenderer extends MobRenderer<ProtogenEntity, ModelProtogen<ProtogenEntity>> {
	public ProtogenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelProtogen(context.bakeLayer(ModelProtogen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProtogenEntity entity) {
		return new ResourceLocation("scraplands_by_fzprules:textures/entities/prototexture.png");
	}
}
