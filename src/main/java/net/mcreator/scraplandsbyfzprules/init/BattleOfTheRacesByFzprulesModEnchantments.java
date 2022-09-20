
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.scraplandsbyfzprules.enchantment.SplashEnchantment;
import net.mcreator.scraplandsbyfzprules.BattleOfTheRacesByFzprulesMod;

public class BattleOfTheRacesByFzprulesModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS,
			BattleOfTheRacesByFzprulesMod.MODID);
	public static final RegistryObject<Enchantment> SPLASH = REGISTRY.register("splash", () -> new SplashEnchantment());
}
