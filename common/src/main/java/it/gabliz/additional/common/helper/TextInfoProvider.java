package it.gabliz.additional.common.helper;

public interface TextInfoProvider {
    default String getDescription() { return  null; }
    default String getShiftTooltip() { return  null; }
    default String getCtrlTooltip() { return  null; }
}
