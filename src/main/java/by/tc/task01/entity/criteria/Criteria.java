package main.java.by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

    private final String groupSearchName;
    private final Map<String, Object> criteriaMap = new HashMap<>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteriaMap.put(searchCriteria, value);
    }

    public Map<String, Object> getMap() {
        return criteriaMap;
    }
}
