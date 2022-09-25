
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.scraplandsbyfzprules.entity.IceWispEntity;

public class IceWispRenderer extends MobRenderer<IceWispEntity, SlimeModel<IceWispEntity>> {
	public IceWispRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IceWispEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/icewisp.png");
	}
}
