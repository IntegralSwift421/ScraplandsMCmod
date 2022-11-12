package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class FairySpellProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double SpellType = 0;
		SpellType = Math.round(Math.random() * 10);
		if (entity instanceof Player || (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			entity.clearFire();
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1));
			if (SpellType <= 3) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1));
			} else if (SpellType >= 7) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1));
			} else if (SpellType != 4) {
				if (world instanceof Level _lvl && _lvl.isDay()) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1));
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 60, 1));
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 60, 1));
			}
		} else {
			if (SpellType <= 2) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 5, 3, 3, 3, 1);
				ShockProcedure.execute(world, x, y, z);
			} else if (SpellType == 3) {
				DiamondSpellProcedure.execute(world, x, y, z);
			} else if (SpellType >= 8) {
				SpawnIcespikeProcedure.execute(world, entity);
			} else if (SpellType == 7) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 30, 1));
			}
		}
	}
}
