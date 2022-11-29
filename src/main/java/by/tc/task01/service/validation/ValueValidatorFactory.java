package main.java.by.tc.task01.service.validation;


import main.java.by.tc.task01.entity.criteria.SearchCriteria;
import main.java.by.tc.task01.service.validation.validators.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Factory of value validator
 */
public class ValueValidatorFactory {
    private static final ValueValidatorFactory instance = new ValueValidatorFactory();

    private final Map<List<String>, ValueValidator> validators = new HashMap<>();

    private ValueValidatorFactory() {

        // Integer parameters
        validators.put(List.of(SearchCriteria.Oven.POWER_CONSUMPTION.name(),
                        SearchCriteria.Oven.WEIGHT.name(),
                        SearchCriteria.Oven.CAPACITY.name(),
                        SearchCriteria.Oven.DEPTH.name(),

                        SearchCriteria.Laptop.MEMORY_ROM.name(),
                        SearchCriteria.Laptop.SYSTEM_MEMORY.name(),
                        SearchCriteria.Laptop.DISPLAY_INCHES.name(),

                        SearchCriteria.Refrigerator.POWER_CONSUMPTION.name(),
                        SearchCriteria.Refrigerator.WEIGHT.name(),
                        SearchCriteria.Refrigerator.FREEZER_CAPACITY.name(),
                        SearchCriteria.Refrigerator.HEIGHT.name(),
                        SearchCriteria.Refrigerator.WIDTH.name(),

                        SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name(),
                        SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name(),
                        SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name(),

                        SearchCriteria.TabletPC.BATTERY_CAPACITY.name(),
                        SearchCriteria.TabletPC.DISPLAY_INCHES.name(),
                        SearchCriteria.TabletPC.MEMORY_ROM.name(),
                        SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(),

                        SearchCriteria.Speakers.POWER_CONSUMPTION.name(),
                        SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(),
                        SearchCriteria.Speakers.CORD_LENGTH.name()
                ),
                new IntValidator());

        // Double parameters
        validators.put(List.of(
                SearchCriteria.Oven.HEIGHT.name(),
                SearchCriteria.Oven.WIDTH.name(),

                SearchCriteria.Laptop.BATTERY_CAPACITY.name(),
                SearchCriteria.Laptop.CPU.name(),

                SearchCriteria.Refrigerator.OVERALL_CAPACITY.name()
        ), new DoubleValidator());

        // String parameters
        validators.put(List.of(
                SearchCriteria.Laptop.OS.name(),

                SearchCriteria.VacuumCleaner.BAG_TYPE.name(),
                SearchCriteria.VacuumCleaner.WAND_TYPE.name()
        ), new StringValidator());

        // Filter type parameters
        validators.put(List.of(
                SearchCriteria.VacuumCleaner.FILTER_TYPE.name()
        ), new FilterTypeValidator());

        // Color parameters
        validators.put(List.of(
                SearchCriteria.TabletPC.COLOR.name()
        ), new ColorValidator());

        // Range parameters
        validators.put(List.of(
                SearchCriteria.Speakers.FREQUENCY_RANGE.name()
        ), new RangeValidator());
    }

    /**
     * Get instance of value validator factory
     * @return Instance of value validator factory
     */
    public static ValueValidatorFactory getInstance() {
        return instance;
    }

    /**
     * Get instance of value validator by search criteria name
     * @param searchCriteria name of search criteria
     * @return Instance of value validator
     */
    public ValueValidator getValidator(String searchCriteria) {

        for (var entry : validators.entrySet()) {
            if (entry.getKey().contains(searchCriteria))
                return entry.getValue();
        }
        return null;
    }
}
