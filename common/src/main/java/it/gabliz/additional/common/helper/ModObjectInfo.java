package it.gabliz.additional.common.helper;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class ModObjectInfo {

    public static class ItemInfo {

        public enum Category  { CRAFTING_ITEM, SEED }

        @NotNull String idName;
        @NotNull String name;
        @NotNull Category category;
        @Nullable String description;
        @Nullable String shiftTooltip;

        public ItemInfo(@NotNull String idName, @NotNull String name, @NotNull Category category) {
            this.idName = idName;
            this.name = name;
            this.category = category;
        }

        public String getIdName() {
            return idName;
        }

        public void setIdName(String idName) {
            this.idName = idName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        @Nullable
        public String getDescription() {
            return description;
        }

        public void setDescription(@Nullable String description) {
            this.description = description;
        }

        @Nullable
        public String getShiftTooltip() {
            return shiftTooltip;
        }

        public void setShiftTooltip(@Nullable String shiftTooltip) {
            this.shiftTooltip = shiftTooltip;
        }
    }
}
