package java.main.by.tc.task01.service.impl;

import java.main.by.tc.task01.dao.ApplianceDAO;
import java.main.by.tc.task01.dao.DAOFactory;
import java.main.by.tc.task01.entity.Appliance;
import java.main.by.tc.task01.entity.criteria.Criteria;
import java.main.by.tc.task01.service.ApplianceService;
import java.main.by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
