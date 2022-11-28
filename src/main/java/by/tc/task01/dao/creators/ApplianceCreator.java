package main.java.by.tc.task01.dao.creators;

import main.java.by.tc.task01.entity.Appliance;
import org.w3c.dom.NodeList;

public interface ApplianceCreator {
    Appliance create(NodeList nodes);
}
