package main.java.by.tc.task01.dao.creators;

import main.java.by.tc.task01.entity.Appliance;
import org.w3c.dom.NodeList;

/**
 * Interface of factory of appliances
 */
public interface ApplianceCreator {

    /**
     * Create appliance by list of its inner nodes
     *
     * @param nodes list of xml nodes with appliance field values
     * @return Appliance created from xml
     */
    Appliance create(NodeList nodes);
}
