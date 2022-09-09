// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelOrbonaut<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "orbonaut"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelOrbonaut(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 16)
						.addBox(-6.0F, -7.0F, -2.0F, 12.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 20)
						.addBox(-5.0F, -8.5F, -2.0F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-1.5F, -8.5F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-5.0F, -8.5F, -2.0F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(-1.0F, 8.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.5F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(12, 36)
						.addBox(12.5F, -8.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-15.5F, -8.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 36)
						.addBox(-10.5F, -8.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 36)
						.addBox(7.5F, -8.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.yRot = ageInTicks / 20.f;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.yRot = ageInTicks;
	}
}