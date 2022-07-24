package it.gabliz.additional.forge;

import com.mojang.logging.LogUtils;
import dev.architectury.platform.forge.EventBuses;
import it.gabliz.additional.AdditionalMod;
import it.gabliz.additional.common.config.ModConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ModConfig.MOD_ID)
public class Additional {
    public static Logger LOGGER = LogUtils.getLogger();

    public Additional() {
        LOGGER.info("Start loading " + ModConfig.MOD_ID + " Mod ...");
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(ModConfig.MOD_ID, modBus);
        AdditionalMod.init();
        IEventBus bus = EventBuses.getModEventBus(ModConfig.MOD_ID).get();
        bus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });

    }

    @Mod.EventBusSubscriber(modid = ModConfig.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
