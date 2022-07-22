package it.gabliz.additional.forge;

import com.mojang.logging.LogUtils;
import it.gabliz.additional.common.config.ModConfig;
import it.gabliz.additional.common.init.ModItems;
import it.gabliz.additional.forge.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
/*
@Mod(ModConfig.MOD_ID)
public class Additional {
    public static Logger LOGGER = LogUtils.getLogger();

    public Additional() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModItems.Companion.init();
        ItemInit.registerAll(modEventBus);
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
*/