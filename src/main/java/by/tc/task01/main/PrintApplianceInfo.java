package main.java.by.tc.task01.main;

import main.java.by.tc.task01.entity.Appliance;

import java.util.List;

/**
 * Utils to print appliances to console
 */
public class PrintApplianceInfo {

    /**
     * Print single appliance object
     *
     * @param appliance appliance object to print
     */
    public static void print(Appliance appliance) {
        if (appliance == null) {
            System.err.println("Appliance was not found");
            return;
        }
        System.out.println(appliance);
    }

    /**
     * Print collection of appliance objects
     *
     * @param appliances list of appliance objects to print
     */
    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            System.err.println("Appliances was not found");
            return;
        }
        for (Appliance appliance : appliances) {
            print(appliance);
        }
    }
}
