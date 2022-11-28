package java.main.by.tc.task01.service.validation.validators;


import java.main.by.tc.task01.entity.VacuumCleaner;
import java.main.by.tc.task01.service.validation.ValueValidator;

public class FilterTypeValidator implements ValueValidator {

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
