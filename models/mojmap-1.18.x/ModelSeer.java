// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSeer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "seer"), "main");
	private final ModelPart Hood;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Cape;

	public ModelSeer(ModelPart root) {
		this.Hood = root.getChild("Hood");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Cape = root.getChild("Cape");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Hood = partdefinition.addOrReplaceChild("Hood",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-12.0F, -63.0F, -12.0F, 24.0F, 24.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-11.0F, -62.0F, -11.0F, 22.0F, 22.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(72, 0)
				.addBox(-6.0F, -14.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(76, 80)
						.addBox(-9.0F, -41.0F, -6.0F, 18.0F, 40.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(10, 143)
						.addBox(-9.0F, -22.0F, -6.0F, 18.0F, 12.0F, 12.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 92).addBox(-5.0F, -5.0F, -6.0F, 12.0F, 32.0F, 12.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(13.0F, -11.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(88, 36).addBox(-7.0F, -5.0F, -6.0F, 12.0F, 32.0F, 12.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-13.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Cape = partdefinition.addOrReplaceChild("Cape",
				CubeListBuilder.create().texOffs(120, 0).addBox(-8.0F, -1.0F, -1.0F, 16.0F, 32.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, 6.0F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Hood.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Cape.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Cape.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}