
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

import net.mcreator.scraplandsbyfzprules.item.TopazWandItem;
import net.mcreator.scraplandsbyfzprules.item.TopazSunItem;
import net.mcreator.scraplandsbyfzprules.item.TopazItem;
import net.mcreator.scraplandsbyfzprules.item.ThundershockItem;
import net.mcreator.scraplandsbyfzprules.item.ThunderBallItem;
import net.mcreator.scraplandsbyfzprules.item.SnowStaffItem;
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
import net.mcreator.scraplandsbyfzprules.item.IceSwordItem;
import net.mcreator.scraplandsbyfzprules.item.IceSpearItem;
import net.mcreator.scraplandsbyfzprules.item.IceSickleItem;
import net.mcreator.scraplandsbyfzprules.item.IceShovelItem;
import net.mcreator.scraplandsbyfzprules.item.IceScytheItem;
import net.mcreator.scraplandsbyfzprules.item.IcePollenItem;
import net.mcreator.scraplandsbyfzprules.item.IcePickaxeItem;
import net.mcreator.scraplandsbyfzprules.item.IceHoeItem;
import net.mcreator.scraplandsbyfzprules.item.IceHammerItem;
import net.mcreator.scraplandsbyfzprules.item.IceCrystalItem;
import net.mcreator.scraplandsbyfzprules.item.IceAxeItem;
import net.mcreator.scraplandsbyfzprules.item.IceArmorItem;
import net.mcreator.scraplandsbyfzprules.item.GreaterRobotCoreItem;
import net.mcreator.scraplandsbyfzprules.item.FairycrystalWandItem;
import net.mcreator.scraplandsbyfzprules.item.FairySwordItem;
import net.mcreator.scraplandsbyfzprules.item.FairySickleItem;
import net.mcreator.scraplandsbyfzprules.item.FairyShovelItem;
import net.mcreator.scraplandsbyfzprules.item.FairyShardItem;
import net.mcreator.scraplandsbyfzprules.item.FairyPickaxeItem;
import net.mcreator.scraplandsbyfzprules.item.FairyHoeItem;
import net.mcreator.scraplandsbyfzprules.item.FairyDustItem;
import net.mcreator.scraplandsbyfzprules.item.FairyAxeItem;
import net.mcreator.scraplandsbyfzprules.item.EmeraldWandItem;
import net.mcreator.scraplandsbyfzprules.item.DiamondWandItem;
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
	public static final RegistryObject<Item> FIGTHER_DRONE = REGISTRY.register("figther_drone_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.FIGTHER_DRONE, -13421773, -10066432,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FROZEN = REGISTRY.register("frozen_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.FROZEN, -16737895, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ICE_CRYSTAL = REGISTRY.register("ice_crystal", () -> new IceCrystalItem());
	public static final RegistryObject<Item> SNOW_STAFF = REGISTRY.register("snow_staff", () -> new SnowStaffItem());
	public static final RegistryObject<Item> ICE_PICKAXE = REGISTRY.register("ice_pickaxe", () -> new IcePickaxeItem());
	public static final RegistryObject<Item> ICE_AXE = REGISTRY.register("ice_axe", () -> new IceAxeItem());
	public static final RegistryObject<Item> ICE_SWORD = REGISTRY.register("ice_sword", () -> new IceSwordItem());
	public static final RegistryObject<Item> ICE_SHOVEL = REGISTRY.register("ice_shovel", () -> new IceShovelItem());
	public static final RegistryObject<Item> ICE_HOE = REGISTRY.register("ice_hoe", () -> new IceHoeItem());
	public static final RegistryObject<Item> ICE_SICKLE = REGISTRY.register("ice_sickle", () -> new IceSickleItem());
	public static final RegistryObject<Item> ICE_HAMMER = REGISTRY.register("ice_hammer", () -> new IceHammerItem());
	public static final RegistryObject<Item> ICE_SCYTHE = REGISTRY.register("ice_scythe", () -> new IceScytheItem());
	public static final RegistryObject<Item> SNOWPILE = REGISTRY.register("snowpile_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.SNOWPILE, -1, -3342337,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ICE_ARMOR_HELMET = REGISTRY.register("ice_armor_helmet", () -> new IceArmorItem.Helmet());
	public static final RegistryObject<Item> ICE_ARMOR_CHESTPLATE = REGISTRY.register("ice_armor_chestplate", () -> new IceArmorItem.Chestplate());
	public static final RegistryObject<Item> ICE_ARMOR_LEGGINGS = REGISTRY.register("ice_armor_leggings", () -> new IceArmorItem.Leggings());
	public static final RegistryObject<Item> ICE_ARMOR_BOOTS = REGISTRY.register("ice_armor_boots", () -> new IceArmorItem.Boots());
	public static final RegistryObject<Item> ICE_BUTTERFLY = REGISTRY.register("ice_butterfly_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.ICE_BUTTERFLY, -6684673, -16711681,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FROSTED_STONE = block(BattleOfTheRacesByFzprulesModBlocks.FROSTED_STONE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROSTED_STONE_SLAB = block(BattleOfTheRacesByFzprulesModBlocks.FROSTED_STONE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROSTED_STONE_STAIRS = block(BattleOfTheRacesByFzprulesModBlocks.FROSTED_STONE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROSTED_STONE_WALL = block(BattleOfTheRacesByFzprulesModBlocks.FROSTED_STONE_WALL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ICE_POLLEN = REGISTRY.register("ice_pollen", () -> new IcePollenItem());
	public static final RegistryObject<Item> ICE_BLOSSOM = block(BattleOfTheRacesByFzprulesModBlocks.ICE_BLOSSOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SNOWLAND_HUNTER = REGISTRY.register("snowland_hunter_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.SNOWLAND_HUNTER, -10079488, -6724096,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SNOWLAND_FURRY = REGISTRY.register("snowland_furry_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.SNOWLAND_FURRY, -1, -6684673,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SNOWLAND_SHADOW = REGISTRY.register("snowland_shadow_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.SNOWLAND_SHADOW, -16777063, -3355648,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ICE_SPEAR = REGISTRY.register("ice_spear", () -> new IceSpearItem());
	public static final RegistryObject<Item> ICE_WISP = REGISTRY.register("ice_wisp_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.ICE_WISP, -3342337, -6697729,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FAIRY_CRYSTAL = block(BattleOfTheRacesByFzprulesModBlocks.FAIRY_CRYSTAL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FAIRY_SHARD = REGISTRY.register("fairy_shard", () -> new FairyShardItem());
	public static final RegistryObject<Item> FAIRY_DUST = REGISTRY.register("fairy_dust", () -> new FairyDustItem());
	public static final RegistryObject<Item> FAIRY_PICKAXE = REGISTRY.register("fairy_pickaxe", () -> new FairyPickaxeItem());
	public static final RegistryObject<Item> FAIRY_AXE = REGISTRY.register("fairy_axe", () -> new FairyAxeItem());
	public static final RegistryObject<Item> FAIRY_SWORD = REGISTRY.register("fairy_sword", () -> new FairySwordItem());
	public static final RegistryObject<Item> FAIRY_SHOVEL = REGISTRY.register("fairy_shovel", () -> new FairyShovelItem());
	public static final RegistryObject<Item> FAIRY_HOE = REGISTRY.register("fairy_hoe", () -> new FairyHoeItem());
	public static final RegistryObject<Item> FAIRY_SICKLE = REGISTRY.register("fairy_sickle", () -> new FairySickleItem());
	public static final RegistryObject<Item> FAIRY_FUNGI = block(BattleOfTheRacesByFzprulesModBlocks.FAIRY_FUNGI, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> WAND_FORGE = block(BattleOfTheRacesByFzprulesModBlocks.WAND_FORGE, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> FAIRYCRYSTAL_WAND = REGISTRY.register("fairycrystal_wand", () -> new FairycrystalWandItem());
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> TOPAZ_ORE = block(BattleOfTheRacesByFzprulesModBlocks.TOPAZ_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOPAZ_BLOCK = block(BattleOfTheRacesByFzprulesModBlocks.TOPAZ_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DIAMOND_WAND = REGISTRY.register("diamond_wand", () -> new DiamondWandItem());
	public static final RegistryObject<Item> EMERALD_WAND = REGISTRY.register("emerald_wand", () -> new EmeraldWandItem());
	public static final RegistryObject<Item> TOPAZ_SUN = REGISTRY.register("topaz_sun", () -> new TopazSunItem());
	public static final RegistryObject<Item> TOPAZ_WAND = REGISTRY.register("topaz_wand", () -> new TopazWandItem());
	public static final RegistryObject<Item> THUNDER_LEAVES = block(BattleOfTheRacesByFzprulesModBlocks.THUNDER_LEAVES,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SNOWSHELL = REGISTRY.register("snowshell_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.SNOWSHELL, -6684673, -13421773,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SNOWSHELL_BLOCK = block(BattleOfTheRacesByFzprulesModBlocks.SNOWSHELL_BLOCK, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> OBSIDIAN_ORE = block(BattleOfTheRacesByFzprulesModBlocks.OBSIDIAN_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STORM_ROSE = block(BattleOfTheRacesByFzprulesModBlocks.STORM_ROSE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> STORM_BELL = block(BattleOfTheRacesByFzprulesModBlocks.STORM_BELL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MAGMASHELL = REGISTRY.register("magmashell_spawn_egg",
			() -> new ForgeSpawnEggItem(BattleOfTheRacesByFzprulesModEntities.MAGMASHELL, -39424, -13421773,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
