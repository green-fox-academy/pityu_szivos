package AircraftCarrier;

public class Aircraft {
    private int maxAmmo;
    private int baseDamage;
    private int ammoCounter;
    private String type;



    public Aircraft(){
        this.maxAmmo = 0;
        this.baseDamage = 0;
        this.ammoCounter = maxAmmo;
        this.type = "";
    }

    public Aircraft(int maxAmmo, int baseDamage, String type) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.ammoCounter = maxAmmo;
        this.type = type;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }


    public void figth(){
        int damageCounter = 0;
        for (int i = 0; i <this.maxAmmo ; i++) {
            damageCounter = damageCounter + this.baseDamage;
        }
        System.out.println("The dealt damage: " + damageCounter);
    }

    public void refill(int addAmmo){
        F16 f16 = new F16();
        int restAmmo = addAmmo - this.getMaxAmmo();
        System.out.println(restAmmo);
    }

    public void getType(){
        System.out.println(this.type);
    }
}
