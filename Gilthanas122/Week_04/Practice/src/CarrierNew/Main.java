package CarrierNew;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("f16");
        Aircraft aircraft2 = new Aircraft("f35");
        aircraft.fight();
        aircraft.getType();
        System.out.println(aircraft.toString());

        System.out.println(aircraft.isPriority());;

        Carrier carrier = new Carrier(500);
        Carrier carrier2 = new Carrier(500);

        carrier.addAircraft(aircraft);
        carrier.addAircraft(aircraft);
        carrier.addAircraft(aircraft);
        carrier.addAircraft(aircraft);
        carrier.addAircraft(aircraft2);
        carrier.addAircraft(aircraft2);
        carrier.addAircraft(aircraft2);
        carrier.addAircraft(aircraft2);

        carrier.fillAmmoCarrier();
        carrier2.fillAmmoCarrier();

        carrier.fight(carrier2);

    }
}

