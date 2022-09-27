package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.scraplandsbyfzprules.init.BattleOfTheRacesByFzprulesModEntities;
import net.mcreator.scraplandsbyfzprules.entity.IceSpikeEntity;

import java.util.Random;

public class SpawnIcespikeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANT, x, y, z, 7, 3, 3, 3, 1);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new IceSpikeEntity(BattleOfTheRacesByFzprulesModEntities.ICE_SPIKE.get(), _level);
			entityToSpawn.moveTo(x, (y + 20), z, 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new IceSpikeEntity(BattleOfTheRacesByFzprulesModEntities.ICE_SPIKE.get(), _level);
			entityToSpawn.moveTo((x + Mth.nextInt(new Random(), -2, 2)), (y + 25), (z + Mth.nextInt(new Random(), -2, 2)), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new IceSpikeEntity(BattleOfTheRacesByFzprulesModEntities.ICE_SPIKE.get(), _level);
			entityToSpawn.moveTo((x + Mth.nextInt(new Random(), -3, 3)), (y + 30), (z + Mth.nextInt(new Random(), -3, 3)), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
