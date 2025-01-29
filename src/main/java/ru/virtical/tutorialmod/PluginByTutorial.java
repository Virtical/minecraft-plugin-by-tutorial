package ru.virtical.tutorialmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.virtical.tutorialmod.block.ModBlocks;
import ru.virtical.tutorialmod.item.ModItemGroups;
import ru.virtical.tutorialmod.item.ModItems;

public class PluginByTutorial implements ModInitializer {
	public static final String MOD_ID = "plugin-by-tutorial";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}