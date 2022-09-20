
package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.scraplandsbyfzprules.entity.IonDroneEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelDrone;

public class IonDroneRenderer extends MobRenderer<IonDroneEntity, ModelDrone<IonDroneEntity>> {
	public IonDroneRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDrone(context.bakeLayer(ModelDrone.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<IonDroneEntity, ModelDrone<IonDroneEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/drone_texture_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(IonDroneEntity entity) {
		return new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/drone_texture.png");
	}
}
