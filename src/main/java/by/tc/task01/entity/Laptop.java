package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Laptop appliance
 */
public class Laptop extends Appliance {
    public double batteryCapacity;
    public String os;
    public int memoryRom;
    public int systemMemory;
    public double cpu;
    public int displayInches;

    @Override
    public String toString() {
        return String.format(
                "Laptop: BATTERY_CAPACITY=%.1f, " +
                        "OS=%s, " +
                        "MEMORY_ROM=%d, " +
                        "SYSTEM_MEMORY=%d, " +
                        "CPU=%.1f, " +
                        "DISPLAY_INCHES=%d",
                batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        boolean result = false;
        try {
            result = switch (SearchCriteria.Laptop.valueOf(key)) {
                case BATTERY_CAPACITY -> batteryCapacity == Double.parseDouble(String.valueOf(value));
                case OS -> os.equals(value);
                case MEMORY_ROM -> memoryRom == (Integer) value;
                case SYSTEM_MEMORY -> systemMemory == (Integer) value;
                case CPU -> cpu == Double.parseDouble(String.valueOf(value));
                case DISPLAY_INCHES -> displayInches == (Integer) value;
            };
        } catch (Exception e) {
            // Ignore.
        }
        return result;
    }
}