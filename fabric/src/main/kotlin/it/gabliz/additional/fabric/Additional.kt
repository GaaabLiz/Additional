package it.gabliz.additional.fabric

import it.gabliz.additional.AdditionalMod
import it.gabliz.additional.common.config.ModConfig
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory


@Suppress("unused")
object Additional: ModInitializer {

    val LOGGER: Logger = LoggerFactory.getLogger(ModConfig.MOD_NAME)

    override fun onInitialize() {
        LOGGER.info("Starting loading ${ModConfig.MOD_NAME} mod...")
        AdditionalMod.init()
    }

}
