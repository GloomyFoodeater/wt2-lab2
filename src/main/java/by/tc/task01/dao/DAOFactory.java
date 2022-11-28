package main.java.by.tc.task01.dao;

import main.java.by.tc.task01.dao.impl.XmlApplianceDAOImpl;

/**
 * Factory of appliance dao
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO applianceDAO = new XmlApplianceDAOImpl();

    private DAOFactory() {
    }

    /**
     * Get instance of factory
     *
     * @return Factory to obtain appliance dao
     */
    public static DAOFactory getInstance() {
        return instance;
    }

    /**
     * Get instance of appliance dao
     *
     * @return Appliance dao
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }
}
