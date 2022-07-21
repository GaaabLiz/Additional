package com.example.examplemod.core;

import gg.moonflower.pollen.api.platform.Platform;

public class ExampleMod {
    public static final String MOD_ID = "modid";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
        .clientInit(() -> ExampleMod::onClientInit)
        .clientPostInit(() -> ExampleMod::onClientPostInit)
        .commonInit(ExampleMod::onCommonInit)
        .commonPostInit(ExampleMod::onCommonPostInit)
        .dataInit(ExampleMod::onDataInit)
        .build();

    public static void onClientInit() {
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onCommonInit() {
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onDataInit(Platform.DataSetupContext ctx) {
    }
}
