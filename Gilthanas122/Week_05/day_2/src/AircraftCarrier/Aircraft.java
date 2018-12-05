package AircraftCarrier;

public class Aircraft {
    private int maxAmmo;
    private int baseDamage;
    private int ammoCounter;
    private String type;
    private boolean isPriority;



    public Aircraft(){
        this.maxAmmo = 0;
        this.baseDamage = 0;
        this.ammoCounter = maxAmmo;
        this.type = "stuff";
        this.isPriority = false;
    }

    public Aircraft(int maxAmmo, int baseDamage, String type, boolean isPriority) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.ammoCounter = maxAmmo;
        this.type = type;
        this.isPriority = isPriority;
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

    public int refill(int addAmmo){
        int restAmmo = addAmmo - this.getMaxAmmo();
        return restAmmo;
    }

    public String getType(){
        return this.type;
    }

    public void status(){
        System.out.println("Aircraft type " + this.type + " Max ammo " + this.maxAmmo + " Base damage " + this.baseDamage);
    }

    public boolean isPriority(){
        if(this.type == "F16"){
            return false;
        }
        else {
            return true;
        }
    }
}
