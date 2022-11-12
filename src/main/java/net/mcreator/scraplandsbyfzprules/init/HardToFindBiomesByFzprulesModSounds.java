
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HardToFindBiomesByFzprulesModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.protogen"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.protogen")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.robot.ambient"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.robot.ambient")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.robot.hurt"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.robot.hurt")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.orbonaut.dead"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.orbonaut.dead")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.orbonaut.ambient"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.orbonaut.ambient")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "thundershock"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "thundershock")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.protogen.dead"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.protogen.dead")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.electron"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.electron")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.tortise"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.tortise")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "item.magicspell"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "item.magicspell")));
		REGISTRY.put(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.glass"),
				new SoundEvent(new ResourceLocation("hard_to_find_biomes_by_fzprules", "entity.glass")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
