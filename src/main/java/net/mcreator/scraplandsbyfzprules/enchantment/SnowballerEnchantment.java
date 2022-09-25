
package net.mcreator.scraplandsbyfzprules.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.scraplandsbyfzprules.init.BattleOfTheRacesByFzprulesModItems;

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
		return item == BattleOfTheRacesByFzprulesModItems.ICE_SWORD.get() || item == BattleOfTheRacesByFzprulesModItems.ICE_AXE.get()
				|| item == BattleOfTheRacesByFzprulesModItems.ICE_SICKLE.get() || item == BattleOfTheRacesByFzprulesModItems.ICE_HAMMER.get()
				|| item == BattleOfTheRacesByFzprulesModItems.ICE_SCYTHE.get() || item == Items.BOW
				|| item == BattleOfTheRacesByFzprulesModItems.SNOW_STAFF.get() || item == BattleOfTheRacesByFzprulesModItems.SCRAP_PIPE.get();
	}
}
