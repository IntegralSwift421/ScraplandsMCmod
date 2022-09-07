
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.scraplandsbyfzprules.entity.ScraplandianEntity;
import net.mcreator.scraplandsbyfzprules.entity.ProtogenEntity;
import net.mcreator.scraplandsbyfzprules.entity.MechaSlimeEntity;
import net.mcreator.scraplandsbyfzprules.entity.IonSlimeEntity;
import net.mcreator.scraplandsbyfzprules.entity.IonDroneEntity;
import net.mcreator.scraplandsbyfzprules.ScraplandsByFzprulesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ScraplandsByFzprulesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ScraplandsByFzprulesMod.MODID);
	public static final RegistryObject<EntityType<MechaSlimeEntity>> MECHA_SLIME = register("mecha_slime",
			EntityType.Builder.<MechaSlimeEntity>of(MechaSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MechaSlimeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IonSlimeEntity>> ION_SLIME = register("ion_slime",
			EntityType.Builder.<IonSlimeEntity>of(IonSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(IonSlimeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IonDroneEntity>> ION_DRONE = register("ion_drone",
			EntityType.Builder.<IonDroneEntity>of(IonDroneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(IonDroneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ScraplandianEntity>> SCRAPLANDIAN = register("scraplandian",
			EntityType.Builder.<ScraplandianEntity>of(ScraplandianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScraplandianEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtogenEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MechaSlimeEntity.init();
			IonSlimeEntity.init();
			IonDroneEntity.init();
			ScraplandianEntity.init();
			ProtogenEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MECHA_SLIME.get(), MechaSlimeEntity.createAttributes().build());
		event.put(ION_SLIME.get(), IonSlimeEntity.createAttributes().build());
		event.put(ION_DRONE.get(), IonDroneEntity.createAttributes().build());
		event.put(SCRAPLANDIAN.get(), ScraplandianEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
	}
}
