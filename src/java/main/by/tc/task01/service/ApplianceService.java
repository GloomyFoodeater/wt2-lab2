package java.main.by.tc.task01.service;

import java.main.by.tc.task01.entity.Appliance;
import java.main.by.tc.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria);
	
}
