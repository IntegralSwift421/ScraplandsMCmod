package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModEntities;
import net.mcreator.scraplandsbyfzprules.entity.IceSpikeEntity;

import java.util.Random;

public class SpawnIcespikeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANT, (entity.getX()), (entity.getY()), (entity.getZ()), 7, 3, 3, 3, 1);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new IceSpikeEntity(HardToFindBiomesByFzprulesModEntities.ICE_SPIKE.get(), _level);
			entityToSpawn.moveTo((entity.getX()), (entity.getY() + 20), (entity.getZ()), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new IceSpikeEntity(HardToFindBiomesByFzprulesModEntities.ICE_SPIKE.get(), _level);
			entityToSpawn.moveTo((entity.getX() + Mth.nextInt(new Random(), -2, 2)), (entity.getY() + 25),
					(entity.getZ() + Mth.nextInt(new Random(), -2, 2)), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new IceSpikeEntity(HardToFindBiomesByFzprulesModEntities.ICE_SPIKE.get(), _level);
			entityToSpawn.moveTo((entity.getX() + Mth.nextInt(new Random(), -3, 3)), (entity.getY() + 30),
					(entity.getZ() + Mth.nextInt(new Random(), -3, 3)), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
