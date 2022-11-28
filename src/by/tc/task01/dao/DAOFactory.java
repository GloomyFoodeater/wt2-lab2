package by.tc.task01.dao;

import by.tc.task01.dao.impl.XmlApplianceDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO applianceDAO = new XmlApplianceDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }
}
