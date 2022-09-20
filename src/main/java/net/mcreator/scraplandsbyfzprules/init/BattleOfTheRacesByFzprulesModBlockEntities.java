
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.scraplandsbyfzprules.block.entity.ThunderProcessorBlockEntity;
import net.mcreator.scraplandsbyfzprules.BattleOfTheRacesByFzprulesMod;

public class BattleOfTheRacesByFzprulesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			BattleOfTheRacesByFzprulesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> THUNDER_PROCESSOR = register("thunder_processor",
			BattleOfTheRacesByFzprulesModBlocks.THUNDER_PROCESSOR, ThunderProcessorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
