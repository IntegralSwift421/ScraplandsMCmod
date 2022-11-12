
package net.mcreator.scraplandsbyfzprules.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.scraplandsbyfzprules.procedures.SpawnIcespikeProcedure;

public class BottledBlizzardEffectMobEffect extends MobEffect {
	public BottledBlizzardEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hard_to_find_biomes_by_fzprules.bottled_blizzard_effect";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SpawnIcespikeProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
