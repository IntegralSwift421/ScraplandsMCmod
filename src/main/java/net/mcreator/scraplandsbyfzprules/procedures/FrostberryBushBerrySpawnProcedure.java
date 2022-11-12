package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModItems;
import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModBlocks;

import java.util.Map;

public class FrostberryBushBerrySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double berries = 0;
		if (berries > 0) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HardToFindBiomesByFzprulesModItems.FROSTBERRY.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			berries = berries - 1;
		} else if (berries == 0) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = HardToFindBiomesByFzprulesModBlocks.FROSTBERRY_BUSH_FRUITLESS.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
