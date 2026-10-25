package com.mehmetclient;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Mehmet Client entry point.
 * This first milestone is a safe, minimal Fabric mod skeleton that can be
 * built by GitHub Actions. Client UI and individual modules can be added next.
 */
public final class MehmetClient implements ModInitializer {
    public static final String MOD_ID = "mehmetclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("====================================");
        LOGGER.info(" Mehmet Client {} loaded", "0.1.0");
        LOGGER.info(" Base project is ready for development.");
        LOGGER.info("====================================");
    }
}
