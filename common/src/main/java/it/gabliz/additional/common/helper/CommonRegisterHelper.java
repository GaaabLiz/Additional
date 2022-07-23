package it.gabliz.additional.common.helper;

import net.minecraft.item.Item;

public interface CommonRegisterHelper {

    interface Items {
        void init();
        <T> void initItem(Item item, ModObjectInfo.ItemInfo info);
    }
}