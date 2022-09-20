
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.InfectedProtogenEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelProtogen;

public class InfectedProtogenRenderer extends MobRenderer<InfectedProtogenEntity, ModelProtogen<InfectedProtogenEntity>> {
	public InfectedProtogenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelProtogen(context.bakeLayer(ModelProtogen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InfectedProtogenEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/infected_protogen.png");
	}
}
