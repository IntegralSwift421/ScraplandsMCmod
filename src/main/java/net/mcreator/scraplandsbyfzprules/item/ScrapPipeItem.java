
package net.mcreator.scraplandsbyfzprules.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.scraplandsbyfzprules.procedures.GeneralEnchantmentProcedureProcedure;
import net.mcreator.scraplandsbyfzprules.init.BattleOfTheRacesByFzprulesModItems;

public class ScrapPipeItem extends SwordItem {
	public ScrapPipeItem() {
		super(new Tier() {
			public int getUses() {
				return 512;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BattleOfTheRacesByFzprulesModItems.SCRAP_METAL.get()));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		GeneralEnchantmentProcedureProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}
}
