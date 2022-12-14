
package net.mcreator.scraplandsbyfzprules.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.scraplandsbyfzprules.world.inventory.ThunderShopMenu;
import net.mcreator.scraplandsbyfzprules.network.ThunderShopButtonMessage;
import net.mcreator.scraplandsbyfzprules.HardToFindBiomesByFzprulesMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ThunderShopScreen extends AbstractContainerScreen<ThunderShopMenu> {
	private final static HashMap<String, Object> guistate = ThunderShopMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ThunderShopScreen(ThunderShopMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("hard_to_find_biomes_by_fzprules:textures/screens/thunder_shop.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("hard_to_find_biomes_by_fzprules:textures/screens/arrow.png"));
		this.blit(ms, this.leftPos + 69, this.topPos + 52, 0, 0, 32, 16, 32, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Trade Menu", 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 60, this.topPos + 25, 51, 20, new TextComponent("Trade"), e -> {
			if (true) {
				HardToFindBiomesByFzprulesMod.PACKET_HANDLER.sendToServer(new ThunderShopButtonMessage(0, x, y, z));
				ThunderShopButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
