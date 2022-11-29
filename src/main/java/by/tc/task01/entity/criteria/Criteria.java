package main.java.by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * Mapped group criteria to filter appliances with
 */
public class Criteria {

    private final String groupSearchName;
    private final Map<String, Object> criteriaMap = new HashMap<>();

    /**
     * Create criteria of specified appliances
     *
     * @param groupSearchName Type of appliance as string to search
     */
    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    /**
     * Get group name of appliances to search
     *
     * @return Type of appliance as string to search
     */
    public String getGroupSearchName() {
        return groupSearchName;
    }

    /**
     * Add new search criteria in criteria map
     *
     * @param searchCriteria name of search criteria to filter by
     * @param value          value of search criteria to compare with
     */
    public void add(String searchCriteria, Object value) {
        criteriaMap.put(searchCriteria, value);
    }

    /**
     * Get criteria map
     *
     * @return Map of appliance search criteria and their values
     */
    public Map<String, Object> getMap() {
        return criteriaMap;
    }
}
