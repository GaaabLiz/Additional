package it.gabliz.additional.common.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DebugItem extends Item {

    public DebugItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            user.sendMessage(Text.literal("I KNEW IT!!!"));
            WitherEntity wither = new WitherEntity(EntityType.WITHER, world);
            if (!user.getAbilities().creativeMode) {
                user.kill();
                world.spawnEntity(wither);
            }
        }
        return super.use(world, user, hand);
    }
}
