package it.gabliz.additional.fabric

import it.gabliz.additional.AdditionalCommon
import it.gabliz.additional.common.config.ModConfig
import it.gabliz.additional.common.init.ModItems
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.function.Supplier
import java.util.stream.Collectors


@Suppress("unused")
object Additional: ModInitializer {

    val LOGGER: Logger = LoggerFactory.getLogger(ModConfig.MOD_NAME)

    override fun onInitialize() {
        LOGGER.info("Starting loading ${ModConfig.MOD_NAME} mod...")
        AdditionalCommon.init()
    }
/*
    fun getPlatformTab(): ItemGroup? {
        return FabricItemGroupBuilder.create(Identifier(ModConfig.MOD_ID, "main"))
            .icon(Supplier { ItemStack(Items.ITEM_FRAME) })
            .appendItems { list: MutableList<ItemStack?> ->
                val tabList: NonNullList<ItemStack?> = NonNullList.create()
                Registry.ITEM.forEach { item -> item.fillItemCategory(BetterAnimalsPlusMod.TAB, tabList) }
                list.addAll(tabList)
                list.addAll(
                    ModEntities.getEntities().values().stream().map { cont -> ItemStack(cont.getEggItem().get()) }
                        .collect(Collectors.toList()))
            }
            .build()
    }*/
}
