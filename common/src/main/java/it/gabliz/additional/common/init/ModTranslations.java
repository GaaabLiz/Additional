package it.gabliz.additional.common.init;

import it.gabliz.additional.common.config.ModConfig;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class ModTranslations {

    public static Map<String, String> translationBuffer = new HashMap<String, String>();
    public static final String ttItem = "item";
    public static final String ttItemGroup = "itemGroup";
    public static final String ttBlock = "block";

    public static String getDescKey(String type, String idName) {
        return type + "." + ModConfig.MOD_ID + "." + idName + ".desc";
    }

    public static String getShiftTooltipKey(String type, String idName) {
        return type + "." + ModConfig.MOD_ID + "." + idName + ".tooltip.shift";
    }

    public static String getCtrlTooltipKey(String type, String idName) {
        return type + "." + ModConfig.MOD_ID + "." + idName + ".tooltip.ctrl";
    }

    public static void addNameTranslation(String type, String idName, String name) {
        String key = type + "." + ModConfig.MOD_ID + "." + idName;
        translationBuffer.put(key, name);
    }

    public static void addDescTranslation(String type, String idName, @Nullable String name) {
        if(name != null) {
            String key = getDescKey(type, idName);
            translationBuffer.put(key, name);
        }
    }

    public static void addShiftTooltipTranslation(String type, String idName, @Nullable String name) {
        if(name != null) {
            String key = getShiftTooltipKey(type, idName);
            translationBuffer.put(key, name);
        }
    }

    public static void addCtrlTooltipTranslation(String type, String idName, @Nullable String name) {
        if(name != null) {
            String key = getCtrlTooltipKey(type, idName);
            translationBuffer.put(key, name);
        }
    }

    public static void init() {
        addNameTranslation(ttItemGroup, ModItemGroup.List.TAB_ITEM.idName, ModItemGroup.List.TAB_ITEM.name);
        addNameTranslation(ttItemGroup, ModItemGroup.List.TAB_BLOCK.idName, ModItemGroup.List.TAB_BLOCK.name);
        for (ModItems.List item : ModItems.List.values()) {
            ModTranslations.addNameTranslation(ModTranslations.ttItem, item.idName, item.name);
            ModTranslations.addDescTranslation(ModTranslations.ttItem, item.idName, item.getDescription());
            ModTranslations.addShiftTooltipTranslation(ModTranslations.ttItem, item.idName, item.getShiftTooltip());
            ModTranslations.addCtrlTooltipTranslation(ModTranslations.ttItem, item.idName, item.getCtrlTooltip());
        }
    }

}
