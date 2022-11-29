package main.java.by.tc.task01.service.validation;

/**
 * Interface of validator that checks if object can be converted
 * to certain type in certain way, specified in implementation
 */
public interface ValueValidator {

    /**
     * Predicate that checks success of conversion
     *
     * @param obj object to try to convert
     * @return true if object is convertible, else - false
     */
    boolean validate(Object obj);

}
