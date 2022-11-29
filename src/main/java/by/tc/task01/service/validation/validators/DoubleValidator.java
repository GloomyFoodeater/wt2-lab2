package main.java.by.tc.task01.service.validation.validators;

import main.java.by.tc.task01.service.validation.ValueValidator;

/**
 * Implementation of value validator that tries to convert object to positive double
 */
public class DoubleValidator implements ValueValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {

        try {
            return (Double) obj > 0;
        } catch (Exception e) {
            return false;
        }

    }
}
