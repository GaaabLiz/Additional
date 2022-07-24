package it.gabliz.additional.common.init;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import it.gabliz.additional.common.config.ModConfig;
import it.gabliz.additional.common.helper.TextInfoProvider;
import it.gabliz.additional.common.item.DebugItem;
import it.gabliz.additional.common.item.ExpDropItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ModConfig.MOD_ID,  Registry.ITEM_KEY);
    public static final ItemGroup TAB_ITEM = CreativeTabRegistry.create(new Identifier(ModConfig.MOD_ID, ModItemGroup.List.TAB_ITEM.idName), () -> new ItemStack(ModItems.DEBUG_ITEM.get()));


    public enum List implements TextInfoProvider {
        DEBUG_ITEM("debug_item", "DEBUG ITEM (ONLY DEV)") {
            @Override
            public String getDescription() {
                return "This is a debug item used to test some functionality of the mod. Don try to use it!";
            }
        },
        EXP_DROP("exp_drop", "Experience drop") {
            @Override
            public String getDescription() {
                return "A little drop of solidified experience.";
            }
        };
        @NotNull public final String idName;
        @NotNull public final String name;
        @NotNull public final Category category;
        List(@NotNull String idName, @NotNull String name) {this.idName = idName;this.name = name;this.category = Category.CRAFTING_ITEM;}
    }
    public enum Category { CRAFTING_ITEM, SEED }

    public static final RegistrySupplier<Item> DEBUG_ITEM = ITEMS.register(List.DEBUG_ITEM.idName, () -> new DebugItem(new Item.Settings().group(TAB_ITEM).rarity(Rarity.EPIC).maxCount(1)));
    public static final RegistrySupplier<Item> EXP_DROP = ITEMS.register(List.EXP_DROP.idName, () -> new ExpDropItem(new Item.Settings().group(TAB_ITEM).rarity(Rarity.UNCOMMON)));




    public static void init() {
        ModItems.ITEMS.register();
    }
}
