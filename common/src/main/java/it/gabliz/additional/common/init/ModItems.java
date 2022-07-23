package it.gabliz.additional.common.init;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import it.gabliz.additional.common.config.ModConfig;
import it.gabliz.additional.common.helper.ModObjectInfo;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ModConfig.MOD_ID,  Registry.ITEM_KEY);

    public static final ModObjectInfo.ItemInfo DEBUG_ITEM_INFO = new ModObjectInfo.ItemInfo("debug_item", "asdas", ModObjectInfo.ItemInfo.Category.CRAFTING_ITEM);
    public static final RegistrySupplier<Item> DEBUG_ITEM = register(DEBUG_ITEM_INFO, new Item(new Item.Settings().group(ItemGroup.MISC)));

    private static <T> RegistrySupplier<Item> register(ModObjectInfo.ItemInfo info, Item item) {
        return ITEMS.register(info.getIdName(), () -> item);
    }
}
