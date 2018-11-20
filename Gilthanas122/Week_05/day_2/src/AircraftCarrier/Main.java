package AircraftCarrier;

public class Main {
    public static void main(String[] args) {
        F16 f16 = new F16();
        F35 f35 = new F35();
        Carrier carrier = new Carrier();
        f35.figth();

        f35.refill(300);

        f35.status();

        carrier.addPlane(f35);
        carrier.addPlane(f16);
        carrier.addPlane(f16);
        carrier.addPlane(f16);
        carrier.addPlane(f35);
        carrier.addPlane(f35);
        carrier.addPlane(f35);
        carrier.addPlane(f35);


        carrier.fillAircraft();
    }


}
