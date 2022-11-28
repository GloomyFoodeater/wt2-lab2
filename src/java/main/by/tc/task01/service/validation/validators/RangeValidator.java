package java.main.by.tc.task01.service.validation.validators;

import java.main.by.tc.task01.service.validation.ValueValidator;

public class RangeValidator implements ValueValidator {
    @Override
    public boolean validate(Object obj) {
        try {
            String range = (String) obj;
            String[] numbers = range.split("-");
            if (numbers.length != 2)
                return false;
            for (String number : numbers) {
                if (Double.parseDouble(number) < 0)
                    return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
