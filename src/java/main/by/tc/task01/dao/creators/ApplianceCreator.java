package java.main.by.tc.task01.dao.creators;

import java.main.by.tc.task01.entity.Appliance;
import org.w3c.dom.NodeList;

public interface ApplianceCreator {
    Appliance create(NodeList nodes);
}