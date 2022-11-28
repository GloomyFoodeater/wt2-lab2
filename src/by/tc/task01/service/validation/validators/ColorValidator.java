package by.tc.task01.service.validation.validators;

import by.tc.task01.service.validation.ValueValidator;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.Locale;

public class ColorValidator implements ValueValidator {
    @Override
    public boolean validate(Object obj) {
        try {
            Field field = Color.class.getField(obj.toString().toLowerCase(Locale.ROOT));
            return field.get(null) != null;
        } catch (Exception e) {
            return false;
        }
    }
}
