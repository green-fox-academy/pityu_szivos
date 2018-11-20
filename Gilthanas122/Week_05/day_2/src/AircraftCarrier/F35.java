package AircraftCarrier;

public class F35 extends Aircraft {

    public F35(){
        super(12, 50, "F35", true);
    }

    public F35(int maxAmmo, int baseDamage, String type, boolean isPriority) {
        super(maxAmmo, baseDamage, type, isPriority);
    }
}
