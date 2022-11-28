package java.main.by.tc.task01.service.impl;

import java.main.by.tc.task01.service.validation.Validator;
import java.main.by.tc.task01.dao.ApplianceDAO;
import java.main.by.tc.task01.dao.DAOFactory;
import java.main.by.tc.task01.entity.Appliance;
import java.main.by.tc.task01.entity.criteria.Criteria;
import java.main.by.tc.task01.service.ApplianceService;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

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