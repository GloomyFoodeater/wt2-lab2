package main.java.by.tc.task01.service.validation.validators;


import main.java.by.tc.task01.entity.VacuumCleaner;
import main.java.by.tc.task01.service.validation.ValueValidator;

/**
 * Implementation of value validator that tries to convert object to vacuum filter enumeration
 */
public class FilterTypeValidator implements ValueValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            VacuumCleaner.FilterType.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
