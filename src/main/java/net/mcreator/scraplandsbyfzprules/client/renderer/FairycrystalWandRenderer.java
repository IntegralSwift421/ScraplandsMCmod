package net.mcreator.scraplandsbyfzprules.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.scraplandsbyfzprules.entity.FairycrystalWandEntity;
import net.mcreator.scraplandsbyfzprules.client.model.ModelSpell;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FairycrystalWandRenderer extends EntityRenderer<FairycrystalWandEntity> {
	private static final ResourceLocation texture = new ResourceLocation("battle_of_the_races_by_fzprules:textures/entities/magicball.png");
	private final ModelSpell model;

	public FairycrystalWandRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelSpell(context.bakeLayer(ModelSpell.LAYER_LOCATION));
	}

	@Override
	public void render(FairycrystalWandEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(FairycrystalWandEntity entity) {
		return texture;
	}
}
