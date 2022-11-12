
package net.mcreator.scraplandsbyfzprules.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModItems;

import java.util.List;

public class SnowballerEnchantment extends Enchantment {
	public SnowballerEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(HardToFindBiomesByFzprulesModItems.ICE_SWORD.get(), HardToFindBiomesByFzprulesModItems.ICE_AXE.get(),
				HardToFindBiomesByFzprulesModItems.ICE_SICKLE.get(), HardToFindBiomesByFzprulesModItems.ICE_HAMMER.get(),
				HardToFindBiomesByFzprulesModItems.ICE_SCYTHE.get(), Items.BOW, HardToFindBiomesByFzprulesModItems.SNOW_STAFF.get(),
				HardToFindBiomesByFzprulesModItems.SCRAP_PIPE.get()).contains(item);
	}
}
