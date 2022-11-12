package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModEntities;
import net.mcreator.scraplandsbyfzprules.entity.FigtherDroneEntity;

import java.util.Random;

public class MotherdroneHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			if (Mth.nextInt(new Random(), 1, 10) >= 4) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Mth.nextInt(new Random(), 1, 10) <= 6) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new FigtherDroneEntity(HardToFindBiomesByFzprulesModEntities.FIGTHER_DRONE.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
