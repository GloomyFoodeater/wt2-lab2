package main.java.by.tc.task01.service.impl;

import main.java.by.tc.task01.dao.ApplianceDAO;
import main.java.by.tc.task01.dao.DAOFactory;
import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.service.ApplianceService;
import main.java.by.tc.task01.service.validation.Validator;

import java.util.List;

/**
 * Implementation of appliance service interface that validated criteria and uses dal
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * Wrapper over appliance dao function with criteria validation
     *
     * @param criteria criteria to filter appliances with
     * @return Subset of appliances in shop or null in case of validation error or dal error
     */
    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.validateCriteria(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        return applianceDAO.find(criteria);
    }

}