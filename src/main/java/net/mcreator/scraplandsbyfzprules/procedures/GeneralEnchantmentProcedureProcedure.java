package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModEnchantments;

public class GeneralEnchantmentProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(HardToFindBiomesByFzprulesModEnchantments.FROST_BITER.get(), itemstack) >= 1
				|| EnchantmentHelper.getItemEnchantmentLevel(HardToFindBiomesByFzprulesModEnchantments.SNOWBALLER.get(), itemstack) >= 1) {
			IceToolDebuffsProcedure.execute(world, x, y, z, entity, itemstack);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(HardToFindBiomesByFzprulesModEnchantments.SPLASH.get(), itemstack) >= 1) {
			SplashEffectProcedure.execute(entity, itemstack);
		}
	}
}
