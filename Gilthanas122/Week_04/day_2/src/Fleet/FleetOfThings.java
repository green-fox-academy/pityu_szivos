package Fleet;

public class FleetOfThings {


    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing mythings1 = new Thing("Get milk");
        Thing mythings2 = new Thing("Remove obstacles");
        Thing mythings3 = new Thing("Stand up");
        Thing mythings4 = new Thing("Eat lunch");

        fleet.add(mythings1);
        fleet.add(mythings2);
        fleet.add(mythings3);
        fleet.add(mythings4);

        mythings3.complete();
        mythings4.complete();


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}

