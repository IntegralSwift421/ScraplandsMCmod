
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

import net.mcreator.scraplandsbyfzprules.entity.ThundershockEntity;
import net.mcreator.scraplandsbyfzprules.entity.SnowpileEntity;
import net.mcreator.scraplandsbyfzprules.entity.SnowlandShadowEntity;
import net.mcreator.scraplandsbyfzprules.entity.SnowlandHunterEntity;
import net.mcreator.scraplandsbyfzprules.entity.SnowlandFurryEntity;
import net.mcreator.scraplandsbyfzprules.entity.SnowStaffEntity;
import net.mcreator.scraplandsbyfzprules.entity.ScraplandianEntity;
import net.mcreator.scraplandsbyfzprules.entity.ProtogenEntity;
import net.mcreator.scraplandsbyfzprules.entity.OrbonautEntity;
import net.mcreator.scraplandsbyfzprules.entity.MotherdroneEntity;
import net.mcreator.scraplandsbyfzprules.entity.MechaSlimeEntity;
import net.mcreator.scraplandsbyfzprules.entity.IonSlimeEntity;
import net.mcreator.scraplandsbyfzprules.entity.IonGiantEntity;
import net.mcreator.scraplandsbyfzprules.entity.IonDroneEntity;
import net.mcreator.scraplandsbyfzprules.entity.InfectedScraplandianEntity;
import net.mcreator.scraplandsbyfzprules.entity.InfectedProtogenEntity;
import net.mcreator.scraplandsbyfzprules.entity.IceWispEntity;
import net.mcreator.scraplandsbyfzprules.entity.IceButterflyEntity;
import net.mcreator.scraplandsbyfzprules.entity.FrozenEntity;
import net.mcreator.scraplandsbyfzprules.entity.FigtherDroneEntity;
import net.mcreator.scraplandsbyfzprules.BattleOfTheRacesByFzprulesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BattleOfTheRacesByFzprulesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES,
			BattleOfTheRacesByFzprulesMod.MODID);
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
	public static final RegistryObject<EntityType<ThundershockEntity>> THUNDERSHOCK = register("projectile_thundershock",
			EntityType.Builder.<ThundershockEntity>of(ThundershockEntity::new, MobCategory.MISC).setCustomClientFactory(ThundershockEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OrbonautEntity>> ORBONAUT = register("orbonaut",
			EntityType.Builder.<OrbonautEntity>of(OrbonautEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(OrbonautEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IonGiantEntity>> ION_GIANT = register("ion_giant",
			EntityType.Builder.<IonGiantEntity>of(IonGiantEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IonGiantEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InfectedScraplandianEntity>> INFECTED_SCRAPLANDIAN = register("infected_scraplandian",
			EntityType.Builder.<InfectedScraplandianEntity>of(InfectedScraplandianEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(InfectedScraplandianEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InfectedProtogenEntity>> INFECTED_PROTOGEN = register("infected_protogen",
			EntityType.Builder.<InfectedProtogenEntity>of(InfectedProtogenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InfectedProtogenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MotherdroneEntity>> MOTHERDRONE = register("motherdrone",
			EntityType.Builder.<MotherdroneEntity>of(MotherdroneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(MotherdroneEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FigtherDroneEntity>> FIGTHER_DRONE = register("figther_drone",
			EntityType.Builder.<FigtherDroneEntity>of(FigtherDroneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FigtherDroneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FrozenEntity>> FROZEN = register("frozen",
			EntityType.Builder.<FrozenEntity>of(FrozenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FrozenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SnowStaffEntity>> SNOW_STAFF = register("projectile_snow_staff",
			EntityType.Builder.<SnowStaffEntity>of(SnowStaffEntity::new, MobCategory.MISC).setCustomClientFactory(SnowStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SnowpileEntity>> SNOWPILE = register("snowpile",
			EntityType.Builder.<SnowpileEntity>of(SnowpileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SnowpileEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IceButterflyEntity>> ICE_BUTTERFLY = register("ice_butterfly",
			EntityType.Builder.<IceButterflyEntity>of(IceButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IceButterflyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SnowlandHunterEntity>> SNOWLAND_HUNTER = register("snowland_hunter",
			EntityType.Builder.<SnowlandHunterEntity>of(SnowlandHunterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowlandHunterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SnowlandFurryEntity>> SNOWLAND_FURRY = register("snowland_furry",
			EntityType.Builder.<SnowlandFurryEntity>of(SnowlandFurryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowlandFurryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SnowlandShadowEntity>> SNOWLAND_SHADOW = register("snowland_shadow",
			EntityType.Builder.<SnowlandShadowEntity>of(SnowlandShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowlandShadowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IceWispEntity>> ICE_WISP = register("ice_wisp",
			EntityType.Builder.<IceWispEntity>of(IceWispEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(IceWispEntity::new)

					.sized(1f, 1f));

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
			OrbonautEntity.init();
			IonGiantEntity.init();
			InfectedScraplandianEntity.init();
			InfectedProtogenEntity.init();
			MotherdroneEntity.init();
			FigtherDroneEntity.init();
			FrozenEntity.init();
			SnowpileEntity.init();
			IceButterflyEntity.init();
			SnowlandHunterEntity.init();
			SnowlandFurryEntity.init();
			SnowlandShadowEntity.init();
			IceWispEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MECHA_SLIME.get(), MechaSlimeEntity.createAttributes().build());
		event.put(ION_SLIME.get(), IonSlimeEntity.createAttributes().build());
		event.put(ION_DRONE.get(), IonDroneEntity.createAttributes().build());
		event.put(SCRAPLANDIAN.get(), ScraplandianEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
		event.put(ORBONAUT.get(), OrbonautEntity.createAttributes().build());
		event.put(ION_GIANT.get(), IonGiantEntity.createAttributes().build());
		event.put(INFECTED_SCRAPLANDIAN.get(), InfectedScraplandianEntity.createAttributes().build());
		event.put(INFECTED_PROTOGEN.get(), InfectedProtogenEntity.createAttributes().build());
		event.put(MOTHERDRONE.get(), MotherdroneEntity.createAttributes().build());
		event.put(FIGTHER_DRONE.get(), FigtherDroneEntity.createAttributes().build());
		event.put(FROZEN.get(), FrozenEntity.createAttributes().build());
		event.put(SNOWPILE.get(), SnowpileEntity.createAttributes().build());
		event.put(ICE_BUTTERFLY.get(), IceButterflyEntity.createAttributes().build());
		event.put(SNOWLAND_HUNTER.get(), SnowlandHunterEntity.createAttributes().build());
		event.put(SNOWLAND_FURRY.get(), SnowlandFurryEntity.createAttributes().build());
		event.put(SNOWLAND_SHADOW.get(), SnowlandShadowEntity.createAttributes().build());
		event.put(ICE_WISP.get(), IceWispEntity.createAttributes().build());
	}
}
