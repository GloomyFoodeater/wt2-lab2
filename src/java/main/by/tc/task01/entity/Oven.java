package java.main.by.tc.task01.entity;

import java.main.by.tc.task01.entity.criteria.SearchCriteria;

public class Oven extends Appliance {
    public int powerConsumption;
    public int weight;
    public int capacity;
    public int depth;
    public double height;
    public double width;

    @Override
    public String toString() {
        return String.format(
                "Oven: POWER_CONSUMPTION=%d, " +
                        "WEIGHT=%d, " +
                        "CAPACITY=%d, " +
                        "DEPTH=%d, " +
                        "HEIGHT=%.2f, " +
                        "WIDTH=%.2f",
                powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public boolean matches(String key, Object value) {
        boolean result = false;
        try {
            result = switch (SearchCriteria.Oven.valueOf(key)) {
                case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
                case WEIGHT -> weight == (Integer) value;
                case CAPACITY -> capacity == (Integer) value;
                case DEPTH -> depth == (Integer) value;
                case HEIGHT -> height == Double.parseDouble(String.valueOf(value));
                case WIDTH -> width == Double.parseDouble(String.valueOf(value));
            };
        } catch (Exception e) {
            // Ignore.
        }
        return result;
    }
}