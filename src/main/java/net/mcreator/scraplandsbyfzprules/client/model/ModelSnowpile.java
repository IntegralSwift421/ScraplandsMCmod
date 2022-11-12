package net.mcreator.scraplandsbyfzprules.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSnowpile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("hard_to_find_biomes_by_fzprules", "model_snowpile"), "main");
	public final ModelPart Body;
	public final ModelPart Branch;

	public ModelSnowpile(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Branch = root.getChild("Branch");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-8.0F, -2.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -19.0F, -4.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Ice_r1 = Body.addOrReplaceChild("Ice_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.3238F, 0.0718F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -12.0F, 10.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Ice_r2 = Body.addOrReplaceChild("Ice_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 4.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition Branch = partdefinition.addOrReplaceChild("Branch",
				CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -23.0F, -15.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Branch.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Branch.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
