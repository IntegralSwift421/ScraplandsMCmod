
package net.mcreator.scraplandsbyfzprules.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.scraplandsbyfzprules.procedures.IceToolDebuffsProcedure;
import net.mcreator.scraplandsbyfzprules.init.BattleOfTheRacesByFzprulesModItems;

public class IceSickleItem extends HoeItem {
	public IceSickleItem() {
		super(new Tier() {
			public int getUses() {
				return 220;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BattleOfTheRacesByFzprulesModItems.ICE_CRYSTAL.get()));
			}
		}, 0, -3.2999999999999999f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		IceToolDebuffsProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}
}
