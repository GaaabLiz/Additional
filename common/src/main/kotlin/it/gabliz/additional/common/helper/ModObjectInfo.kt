package it.gabliz.additional.common.helper

import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.BlockStateSupplier
import net.minecraft.data.client.BlockStateVariantMap
import net.minecraft.item.ItemGroup
import net.minecraft.util.Rarity
import net.minecraft.village.VillagerProfession

interface ModObjectInfo {



    interface Block {

        enum class ModelType { SimpleCubeAll, SimpleBooleanState, CROP_BLOCK }

        val idName : String
        val name : String
        val description : String? get() = null
        val shiftTooltip : String? get() = null
        val model : ModelType get() = ModelType.SimpleCubeAll

        fun getBlockStateMap(blockStateModelGenerator: BlockStateModelGenerator?) : BlockStateVariantMap? = null
        fun getVariantModel(blockStateModelGenerator: BlockStateModelGenerator) : BlockStateSupplier? = null
    }

    interface Item {
        enum class ItemType { CRAFTING_ITEM, SEED }
        val idName : String
        val name : String
        val itemGroup : ItemGroup
        val description : String? get() = null
        val shiftTooltip : String? get() = null
        val hasGlint : Boolean get() = false
        val rarity : Rarity get() = Rarity.COMMON
        val itemType : ItemType get() = ItemType.CRAFTING_ITEM
    }

    interface Villager {
        val poiID : String
        val professionID : String
        val name : String
        val workBlock : net.minecraft.block.Block
        fun registerTrades(profession : VillagerProfession)
    }

}