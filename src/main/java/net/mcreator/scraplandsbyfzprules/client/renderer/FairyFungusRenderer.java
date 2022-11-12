
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.FairyFungusEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelFungus;

public class FairyFungusRenderer extends MobRenderer<FairyFungusEntity, ModelFungus<FairyFungusEntity>> {
	public FairyFungusRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFungus(context.bakeLayer(ModelFungus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FairyFungusEntity entity) {
		return new ResourceLocation("hard_to_find_biomes_by_fzprules:textures/entities/purple_fungus.png");
	}
}
