package main.java.by.tc.task01.entity;

/**
 * Appliance of the shop that can be filtered by search criteria
 */
public abstract class Appliance {

    /**
     * Predicate defining whether appliance matches search criteria
     * @param key name of search criteria
     * @param value value of search criteria
     * @return true if appliance matches criteria, else - false
     */
    public abstract boolean matches(String key, Object value);
}