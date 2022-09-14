
package net.mcreator.scraplandsbyfzprules.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.scraplandsbyfzprules.init.ScraplandsByFzprulesModItems;

public class ScrapSwordItem extends SwordItem {
	public ScrapSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 216;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ScraplandsByFzprulesModItems.SCRAP_METAL.get()));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
