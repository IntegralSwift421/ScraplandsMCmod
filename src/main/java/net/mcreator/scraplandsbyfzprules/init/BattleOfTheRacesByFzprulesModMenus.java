
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.scraplandsbyfzprules.world.inventory.ThunderShopMenu;
import net.mcreator.scraplandsbyfzprules.world.inventory.ScraplandianMenuMenu;
import net.mcreator.scraplandsbyfzprules.world.inventory.ProtoInventoryMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BattleOfTheRacesByFzprulesModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<ScraplandianMenuMenu> SCRAPLANDIAN_MENU = register("scraplandian_menu",
			(id, inv, extraData) -> new ScraplandianMenuMenu(id, inv, extraData));
	public static final MenuType<ProtoInventoryMenu> PROTO_INVENTORY = register("proto_inventory",
			(id, inv, extraData) -> new ProtoInventoryMenu(id, inv, extraData));
	public static final MenuType<ThunderShopMenu> THUNDER_SHOP = register("thunder_shop",
			(id, inv, extraData) -> new ThunderShopMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
