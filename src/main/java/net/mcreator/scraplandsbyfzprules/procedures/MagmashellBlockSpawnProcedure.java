package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModEntities;
import net.mcreator.scraplandsbyfzprules.entity.MagmashellEntity;

public class MagmashellBlockSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world instanceof Level _lvl && _lvl.isDay())) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MagmashellEntity(HardToFindBiomesByFzprulesModEntities.MAGMASHELL.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
