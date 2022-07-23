package it.gabliz.additional;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.utils.PlatformExpectedError;
import it.gabliz.additional.common.init.ModItems;
import net.minecraft.item.ItemGroup;

public class AdditionalCommon {

    //public static final ItemGroup TAB = getPlatformTab();

    public static void init() {
        ModItems.ITEMS.register();

    }

}
