package it.gabliz.additional.fabric.helper

import it.gabliz.additional.common.helper.ModObjectInfo
import net.minecraft.block.Block
import net.minecraft.data.server.recipe.RecipeJsonProvider
import net.minecraft.item.Item
import net.minecraft.util.registry.RegistryEntry
import net.minecraft.util.registry.RegistryKey
import net.minecraft.village.VillagerProfession
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.OreFeatureConfig
import net.minecraft.world.poi.PointOfInterestType
import java.util.function.Consumer

interface FabricRegisterHelper {


    interface Blocks {
        fun registerAll()
        fun <T> registerBlock(block: T, registerItemBlock: Boolean = true)
    }

    interface Items {
        fun registerAll()
        fun registerItem(item: Item, info : ModObjectInfo.Item)
    }

    interface ItemGroups {
        fun registerAll()
    }

    interface Tooltip {
        fun registerLangTemplates()
    }

    interface Villagers {
        fun registerAll()
        fun registerPOI(name : String, block : Block) : PointOfInterestType
        fun registerProfession(name: String?, type: RegistryKey<PointOfInterestType?>?): VillagerProfession
    }

    interface Recipes {
        fun generateAll(exporter: Consumer<RecipeJsonProvider>)
    }

    interface Paintings {
        fun registerAll()
    }

    interface WorldFeature {
        fun registerAll()
        fun registerOreFeature(idName : String, targets:List<OreFeatureConfig.Target>, veinSize : Int) : RegistryEntry<ConfiguredFeature<OreFeatureConfig, *>>?
    }

}