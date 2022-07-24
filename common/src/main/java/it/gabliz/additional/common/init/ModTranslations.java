package it.gabliz.additional.common.init;

import it.gabliz.additional.common.config.ModConfig;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class ModTranslations {

    public static Map<String, String> translationBuffer = new HashMap<String, String>();
    public static final String ttItem = "item";

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
        for (ModItems.List item : ModItems.List.values()) {
            ModTranslations.addNameTranslation(ModTranslations.ttItem, item.idName, item.name);
            ModTranslations.addDescTranslation(ModTranslations.ttItem, item.idName, item.description);
            ModTranslations.addShiftTooltipTranslation(ModTranslations.ttItem, item.idName, item.shiftTooltip);
            ModTranslations.addCtrlTooltipTranslation(ModTranslations.ttItem, item.idName, item.ctrlTooltip);
        }
    }

}
