package net.mcreator.scraplandsbyfzprules.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.Main;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.Main;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.main.Main;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMotherdrone<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("battle_of_the_races_by_fzprules", "model_motherdrone"), "main");
	public final ModelPart Main;
	public final ModelPart Part1;
	public final ModelPart Part2;
	public final ModelPart Part3;

	public ModelMotherdrone(ModelPart root) {
		this.Main = root.getChild("Main");
		this.Part1 = root.getChild("Part1");
		this.Part2 = root.getChild("Part2");
		this.Part3 = root.getChild("Part3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Main = partdefinition.addOrReplaceChild("Main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-19.0F, -31.8333F, -19.0F, 38.0F, 32.0F, 38.0F, new CubeDeformation(0.0F))
						.texOffs(114, 0).addBox(-9.0F, 0.1667F, -9.0F, 18.0F, 9.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.8333F, 0.0F));
		PartDefinition Part1 = partdefinition.addOrReplaceChild("Part1",
				CubeListBuilder.create().texOffs(84, 102).addBox(-56.0F, -1.0F, -14.0F, 28.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -23.0F, 0.0F));
		PartDefinition four_r1 = Part1.addOrReplaceChild("four_r1",
				CubeListBuilder.create().texOffs(0, 70).addBox(-56.0F, -24.0F, -14.0F, 28.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition three_r1 = Part1.addOrReplaceChild("three_r1",
				CubeListBuilder.create().texOffs(84, 72).addBox(-56.0F, -24.0F, -14.0F, 28.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition two_r1 = Part1.addOrReplaceChild("two_r1",
				CubeListBuilder.create().texOffs(0, 100).addBox(-56.0F, -24.0F, -14.0F, 28.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Part2 = partdefinition.addOrReplaceChild("Part2",
				CubeListBuilder.create().texOffs(0, 148).addBox(-34.0F, -1.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition eigth_r1 = Part2.addOrReplaceChild("eigth_r1",
				CubeListBuilder.create().texOffs(0, 130).addBox(-34.0F, -24.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition seven_r1 = Part2.addOrReplaceChild("seven_r1",
				CubeListBuilder.create().texOffs(48, 132).addBox(-34.0F, -24.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition six_r1 = Part2.addOrReplaceChild("six_r1",
				CubeListBuilder.create().texOffs(48, 150).addBox(-34.0F, -24.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Part3 = partdefinition.addOrReplaceChild("Part3",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Part1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Part2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Part3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Part2.yRot = ageInTicks / 20.f;
		this.Part1.yRot = ageInTicks;
	}
}
