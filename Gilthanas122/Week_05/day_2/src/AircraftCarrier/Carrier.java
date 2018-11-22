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
        int counterPriority = 0;
        int counterNonPriority = 1;
        for (int i = 0; i < carrierList.size(); i++) {
            if (carrierList.get(i).isPriority()) {
                sortedCarrier.add(counterPriority , carrierList.get(i));
                counterPriority++;
            } else {
                sortedCarrier.add(sortedCarrier.size() - counterNonPriority, carrierList.get(i));
                counterNonPriority++;
            }
        }
        for (Aircraft aircraft2 : sortedCarrier) {
            if (ammoStorage - aircraft2.getMaxAmmo() > 0) {
                ammoStorage = ammoStorage - aircraft2.getMaxAmmo();
            }
        }
        System.out.println(ammoStorage);
    }

    public int damageCarrier(Carrier carrier){
        Carrier
        int damageCarrierIn = 0;
        for (Aircraft aircraft: Carrier.) {

        }
    }

}
