// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSpell<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spell"), "main");
	private final ModelPart Sphere;
	private final ModelPart Ring;

	public ModelSpell(ModelPart root) {
		this.Sphere = root.getChild("Sphere");
		this.Ring = root.getChild("Ring");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Sphere = partdefinition.addOrReplaceChild("Sphere",
				CubeListBuilder.create().texOffs(9, 11)
						.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Ring = partdefinition.addOrReplaceChild("Ring", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -3.0F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Sphere.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Sphere.zRot = ageInTicks;
		this.Ring.xRot = ageInTicks;
	}
}