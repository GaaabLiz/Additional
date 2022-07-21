package com.example.examplemod.core.fabric;

import com.example.examplemod.core.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.PLATFORM.setup();
    }
}
