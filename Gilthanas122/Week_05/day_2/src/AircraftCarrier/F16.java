package AircraftCarrier;

public class F16 extends Aircraft {

    public F16() {
        super(8, 30, "F16", false);
    }

    public F16(int maxAmmo, int baseDamage, String type, boolean isPriority) {
        super(maxAmmo, baseDamage, type, isPriority);
    }

}
