package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Speakers appliance
 */
public class Speakers extends Appliance {
    public int powerConsumption;
    public int numberOfSpeakers;
    public String frequencyRange;
    public int cordLength;

    @Override
    public String toString() {
        return String.format(
                "Speakers: POWER_CONSUMPTION=%d, " +
                        "NUMBER_OF_SPEAKERS=%d, " +
                        "FREQUENCY_RANGE=%s, " +
                        "CORD_LENGTH=%d",
                powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        boolean result = false;
        try {
            result = switch (SearchCriteria.Speakers.valueOf(key)) {
                case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
                case NUMBER_OF_SPEAKERS -> numberOfSpeakers == (Integer) value;
                case FREQUENCY_RANGE -> frequencyRange.equals(value);
                case CORD_LENGTH -> cordLength == (Integer) value;
            };
        } catch (Exception e) {
            // Ignore.
        }
        return result;
    }
}
