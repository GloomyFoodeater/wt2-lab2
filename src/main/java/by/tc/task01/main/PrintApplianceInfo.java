package main.java.by.tc.task01.main;

import main.java.by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(Appliance appliance) {
        if (appliance == null) {
            System.err.println("Appliance was not found");
            return;
        }
        System.out.println(appliance);
    }

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
