package main.java.by.tc.task01.service.validation.validators;

import main.java.by.tc.task01.service.validation.ValueValidator;

/**
 * Implementation of value validator that tries to convert object to not empty string
 */
public class StringValidator implements ValueValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            String str = (String) obj;
            return str.length() != 0;
        } catch (Exception e) {
            return false;
        }
    }
}
