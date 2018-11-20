package AircraftCarrier;

public class F35 extends Aircraft {

    public F35(){
        super(12, 50, "F35");
    }

    public F35(int maxAmmo, int baseDamage, String type) {
        super(maxAmmo, baseDamage, type);
    }
}
