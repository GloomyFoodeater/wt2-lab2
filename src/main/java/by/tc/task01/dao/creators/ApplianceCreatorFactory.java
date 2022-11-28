package main.java.by.tc.task01.dao.creators;

import main.java.by.tc.task01.dao.creators.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory of appliance creators
 */
public class ApplianceCreatorFactory {
    private static final ApplianceCreatorFactory instance = new ApplianceCreatorFactory();

    private final Map<String, ApplianceCreator> creators = new HashMap<>();

    private ApplianceCreatorFactory() {
        creators.put("laptop", new LaptopCreator());
        creators.put("oven", new OvenCreator());
        creators.put("refrigerator", new RefrigeratorCreator());
        creators.put("speakers", new SpeakersCreator());
        creators.put("tabletPC", new TabletPCCreator());
        creators.put("vacuumCleaner", new VacuumCleanerCreator());
    }

    /**
     * Get instance of appliance creator factory
     *
     * @return Instance of appliance creator factory
     */
    public static ApplianceCreatorFactory getInstance() {
        return instance;
    }

    /**
     * Get creator of appliance by its name
     *
     * @param applianceName name of the appliance
     * @return Appliance creator that creates specified appliances from xml nodes
     */
    public ApplianceCreator getCreator(String applianceName) {
        return creators.get(applianceName);
    }
}
