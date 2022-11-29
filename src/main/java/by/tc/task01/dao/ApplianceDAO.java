package main.java.by.tc.task01.dao;

import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * Interface of appliance dao
 */
public interface ApplianceDAO {

    /**
     * Finds all appliances that match given criteria
     *
     * @param criteria criteria that must be met
     * @return Subset of appliances in shop
     */
    List<Appliance> find(Criteria criteria);
}
