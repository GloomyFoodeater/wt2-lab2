package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class VacuumCleaner extends Appliance {
    public int powerConsumption;
    public FilterType filterType;
    public String bagType;
    public String wandType;
    public int motorSpeedRegulation;
    public int cleaningWidth;

    @Override
    public String toString() {
        return String.format(
                "VacuumCleaner: POWER_CONSUMPTION=%d, " +
                        "FILTER_TYPE=%s, " +
                        "BAG_TYPE=%s, " +
                        "WAND_TYPE=%s, " +
                        "MOTOR_SPEED_REGULATION=%d, " +
                        "CLEANING_WIDTH=%d",
                powerConsumption, filterType.toString(), bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public boolean matches(String key, Object value) {
        boolean result = false;
        try {
            result = switch (SearchCriteria.VacuumCleaner.valueOf(key)) {
                case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
                case FILTER_TYPE -> filterType == FilterType.valueOf((String) value);
                case BAG_TYPE -> bagType.equals(value);
                case WAND_TYPE -> wandType.equals(value);
                case MOTOR_SPEED_REGULATION -> motorSpeedRegulation == (Integer) value;
                case CLEANING_WIDTH -> cleaningWidth == (Integer) value;
            };
        } catch (Exception e) {
            // Ignore.
        }
        return result;
    }

    public enum FilterType {
        A, B, C
    }
}
