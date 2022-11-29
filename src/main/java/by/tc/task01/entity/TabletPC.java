package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

import java.awt.*;
import java.util.Locale;

/**
 * Tablet pc appliance
 */
public class TabletPC extends Appliance {
    public int batteryCapacity;
    public int displayInches;
    public int memoryRom;
    public int flashMemoryCapacity;
    public Color color;

    @Override
    public String toString() {
        return String.format(
                "TabletPC: BATTERY_CAPACITY=%d, " +
                        "DISPLAY_INCHES=%d, " +
                        "MEMORY_ROM=%d, " +
                        "FLASH_MEMORY=%d, " +
                        "COLOR=%s",
                batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color.toString());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        boolean b = false;
        try {
            b = switch (SearchCriteria.TabletPC.valueOf(key)) {
                case BATTERY_CAPACITY -> batteryCapacity == (Integer) value;
                case DISPLAY_INCHES -> displayInches == (Integer) value;
                case MEMORY_ROM -> memoryRom == (Integer) value;
                case FLASH_MEMORY_CAPACITY -> flashMemoryCapacity == (Integer) value;
                case COLOR -> color == Color.class.getField(value.toString().toLowerCase(Locale.ROOT)).get(null);
            };
        } catch (Exception e) {
            // Ignore.
        }
        return b;
    }
}
