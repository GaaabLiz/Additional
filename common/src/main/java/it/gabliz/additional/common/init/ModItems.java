package it.gabliz.additional.common.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import it.gabliz.additional.common.config.ModConfig;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ModConfig.MOD_ID,  Registry.ITEM_KEY);

    public static final RegistrySupplier<Item> DEBUG_ITEM = ITEMS.register(List.DEBUG_ITEM.idName, () -> new Item(new Item.Settings().group(ModItemGroup.CREATIVE_TAB_ITEM)));

    public enum Category { CRAFTING_ITEM, SEED }

    public enum List {
        DEBUG_ITEM("debug_item", "DEBUG ITEM (ONLY DEV)", "Can only be used");

        @NotNull public final String idName;
        @NotNull public final String name;
        @NotNull public final Category category;

        @Nullable public String description = null;
        @Nullable public final String shiftTooltip = null;
        @Nullable public final String ctrlTooltip = null;

        List(@NotNull String idName, @NotNull String name) {
            this.idName = idName;
            this.name = name;
            this.category = Category.CRAFTING_ITEM;
        }

        List(@NotNull String idName, @NotNull String name, @NotNull String description) {
            this.idName = idName;
            this.name = name;
            this.category = Category.CRAFTING_ITEM;
            this.description = description;
        }
    }

    public static void init() {
        ModItems.ITEMS.register();
    }
}
