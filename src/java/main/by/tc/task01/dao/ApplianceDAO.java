package java.main.by.tc.task01.dao;

import java.main.by.tc.task01.entity.Appliance;
import java.main.by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);
}
