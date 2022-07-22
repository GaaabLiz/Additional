package it.gabliz.additional.forge.init;

import it.gabliz.additional.common.config.ModConfig;
import it.gabliz.additional.common.helper.ModObjectInfo;
import it.gabliz.additional.common.init.ModItems;
import it.gabliz.additional.forge.Additional;
import it.gabliz.additional.forge.helper.ForgeRegisterHelper;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class ItemInit {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModConfig.MOD_ID);

    public static void registerAll(IEventBus eventBus) {
        Additional.LOGGER.debug("Registering mod items for ${ModConfig.MOD_NAME}...");
        Map<Item, ModObjectInfo.Item> map = ModItems.Companion.getItemsList();
        for (Map.Entry<Item, ModObjectInfo.Item> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
            Item item = entry.getKey();
            ModObjectInfo.Item info = entry.getValue();
            ITEMS.register(info.getIdName(), () -> item);
        }
        ITEMS.register(eventBus);
    }

}
