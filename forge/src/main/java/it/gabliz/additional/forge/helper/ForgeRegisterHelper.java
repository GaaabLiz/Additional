package it.gabliz.additional.forge.helper;

import net.minecraftforge.eventbus.api.IEventBus;

public interface ForgeRegisterHelper {

    interface Items {
        void registerAll(IEventBus eventBus) ;
    }
}
