
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.scraplandsbyfzprules.enchantment.SplashEnchantment;
import net.mcreator.scraplandsbyfzprules.enchantment.SnowballerEnchantment;
import net.mcreator.scraplandsbyfzprules.enchantment.FrostBiterEnchantment;
import net.mcreator.scraplandsbyfzprules.HardToFindBiomesByFzprulesMod;

public class HardToFindBiomesByFzprulesModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS,
			HardToFindBiomesByFzprulesMod.MODID);
	public static final RegistryObject<Enchantment> SPLASH = REGISTRY.register("splash", () -> new SplashEnchantment());
	public static final RegistryObject<Enchantment> FROST_BITER = REGISTRY.register("frost_biter", () -> new FrostBiterEnchantment());
	public static final RegistryObject<Enchantment> SNOWBALLER = REGISTRY.register("snowballer", () -> new SnowballerEnchantment());
}
