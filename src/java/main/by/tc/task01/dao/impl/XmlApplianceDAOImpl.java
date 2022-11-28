package java.main.by.tc.task01.dao.impl;

import java.main.by.tc.task01.dao.creators.ApplianceCreator;
import java.main.by.tc.task01.dao.creators.ApplianceCreatorFactory;
import java.main.by.tc.task01.entity.criteria.Criteria;
import java.main.by.tc.task01.dao.ApplianceDAO;
import java.main.by.tc.task01.entity.Appliance;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class XmlApplianceDAOImpl implements ApplianceDAO {

    private static final String DB_PATH = "./src/main/by/tc/task01/main/resources/appliances_db.xml";

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> matches = new ArrayList<>();
        try {

            // Create document builder
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

            // Create DOM tree document from a file
            Document document = documentBuilder.parse(new File(DB_PATH));

            // Get root element
            Node root = document.getDocumentElement();

            // Get all sub elements
            NodeList nodes = root.getChildNodes();

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    if (node.getNodeName().equalsIgnoreCase(criteria.getGroupSearchName())) {
                        ApplianceCreator ac = ApplianceCreatorFactory.getInstance().getCreator(node.getNodeName());
                        Appliance appliance = ac.create(node.getChildNodes());

                        boolean isValid = true;
                        for (Map.Entry<String, Object> entry : criteria.getMap().entrySet()) {
                            if (!appliance.matches(entry.getKey(), entry.getValue())) {
                                isValid = false;
                                break;
                            }
                        }

                        if (isValid)
                            matches.add(appliance);
                    }
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return matches;
    }

}