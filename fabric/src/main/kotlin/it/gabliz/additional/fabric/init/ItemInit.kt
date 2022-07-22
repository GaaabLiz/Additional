package it.gabliz.additional.fabric.init

import it.gabliz.additional.common.config.ModConfig
import it.gabliz.additional.common.helper.ModObjectInfo
import it.gabliz.additional.fabric.helper.FabricRegisterHelper
import it.gabliz.additional.common.init.ModItems
import it.gabliz.additional.fabric.Additional
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ItemInit : FabricRegisterHelper.Items {


    override fun registerAll() {
        Additional.LOGGER.debug("Registering mod items for ${ModConfig.MOD_NAME}...")
        ModItems.itemsList.forEach { entry ->
            registerItem(entry.key, entry.value)
        }
    }

    override fun registerItem(item: Item, info: ModObjectInfo.Item) {
        Registry.register(Registry.ITEM, Identifier(ModConfig.MOD_ID, info.idName), item)
    }
}