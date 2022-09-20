
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.scraplandsbyfzprules.entity.IonGiantEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelIonGolem;

public class IonGiantRenderer extends MobRenderer<IonGiantEntity, ModelIonGolem<IonGiantEntity>> {
	public IonGiantRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIonGolem(context.bakeLayer(ModelIonGolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IonGiantEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/iongolem_texture.png");
	}
}
