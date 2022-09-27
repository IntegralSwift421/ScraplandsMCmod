
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.IceSeerEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelSeer;

public class IceSeerRenderer extends MobRenderer<IceSeerEntity, ModelSeer<IceSeerEntity>> {
	public IceSeerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSeer(context.bakeLayer(ModelSeer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IceSeerEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/iceseer.png");
	}
}
