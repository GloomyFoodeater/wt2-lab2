package java.main.by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

    private String groupSearchName;
    private Map<String, Object> criteria = new HashMap<>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, Object> getMap(){
        return criteria;
    }
}
