package java.main.by.tc.task01.service.validation.validators;

import java.main.by.tc.task01.service.validation.ValueValidator;

public class StringValidator implements ValueValidator {
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
