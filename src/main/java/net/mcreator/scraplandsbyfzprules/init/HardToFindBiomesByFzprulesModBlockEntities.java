
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.scraplandsbyfzprules.block.entity.WandForgeBlockEntity;
import net.mcreator.scraplandsbyfzprules.block.entity.ThunderProcessorBlockEntity;
import net.mcreator.scraplandsbyfzprules.HardToFindBiomesByFzprulesMod;

public class HardToFindBiomesByFzprulesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			HardToFindBiomesByFzprulesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> THUNDER_PROCESSOR = register("thunder_processor",
			HardToFindBiomesByFzprulesModBlocks.THUNDER_PROCESSOR, ThunderProcessorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WAND_FORGE = register("wand_forge", HardToFindBiomesByFzprulesModBlocks.WAND_FORGE,
			WandForgeBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
