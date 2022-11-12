
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.MagmashellEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelTortise;

public class MagmashellRenderer extends MobRenderer<MagmashellEntity, ModelTortise<MagmashellEntity>> {
	public MagmashellRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTortise(context.bakeLayer(ModelTortise.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MagmashellEntity entity) {
		return new ResourceLocation("hard_to_find_biomes_by_fzprules:textures/entities/magmatortise.png");
	}
}
