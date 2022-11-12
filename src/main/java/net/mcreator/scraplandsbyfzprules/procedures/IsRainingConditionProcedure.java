package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.level.LevelAccessor;

public class IsRainingConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean is_raining = false;
		if (world.getLevelData().isRaining()) {
			is_raining = true;
		}
		return is_raining;
	}
}
