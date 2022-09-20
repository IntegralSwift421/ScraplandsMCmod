
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
public class BattleOfTheRacesByFzprulesModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.protogen"),
				new SoundEvent(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.protogen")));
		REGISTRY.put(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.robot.ambient"),
				new SoundEvent(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.robot.ambient")));
		REGISTRY.put(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.robot.hurt"),
				new SoundEvent(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.robot.hurt")));
		REGISTRY.put(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.orbonaut.dead"),
				new SoundEvent(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.orbonaut.dead")));
		REGISTRY.put(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.orbonaut.ambient"),
				new SoundEvent(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.orbonaut.ambient")));
		REGISTRY.put(new ResourceLocation("battle_of_the_races_by_fzprules", "thundershock"),
				new SoundEvent(new ResourceLocation("battle_of_the_races_by_fzprules", "thundershock")));
		REGISTRY.put(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.protogen.dead"),
				new SoundEvent(new ResourceLocation("battle_of_the_races_by_fzprules", "entity.protogen.dead")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
