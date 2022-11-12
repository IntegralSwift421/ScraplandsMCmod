
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.ElectronEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelElectron;

public class ElectronRenderer extends MobRenderer<ElectronEntity, ModelElectron<ElectronEntity>> {
	public ElectronRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelElectron(context.bakeLayer(ModelElectron.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElectronEntity entity) {
		return new ResourceLocation("hard_to_find_biomes_by_fzprules:textures/entities/electron.png");
	}
}
