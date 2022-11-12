
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.scraplandsbyfzprules.potion.BottledBlizzardEffectMobEffect;
import net.mcreator.scraplandsbyfzprules.HardToFindBiomesByFzprulesMod;

public class HardToFindBiomesByFzprulesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS,
			HardToFindBiomesByFzprulesMod.MODID);
	public static final RegistryObject<MobEffect> BOTTLED_BLIZZARD_EFFECT = REGISTRY.register("bottled_blizzard_effect",
			() -> new BottledBlizzardEffectMobEffect());
}
