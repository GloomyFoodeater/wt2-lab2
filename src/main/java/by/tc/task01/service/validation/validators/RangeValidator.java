package main.java.by.tc.task01.service.validation.validators;

import main.java.by.tc.task01.service.validation.ValueValidator;

/**
 * Implementation of value validator that tries to convert object to string,
 * that consist of 2 doubles separated by hyphen
 */
public class RangeValidator implements ValueValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            String range = (String) obj;
            String[] numbers = range.split("-");
            if (numbers.length != 2) return false;
            for (String number : numbers) {
                if (Double.parseDouble(number) < 0) return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
