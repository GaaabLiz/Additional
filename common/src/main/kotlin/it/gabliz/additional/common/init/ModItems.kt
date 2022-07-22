package it.gabliz.additional.common.init

import it.gabliz.additional.common.datagen.TranslationProvider
import it.gabliz.additional.common.helper.CommonRegisterHelper
import it.gabliz.additional.common.helper.ModObjectInfo
import it.gabliz.additional.common.item.DebugItem
import net.minecraft.item.Item

class ModItems() {

    companion object : CommonRegisterHelper.Items{

        @JvmField val itemsList = mutableMapOf<Item, ModObjectInfo.Item>()
        //override val translationBuffer: MutableMap<String, String> get() = mutableMapOf()
        //private val bufferAdder : (key : String, value : String) -> Unit = { key, value -> translationBuffer[key] = value }

        @JvmField val DEBUG_ITEM = DebugItem("debug_item", "DEBUG ITEM (ONLY DEV)")

        @JvmStatic
        override fun init() {
            initItem(DEBUG_ITEM)
        }

        @JvmStatic
        override fun <T> initItem(itemObj: T) {
            val item = itemObj as Item
            val info = itemObj as ModObjectInfo.Item
            itemsList[item] = info
            //addNameTranslation(ttItem, info.idName, info.name, bufferAdder)
            //addDescriptionTranslation(ttItem, info.idName, info.description, bufferAdder)
            //addTooltipTranslation(ttItem, info.idName, info.shiftTooltip, bufferAdder)
        }

    }

}