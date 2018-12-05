package CarrierNew;

public class Aircraft {
    String type;
    int maxAmmo;
    int damage;
    int currentAmmo;
    boolean isPriority;

    @Override
    public String toString() {
        return  "Type" + type + '\'' +
                ", maxAmmo:" + maxAmmo +
                ", damage:" + damage +
                ", currentAmmo:" + currentAmmo;
    }

    public Aircraft(String type) {
        this.type = type.toLowerCase();
        if (type == "f16") {
            maxAmmo = 8;
            damage = 30;
            isPriority = false;
        } else {
            maxAmmo = 12;
            damage = 50;
            isPriority = true;
        }
        currentAmmo = 0;
    }

    public int fight() {
        currentAmmo = 0;
        int dealtDamage = maxAmmo * damage;
       return dealtDamage;
    }

    public int refill(int addAmmo) {
        if (addAmmo > maxAmmo - currentAmmo) {
            addAmmo = addAmmo -maxAmmo + currentAmmo;
            currentAmmo = maxAmmo;
            return addAmmo;
        }
            currentAmmo += addAmmo;
            addAmmo = 0;
            return addAmmo;
    }

    public void getType() {
        System.out.println(type);
    }


    public boolean isPriority() {
        return isPriority;
    }

}
