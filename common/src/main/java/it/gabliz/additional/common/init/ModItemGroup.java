package it.gabliz.additional.common.init;

import dev.architectury.registry.CreativeTabRegistry;
import it.gabliz.additional.common.config.ModConfig;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup CREATIVE_TAB_ITEM = CreativeTabRegistry.create(new Identifier(ModConfig.MOD_ID, "adt_tab_item"), () -> new ItemStack(Items.ACACIA_BUTTON.asItem()));
}
