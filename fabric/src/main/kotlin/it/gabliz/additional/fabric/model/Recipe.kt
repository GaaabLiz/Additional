package it.gabliz.additional.fabric.model

import it.gabliz.additional.common.config.ModConfig
import it.gabliz.additional.utils.DataUtils
import net.minecraft.data.server.RecipeProvider
import net.minecraft.data.server.recipe.RecipeJsonProvider
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.item.ItemConvertible
import net.minecraft.util.Identifier
import java.util.function.Consumer

class Recipe() {

    data class Ing(
        val c : Char,
        val t : ItemConvertible,
        val ic : Boolean = false
    )

    inner class Shaped(val exporter: Consumer<RecipeJsonProvider>) {

        fun create(
            output : ItemConvertible,
            outputCount : Int,
            listOfPatterns : List<String>,
            vararg listOfInputs : Ing,
        ) {
            val r = ShapedRecipeJsonBuilder(output, outputCount)
            listOfPatterns.forEach { r.pattern(it) }
            listOfInputs.forEach {
                r.input(it.c, it.t)
            }
            r.criterion(
                RecipeProvider.hasItem(listOfInputs.first().t),
                RecipeProvider.conditionsFromItem(listOfInputs.first().t)
            )
            r.offerTo(
                exporter,
                Identifier(ModConfig.MOD_ID, "crafting/" + /*output.asItem().name + "_" */ DataUtils.generateRandomIntBetween(1,10000)))
        }
    }

    inner class ShapedFullSingleIng(private val exporter: Consumer<RecipeJsonProvider>) {

        fun create(
            input : ItemConvertible,
            output : ItemConvertible,
            outputCount : Int,
        ) {
            Shaped(exporter).create(output, outputCount, listOf("xxx", "xxx", "xxx"), Ing('x', input))
        }
    }
}
