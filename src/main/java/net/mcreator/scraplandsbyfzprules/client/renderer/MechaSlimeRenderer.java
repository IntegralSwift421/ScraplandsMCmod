
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.scraplandsbyfzprules.entity.MechaSlimeEntity;

public class MechaSlimeRenderer extends MobRenderer<MechaSlimeEntity, SlimeModel<MechaSlimeEntity>> {
	public MechaSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechaSlimeEntity entity) {
		return new ResourceLocation("hard_to_find_biomes_by_fzprules:textures/entities/slime3.png");
	}
}
