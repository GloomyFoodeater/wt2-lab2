package main.java.by.tc.task01.service.validation.validators;

import main.java.by.tc.task01.service.validation.ValueValidator;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.Locale;

/**
 * Implementation of value validator that tries to convert object to color
 */
public class ColorValidator implements ValueValidator {

    /**
     * {@inheritDoc}
     */
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
