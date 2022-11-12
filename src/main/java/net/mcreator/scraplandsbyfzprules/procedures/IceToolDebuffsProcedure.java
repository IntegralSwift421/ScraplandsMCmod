package net.mcreator.scraplandsbyfzprules.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModEnchantments;

public class IceToolDebuffsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(HardToFindBiomesByFzprulesModEnchantments.FROST_BITER.get(), itemstack) == 1) {
			entity.hurt(DamageSource.GENERIC, 2);
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1, (false), (false)));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(HardToFindBiomesByFzprulesModEnchantments.SNOWBALLER.get(), itemstack) >= 1) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Snowball(EntityType.SNOWBALL, projectileLevel);
						_entityToSpawn.setPos(x, y, z);
						_entityToSpawn.shoot(1, 1, 1, 1, 2);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (EnchantmentHelper.getItemEnchantmentLevel(HardToFindBiomesByFzprulesModEnchantments.SNOWBALLER.get(), itemstack) >= 2) {
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Snowball(EntityType.SNOWBALL, projectileLevel);
							_entityToSpawn.setPos(x, y, z);
							_entityToSpawn.shoot(1, 1, 1, 1, 2);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(HardToFindBiomesByFzprulesModEnchantments.SNOWBALLER.get(),
							itemstack) == 3) {
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Snowball(EntityType.SNOWBALL, projectileLevel);
							_entityToSpawn.setPos(x, y, z);
							_entityToSpawn.shoot(1, 1, 1, 1, 2);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 30);
		}
	}
}
