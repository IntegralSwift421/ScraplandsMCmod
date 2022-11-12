
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.scraplandsbyfzprules.HardToFindBiomesByFzprulesMod;

public class HardToFindBiomesByFzprulesModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, HardToFindBiomesByFzprulesMod.MODID);
	public static final RegistryObject<Potion> BOTTLED_BLIZZARD = REGISTRY.register("bottled_blizzard",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 2, false, false),
					new MobEffectInstance(MobEffects.WITHER, 3600, 0, false, false)));
}
