// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelButterfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "butterfly"), "main");
	private final ModelPart LeftWing;
	private final ModelPart RightWing;
	private final ModelPart Body;

	public ModelButterfly(ModelPart root) {
		this.LeftWing = root.getChild("LeftWing");
		this.RightWing = root.getChild("RightWing");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing", CubeListBuilder.create().texOffs(0, 13)
				.addBox(1.0F, -2.0F, -6.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-7.0F, -2.0F, -6.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(25, 2).addBox(
				-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftWing.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightWing.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}