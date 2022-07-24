package it.gabliz.additional.common.init;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import it.gabliz.additional.common.config.ModConfig;
import it.gabliz.additional.common.item.DebugItem;
import it.gabliz.additional.common.item.ExpDropItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ModConfig.MOD_ID,  Registry.ITEM_KEY);

    public static final RegistrySupplier<Item> DEBUG_ITEM = ITEMS.register(List.DEBUG_ITEM.idName, () -> new DebugItem(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    public static final ItemGroup TAB_ITEM = CreativeTabRegistry.create(new Identifier(ModConfig.MOD_ID, ModItemGroup.List.TAB_ITEM.idName), () -> new ItemStack(DEBUG_ITEM.get()));
    public static final RegistrySupplier<Item> EXP_DROP = ITEMS.register(List.EXP_DROP.idName, () -> new ExpDropItem(new Item.Settings().group(TAB_ITEM).rarity(Rarity.UNCOMMON)));


    public enum Category { CRAFTING_ITEM, SEED }

    public enum List {
        DEBUG_ITEM("debug_item", "DEBUG ITEM (ONLY DEV)", "This is a debug item used to test some functionality of the mod. Don try to use it!"),
        EXP_DROP("exp_drop", "Experience drop", "A little drop of solidified experience.");

        @NotNull public final String idName;
        @NotNull public final String name;
        @NotNull public final Category category;

        @Nullable public String description = null;
        @Nullable public String shiftTooltip = null;
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

        List(@NotNull String idName, @NotNull String name, @NotNull String description, @NotNull String shiftTooltip) {
            this.idName = idName;
            this.name = name;
            this.category = Category.CRAFTING_ITEM;
            this.description = description;
            this.shiftTooltip = shiftTooltip;
        }
    }

    public static void init() {
        ModItems.ITEMS.register();
    }
}
