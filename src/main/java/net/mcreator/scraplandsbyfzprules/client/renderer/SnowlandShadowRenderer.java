
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.scraplandsbyfzprules.entity.SnowlandShadowEntity;

public class SnowlandShadowRenderer extends HumanoidMobRenderer<SnowlandShadowEntity, HumanoidModel<SnowlandShadowEntity>> {
	public SnowlandShadowRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(SnowlandShadowEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/icecaster.png");
	}
}
