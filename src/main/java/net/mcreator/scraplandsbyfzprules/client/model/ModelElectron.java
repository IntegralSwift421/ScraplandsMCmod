package net.mcreator.scraplandsbyfzprules.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelElectron<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("hard_to_find_biomes_by_fzprules", "model_electron"), "main");
	public final ModelPart Body;
	public final ModelPart Ring1;
	public final ModelPart Ring2;

	public ModelElectron(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Ring1 = root.getChild("Ring1");
		this.Ring2 = root.getChild("Ring2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Ring1 = partdefinition.addOrReplaceChild("Ring1",
				CubeListBuilder.create().texOffs(12, 16).addBox(-14.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r1 = Ring1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-14.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = Ring1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(12, 16).addBox(-14.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r3 = Ring1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 16).addBox(-14.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Ring2 = partdefinition.addOrReplaceChild("Ring2",
				CubeListBuilder.create().texOffs(0, 16).addBox(-14.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, -0.7854F, -0.5236F));
		PartDefinition cube_r4 = Ring2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 16).addBox(-14.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r5 = Ring2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 16).addBox(-14.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r6 = Ring2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(12, 16).addBox(-14.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Ring1.yRot = ageInTicks;
		this.Ring2.yRot = ageInTicks;
		this.Body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Body.xRot = headPitch / (180F / (float) Math.PI);
	}
}
