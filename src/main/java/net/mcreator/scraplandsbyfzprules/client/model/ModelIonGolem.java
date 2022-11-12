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
public class ModelIonGolem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("hard_to_find_biomes_by_fzprules", "model_ion_golem"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LowerBody;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelIonGolem(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LowerBody = root.getChild("LowerBody");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(52, 44).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 18)
						.addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(80, 60)
						.addBox(4.0F, -36.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 60)
						.addBox(-6.0F, -36.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(48, 60).addBox(-4.0F, 12.0F, -6.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-10.0F, -4.0F, -7.0F, 20.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -4.0F, -7.0F, 20.0F, 16.0F, 10.0F, new CubeDeformation(0.25F)).texOffs(60, 0)
						.addBox(-4.0F, -2.0F, 3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 2.0F));
		PartDefinition LowerBody = partdefinition.addOrReplaceChild("LowerBody", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Part4_r1 = LowerBody.addOrReplaceChild("Part4_r1",
				CubeListBuilder.create().texOffs(30, 80).addBox(-1.0F, -12.0F, -5.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition Part3_r1 = LowerBody.addOrReplaceChild("Part3_r1",
				CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, -12.0F, 2.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition Part2_r1 = LowerBody.addOrReplaceChild("Part2_r1",
				CubeListBuilder.create().texOffs(10, 80).addBox(2.0F, -12.0F, -1.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition Part1_r1 = LowerBody.addOrReplaceChild("Part1_r1",
				CubeListBuilder.create().texOffs(20, 80).addBox(-5.0F, -12.0F, -1.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild(
				"LeftArm", CubeListBuilder.create().texOffs(24, 52).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 22.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(66, 74).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-13.0F, -1.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild(
				"RightArm", CubeListBuilder.create().texOffs(0, 52).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 22.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(42, 74).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(13.0F, -1.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LowerBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.LowerBody.yRot = ageInTicks / 20.f;
	}
}
