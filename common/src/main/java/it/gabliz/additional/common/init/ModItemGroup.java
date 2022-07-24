package it.gabliz.additional.common.init;

import dev.architectury.registry.CreativeTabRegistry;
import it.gabliz.additional.common.config.ModConfig;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ModItemGroup {

    enum List {
        TAB_ITEM("adt_tab_item", "Additional [ITEM]"),
        TAB_BLOCK("adt_tab_block", "Additional [BLOCK]");

        @NotNull public final String idName;
        @NotNull public final String name;

        List(@NotNull String idName, @NotNull String name) {
            this.idName = idName;
            this.name = name;
        }
    }


    //public static final ItemGroup TAB_BLOCK = CreativeTabRegistry.create(new Identifier(ModConfig.MOD_ID, List.TAB_BLOCK.idName), () -> new ItemStack(List.TAB_BLOCK.item));
}
