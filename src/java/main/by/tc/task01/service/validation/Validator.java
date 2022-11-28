package java.main.by.tc.task01.service.validation;

import java.main.by.tc.task01.entity.criteria.Criteria;

public class Validator {
    public static boolean validateCriteria(Criteria criteria) {

        if (criteria == null || criteria.getMap() == null)
            return false;

        for (var entry : criteria.getMap().entrySet()) {
            ValueValidator validator = ValueValidatorFactory.getInstance().getValidator(entry.getKey());
            boolean isValid = validator.validate(entry.getValue());
            if (!isValid)
                return false;
        }
        return true;
    }

}