package java.main.by.tc.task01.service;

import java.main.by.tc.task01.entity.criteria.Criteria;
import java.main.by.tc.task01.entity.Appliance;
import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria);
	
}
