
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.scraplandsbyfzprules.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.scraplandsbyfzprules.item.ThundershockItem;
import net.mcreator.scraplandsbyfzprules.item.ThunderBallItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapSwordItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapShovelItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapPipeItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapPickaxeItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapMetalItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapHoeItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapAxeItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapArmorItem;
import net.mcreator.scraplandsbyfzprules.item.RobotSpawnItem;
import net.mcreator.scraplandsbyfzprules.item.RobotCoreItem;
import net.mcreator.scraplandsbyfzprules.item.RoboPotatoItem;
import net.mcreator.scraplandsbyfzprules.item.RoboCarrotItem;
import net.mcreator.scraplandsbyfzprules.item.RamBladeItem;
import net.mcreator.scraplandsbyfzprules.item.RAMItem;
import net.mcreator.scraplandsbyfzprules.item.InfectedCoreItem;
import net.mcreator.scraplandsbyfzprules.item.GreaterRobotCoreItem;
import net.mcreator.scraplandsbyfzprules.BattleOfTheRacesByFzprulesMod;

public class BattleOfTheRacesByFzprulesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BattleOfTheRacesByFzprulesMod.MODID);
	public static final RegistryObject<Item> RUSTY_DIRT = block(BattleOfTheRacesByFzprulesModBlocks.RUSTY_DIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUSTY_TOP = block(BattleOfTheRacesByFzprulesModBlocks.RUSTY_TOP, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_BRICKS = block(BattleOfTheRacesByFzprulesModBlocks.SCRAP_BRICKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_PANE_BLOCK = block(BattleOfTheRacesByFzprulesModBlocks.SCRAP_PANE_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_PILE = block(BattleOfTheRacesByFzprulesModBlocks.SCRAP_PILE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ROBOTIC_LOG = block(BattleOfTheRacesByFzprulesModBlocks.ROBOTIC_LOG,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_SOLAR_PANEL = block(BattleOfTheRacesByFzprulesModBlocks.SCRAP_SOLAR_PANEL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_FLOWER = block(BattleOfTheRacesByFzprulesModBlocks.SCRAP_FLOWER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCRAP_METAL = REGISTRY.register("scrap_metal", () -> new ScrapMetalItem());
	public static final RegistryObject<Item> SCRAP_ARMOR_HELMET = REGISTRY.register("scrap_armor_helmet", () -> new ScrapArmorItem.Helmet());
	public static final RegistryObject<Item> SCRAP_ARMOR_CHESTPLATE = REGISTRY.register("scrap_armor_chestplate",
			() -> new ScrapArmorItem.Chestplate());
	public static final RegistryObject<Item> SCRAP_ARMOR_LEGGINGS = REGISTRY.register("scrap_armor_leggings", () -> new ScrapArmorItem.Leggings());
	public static final RegistryObject<Item> SCRAP_ARMOR_BOOTS = REGISTRY.register("scrap_armor_boots", () -> new ScrapArmorItem.Boots());
	public static final RegistryObject<Item> RAM = REGISTRY.register("ram", () -> new RAMItem());
	public static final RegistryObject<Item> ROBO_POTATO = REGISTRY.register("robo_potato", () -> new RoboPotatoItem());
	public static final RegistryObject<Item> ROBO_CARROT = REGISTRY.register("robo_carrot", () -> new RoboCarrotItem());
	public static final RegistryObject<Item> ROBO_CROPS = doubleBlock(BattleOfTheRacesByFzprulesModBlocks.ROBO_CROPS,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ROBO_CROPS_SMALL = block(BattleOfTheRacesByFzprulesModBlocks.ROBO_CROPS_SMALL,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MECHA_SLIME = REGISTRY.register("mecha_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.MECHA_SLIME, -13408768, -16711681,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ION_SLIME = REGISTRY.register("ion_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.ION_SLIME, -13408768, -16711681,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ION_DRONE = REGISTRY.register("ion_drone_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.ION_DRONE, -10066330, -16711681,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCRAPLANDIAN = REGISTRY.register("scraplandian_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.SCRAPLANDIAN, -13421773, -16763956,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PROTOGEN = REGISTRY.register("protogen_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.PROTOGEN, -10066330, -16738048,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> THUNDER_BALL = REGISTRY.register("thunder_ball", () -> new ThunderBallItem());
	public static final RegistryObject<Item> THUNDERSHOCK = REGISTRY.register("thundershock", () -> new ThundershockItem());
	public static final RegistryObject<Item> THUNDER_REED = block(BattleOfTheRacesByFzprulesModBlocks.THUNDER_REED, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> THUNDER_PROCESSOR = block(BattleOfTheRacesByFzprulesModBlocks.THUNDER_PROCESSOR,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> RAM_BLADE = REGISTRY.register("ram_blade", () -> new RamBladeItem());
	public static final RegistryObject<Item> SCRAP_PICKAXE = REGISTRY.register("scrap_pickaxe", () -> new ScrapPickaxeItem());
	public static final RegistryObject<Item> SCRAP_AXE = REGISTRY.register("scrap_axe", () -> new ScrapAxeItem());
	public static final RegistryObject<Item> SCRAP_SWORD = REGISTRY.register("scrap_sword", () -> new ScrapSwordItem());
	public static final RegistryObject<Item> SCRAP_SHOVEL = REGISTRY.register("scrap_shovel", () -> new ScrapShovelItem());
	public static final RegistryObject<Item> SCRAP_HOE = REGISTRY.register("scrap_hoe", () -> new ScrapHoeItem());
	public static final RegistryObject<Item> ROBOT_CORE = REGISTRY.register("robot_core", () -> new RobotCoreItem());
	public static final RegistryObject<Item> GREATER_ROBOT_CORE = REGISTRY.register("greater_robot_core", () -> new GreaterRobotCoreItem());
	public static final RegistryObject<Item> ROBOT_SPAWN = REGISTRY.register("robot_spawn", () -> new RobotSpawnItem());
	public static final RegistryObject<Item> ION_GIANT = REGISTRY.register("ion_giant_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.ION_GIANT, -13421773, -16777165,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCRAP_PIPE = REGISTRY.register("scrap_pipe", () -> new ScrapPipeItem());
	public static final RegistryObject<Item> INFECTED_CORE = REGISTRY.register("infected_core", () -> new InfectedCoreItem());
	public static final RegistryObject<Item> INFECTED_SCRAPLANDIAN = REGISTRY.register("infected_scraplandian_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.INFECTED_SCRAPLANDIAN, -10066330, -6750208,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> INFECTED_PROTOGEN = REGISTRY.register("infected_protogen_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.INFECTED_PROTOGEN, -10066330, -52429,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
