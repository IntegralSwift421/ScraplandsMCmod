
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.SnowshellEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelTortise;

public class SnowshellRenderer extends MobRenderer<SnowshellEntity, ModelTortise<SnowshellEntity>> {
	public SnowshellRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTortise(context.bakeLayer(ModelTortise.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowshellEntity entity) {
		return new ResourceLocation("hard_to_find_biomes_by_fzprules:textures/entities/icetortise.png");
	}
}
