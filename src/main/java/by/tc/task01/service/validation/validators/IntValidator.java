package main.java.by.tc.task01.service.validation.validators;

import main.java.by.tc.task01.service.validation.ValueValidator;

public class IntValidator implements ValueValidator {

    @Override
    public boolean validate(Object obj) {

        try {
            return (Integer) obj > 0;
        } catch (Exception e) {
            return false;
        }
    }
}