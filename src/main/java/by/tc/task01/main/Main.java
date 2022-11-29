package main.java.by.tc.task01.main;

import main.java.by.tc.task01.entity.Appliance;
import main.java.by.tc.task01.entity.criteria.Criteria;
import main.java.by.tc.task01.entity.criteria.SearchCriteria;
import main.java.by.tc.task01.service.ApplianceService;
import main.java.by.tc.task01.service.ServiceFactory;

import java.util.List;

/**
 * Console program
 */
public class Main {

    /**
     * Main function of console program
     * @param args command line arguments, unused
     */
    public static void main(String[] args) {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        // Ovens with capacity of 33
        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33);

        appliances = service.find(criteriaOven);
        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        // Ovens with height of 200 and width of 300
        criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

        appliances = service.find(criteriaOven);
        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        // Blue tablet pc with display of 14 inches and 4 ROM
        Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

        appliances = service.find(criteriaTabletPC);
        PrintApplianceInfo.print(appliances);
    }

}
