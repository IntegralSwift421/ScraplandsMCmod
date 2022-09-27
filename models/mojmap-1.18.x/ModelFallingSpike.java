// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFallingSpike<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fallingspike"), "main");
	private final ModelPart Block;

	public ModelFallingSpike(ModelPart root) {
		this.Block = root.getChild("Block");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Block = partdefinition.addOrReplaceChild("Block",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -26.0F, -8.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-7.0F, -25.0F, -7.0F, 14.0F, 13.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(88, 0)
						.addBox(-5.0F, -24.0F, -5.0F, 10.0F, 18.0F, 10.0F, new CubeDeformation(0.2F)).texOffs(0, 57)
						.addBox(-3.0F, -22.0F, -3.0F, 6.0F, 20.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(0, 0)
						.addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Block.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}