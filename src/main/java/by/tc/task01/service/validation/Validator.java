package main.java.by.tc.task01.service.validation;

import main.java.by.tc.task01.entity.criteria.Criteria;

/**
 * Class to check validity of mapped criteria
 */
public class Validator {

    /**
     * Validate mapped criteria
     *
     * @param criteria criteria to validate
     * @return true if criteria is not null, its map is not null and
     * all search criteria were valid, else - false
     */
    public static boolean validateCriteria(Criteria criteria) {

        if (criteria == null || criteria.getMap() == null) return false;

        for (var entry : criteria.getMap().entrySet()) {
            ValueValidator validator = ValueValidatorFactory.getInstance().getValidator(entry.getKey());
            boolean isValid = validator.validate(entry.getValue());
            if (!isValid) return false;
        }
        return true;
    }

}