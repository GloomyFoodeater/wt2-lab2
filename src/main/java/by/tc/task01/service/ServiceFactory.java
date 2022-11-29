package main.java.by.tc.task01.service;

import main.java.by.tc.task01.service.impl.ApplianceServiceImpl;

/**
 * Factory of appliance services
 */
public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {
    }

    /**
     * Get instance of service factory
     *
     * @return Instance of service factory
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

    /**
     * Get instance of appliance service
     *
     * @return Instance of appliance service
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }
}
