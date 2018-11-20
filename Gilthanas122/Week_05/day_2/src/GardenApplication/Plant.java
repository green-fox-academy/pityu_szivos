package GardenApplication;

public class Plant {
    private boolean needsWater;
    private double thirst;
    private double absorbLevel;
    private String name;

    public Plant() {
        this.needsWater = true;
        this.thirst = 0;
        this.absorbLevel = 0;
        this.name = "anyplant";
    }

    public Plant(String name){
        this.name = name;
    }



    public Plant(double absorbLevel, String name, double thirst) {
        this.absorbLevel = absorbLevel;
        this.name = name;
        this.thirst = thirst;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAbsorbLevel() {
        return absorbLevel;
    }

    public void setThirst(double thirst) {
        this.thirst = thirst;
    }

    public double getThirst() {
        return thirst;
    }

    public void setAbsorbLevel(double absorbLevel) {
        this.absorbLevel = absorbLevel;
    }

    public String isNeedsWater() {
        if (needsWater){
            return "needs water";
        }
        else {
            return "needs no water";
        }
    }

    public void setNeedsWater(boolean needsWater) {
        this.needsWater = needsWater;
    }

    public String getName() {
        return name;
    }



}
