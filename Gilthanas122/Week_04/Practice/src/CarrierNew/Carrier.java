package CarrierNew;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Carrier {
    private List<Aircraft> carrier;
    private int ammoStorage;
    private int healthPoint;

    public Carrier(int ammoStorage) {
        this.carrier = new ArrayList<>();
        this.ammoStorage = ammoStorage;
        this.healthPoint = 3000;
    }

    public void addAircraft(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public void fillAmmoCarrier() {
        try {
            if (this.ammoStorage == 0) {
                throw new ExceptionAmmo();
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }

        List<Aircraft> sortedCarrier = new ArrayList<>();
        for (Aircraft aircraft : carrier) {
            if (sortedCarrier.size() == 0) {
                sortedCarrier.add(aircraft);
            } else if (aircraft.isPriority) {
                sortedCarrier.add(0, aircraft);
            } else if (sortedCarrier.size() == 1 && !aircraft.isPriority) {
                sortedCarrier.add(1, aircraft);
            } else {
                sortedCarrier.add(sortedCarrier.size() - 1, aircraft);
            }
        }
        for (Aircraft aircraft : sortedCarrier) {
            ammoStorage = aircraft.refill(ammoStorage);
        }
        carrier = sortedCarrier;
    }

    public void fight(Carrier carrier) {
        int totalDamage = 0;
        boolean destroyed = false;
        for (Aircraft aircraft : this.carrier) {
            totalDamage = totalDamage + aircraft.fight();
        }
        carrier.healthPoint -= totalDamage;
        if (carrier.healthPoint - totalDamage > 0) {
            destroyed = true;
        } else{
            destroyed = false;
        }
        System.out.println("Carrier 1 fighter jets F11 and F35 fired shots at Carrier 2." );
        System.out.println(destroyed == true ? "Carrier 2 was destroyed" : "Carrier 2 has" +carrier.healthPoint + " healtpoints left");

    }
}
