
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.scraplandsbyfzprules.client.gui.WandforgeGUIScreen;
import net.mcreator.scraplandsbyfzprules.client.gui.ThunderShopScreen;
import net.mcreator.scraplandsbyfzprules.client.gui.ScraplandianMenuScreen;
import net.mcreator.scraplandsbyfzprules.client.gui.ProtoInventoryScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HardToFindBiomesByFzprulesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HardToFindBiomesByFzprulesModMenus.SCRAPLANDIAN_MENU, ScraplandianMenuScreen::new);
			MenuScreens.register(HardToFindBiomesByFzprulesModMenus.PROTO_INVENTORY, ProtoInventoryScreen::new);
			MenuScreens.register(HardToFindBiomesByFzprulesModMenus.THUNDER_SHOP, ThunderShopScreen::new);
			MenuScreens.register(HardToFindBiomesByFzprulesModMenus.WANDFORGE_GUI, WandforgeGUIScreen::new);
		});
	}
}
