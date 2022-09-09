
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
import net.mcreator.scraplandsbyfzprules.item.ScrapMetalItem;
import net.mcreator.scraplandsbyfzprules.item.ScrapArmorItem;
import net.mcreator.scraplandsbyfzprules.item.RoboPotatoItem;
import net.mcreator.scraplandsbyfzprules.item.RoboCarrotItem;
import net.mcreator.scraplandsbyfzprules.item.RAMItem;
import net.mcreator.scraplandsbyfzprules.ScraplandsByFzprulesMod;

public class ScraplandsByFzprulesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ScraplandsByFzprulesMod.MODID);
	public static final RegistryObject<Item> RUSTY_DIRT = block(ScraplandsByFzprulesModBlocks.RUSTY_DIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUSTY_TOP = block(ScraplandsByFzprulesModBlocks.RUSTY_TOP, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_BRICKS = block(ScraplandsByFzprulesModBlocks.SCRAP_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_PANE_BLOCK = block(ScraplandsByFzprulesModBlocks.SCRAP_PANE_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_PILE = block(ScraplandsByFzprulesModBlocks.SCRAP_PILE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ROBOTIC_LOG = block(ScraplandsByFzprulesModBlocks.ROBOTIC_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_SOLAR_PANEL = block(ScraplandsByFzprulesModBlocks.SCRAP_SOLAR_PANEL,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCRAP_FLOWER = block(ScraplandsByFzprulesModBlocks.SCRAP_FLOWER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCRAP_METAL = REGISTRY.register("scrap_metal", () -> new ScrapMetalItem());
	public static final RegistryObject<Item> SCRAP_ARMOR_HELMET = REGISTRY.register("scrap_armor_helmet", () -> new ScrapArmorItem.Helmet());
	public static final RegistryObject<Item> SCRAP_ARMOR_CHESTPLATE = REGISTRY.register("scrap_armor_chestplate",
			() -> new ScrapArmorItem.Chestplate());
	public static final RegistryObject<Item> SCRAP_ARMOR_LEGGINGS = REGISTRY.register("scrap_armor_leggings", () -> new ScrapArmorItem.Leggings());
	public static final RegistryObject<Item> SCRAP_ARMOR_BOOTS = REGISTRY.register("scrap_armor_boots", () -> new ScrapArmorItem.Boots());
	public static final RegistryObject<Item> RAM = REGISTRY.register("ram", () -> new RAMItem());
	public static final RegistryObject<Item> ROBO_POTATO = REGISTRY.register("robo_potato", () -> new RoboPotatoItem());
	public static final RegistryObject<Item> ROBO_CARROT = REGISTRY.register("robo_carrot", () -> new RoboCarrotItem());
	public static final RegistryObject<Item> ROBO_CROPS = doubleBlock(ScraplandsByFzprulesModBlocks.ROBO_CROPS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ROBO_CROPS_SMALL = block(ScraplandsByFzprulesModBlocks.ROBO_CROPS_SMALL,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MECHA_SLIME = REGISTRY.register("mecha_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(ScraplandsByFzprulesModEntities.MECHA_SLIME, -13408768, -16711681,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ION_SLIME = REGISTRY.register("ion_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(ScraplandsByFzprulesModEntities.ION_SLIME, -13408768, -16711681,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ION_DRONE = REGISTRY.register("ion_drone_spawn_egg",
			() -> new ForgeSpawnEggItem(ScraplandsByFzprulesModEntities.ION_DRONE, -10066330, -16711681,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCRAPLANDIAN = REGISTRY.register("scraplandian_spawn_egg",
			() -> new ForgeSpawnEggItem(ScraplandsByFzprulesModEntities.SCRAPLANDIAN, -13421773, -16763956,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PROTOGEN = REGISTRY.register("protogen_spawn_egg",
			() -> new ForgeSpawnEggItem(ScraplandsByFzprulesModEntities.PROTOGEN, -10066330, -16738048,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> THUNDER_BALL = REGISTRY.register("thunder_ball", () -> new ThunderBallItem());
	public static final RegistryObject<Item> THUNDERSHOCK = REGISTRY.register("thundershock", () -> new ThundershockItem());
	public static final RegistryObject<Item> THUNDER_REED = block(ScraplandsByFzprulesModBlocks.THUNDER_REED, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
