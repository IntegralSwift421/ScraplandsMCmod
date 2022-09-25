
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.SnowpileEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelSnowpile;

public class SnowpileRenderer extends MobRenderer<SnowpileEntity, ModelSnowpile<SnowpileEntity>> {
	public SnowpileRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSnowpile(context.bakeLayer(ModelSnowpile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowpileEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/snowpile_my_beloved.png");
	}
}
