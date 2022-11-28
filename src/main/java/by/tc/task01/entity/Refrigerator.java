package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

public class Refrigerator extends Appliance {
    public int powerConsumption;
    public int weight;
    public int freezerCapacity;
    public int overallCapacity;
    public int height;
    public int width;

    @Override
    public String toString() {
        return String.format(
                "Refrigerator: POWER_CONSUMPTION=%d, " +
                        "WEIGHT=%d, " +
                        "FREEZER_CAPACITY=%d, " +
                        "OVERALL_CAPACITY=%d, " +
                        "HEIGHT=%d, " +
                        "WIDTH=%d",
                powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public boolean matches(String key, Object value) {
        boolean result = false;
        try {
            result = switch (SearchCriteria.Refrigerator.valueOf(key)) {
                case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
                case WEIGHT -> weight == (Integer) value;
                case FREEZER_CAPACITY -> freezerCapacity == (Integer) value;
                case OVERALL_CAPACITY -> overallCapacity == (Integer) value;
                case HEIGHT -> height == Double.parseDouble(String.valueOf(value));
                case WIDTH -> width == Double.parseDouble(String.valueOf(value));
            };
        } catch (Exception e) {
            // Ignore.
        }
        return result;
    }
}
