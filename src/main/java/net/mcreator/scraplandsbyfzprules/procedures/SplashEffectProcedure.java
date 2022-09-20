package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.scraplandsbyfzprules.init.BattleOfTheRacesByFzprulesModEnchantments;

public class SplashEffectProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(BattleOfTheRacesByFzprulesModEnchantments.SPLASH.get(), itemstack) == 1) {
			if (entity.getPersistentData().getBoolean("Robotic")) {
				entity.hurt(DamageSource.GENERIC, 1);
			}
			entity.clearFire();
		}
	}
}
