package AircraftCarrier;

import java.util.*;

public class Carrier extends Aircraft {

    private int ammoStorage;
    private int health;

    List<Aircraft> carrierList = new ArrayList<>();

    public Carrier() {
        this.ammoStorage = 300;
        this.health = 5000;
    }

    public Carrier(int maxAmmo, int baseDamage, String type, int ammoStorage, boolean isPriority) {
        super(maxAmmo, baseDamage, type, isPriority);
        this.ammoStorage = ammoStorage;
    }

    public int getAmmoStorage() {
        return ammoStorage;
    }

    public void addPlane(Aircraft aircraft) {
        carrierList.add(aircraft);
    }

    public void fillAircraft() {
        List<Aircraft> sortedCarrier = new ArrayList<>(carrierList.size());
        for (Aircraft aircraft: carrierList) {
            if(aircraft.isPriority()){
                sortedCarrier.add(0, aircraft);
            } else if(sortedCarrier.size() == 1 && !aircraft.isPriority()) {
                sortedCarrier.add(1, aircraft);
            } else{
                sortedCarrier.add(sortedCarrier.size() -1, aircraft);
            }
        }
        for (Aircraft aircraft2 : sortedCarrier) {
            if (ammoStorage - aircraft2.getMaxAmmo() > 0) {
                aircraft2.refill(ammoStorage);
                ammoStorage = ammoStorage - aircraft2.getMaxAmmo();
            }
        }
        System.out.println(ammoStorage);
    }


}
