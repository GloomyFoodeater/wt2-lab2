package main.java.by.tc.task01.entity.criteria;

/**
 * Enumerations of search criteria for all implemented appliances
 */
public final class SearchCriteria {

    private SearchCriteria() {
    }

    /**
     * Field criteria for ovens
     */
    public enum Oven {
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    /**
     * Field criteria for laptops
     */
    public enum Laptop {
        BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES
    }

    /**
     * Field criteria for refrigerators
     */
    public enum Refrigerator {
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    /**
     * Field criteria for vacuum cleaners
     */
    public enum VacuumCleaner {
        POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    /**
     * Field criteria for tablet pc
     */
    public enum TabletPC {
        BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    /**
     * Field criteria for speakers
     */
    public enum Speakers {
        POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
    }
}