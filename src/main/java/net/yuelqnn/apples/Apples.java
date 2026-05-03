package net.yuelqnn.apples;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Apples implements ModInitializer {
	public static final String MOD_ID = "apples";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
//
		LOGGER.info("Initializing apples mod");
	}
}