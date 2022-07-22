package it.gabliz.additional.common.item

import it.gabliz.additional.common.helper.ModObjectInfo
import net.minecraft.entity.EntityType
import net.minecraft.entity.boss.WitherEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.util.Hand
import net.minecraft.util.Rarity
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class DebugItem(
    override val idName: String,
    override val name: String,
    override val itemGroup: ItemGroup = ItemGroup.MISC
) : Item(Settings().group(itemGroup).rarity(Rarity.EPIC)), ModObjectInfo.Item{

    override val shiftTooltip: String?
        get() = "tooltipp"

    override val description: String?
        get() = "DO NOT USE"

    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        if(!world!!.isClient() && hand == Hand.MAIN_HAND) {
            user!!.sendMessage(Text.literal("I KNEW IT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"))
            val wither = WitherEntity(EntityType.WITHER, world)
            if (!user.abilities.creativeMode) {
                user.kill()
                world.spawnEntity(wither)
            }
        }
        return super.use(world, user, hand)
    }

}
