package java.main.by.tc.task01.dao;

import java.main.by.tc.task01.entity.Appliance;
import java.main.by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
