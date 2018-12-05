package Garden;

import java.util.ArrayList;
import java.util.List;

public abstract class Garden {
    protected double absorptionLevel;
    protected boolean isThirsty;
    protected String color;
    private List<Garden> gardenElements;
    protected int amountWaterNeeded;


    public Garden() {
        this.isThirsty = true;
        gardenElements = new ArrayList<Garden>();
    }


    public void setThirsty(boolean thirsty) {
        isThirsty = thirsty;
    }

    public void addPlant(Garden garden) {
        gardenElements.add(garden);
    }

    public void watering(int water) {
        int portionWater = water / gardenElements.size();
        for (int i = 0; i < gardenElements.size(); i++) {
            if (portionWater * gardenElements.get(i).absorptionLevel > gardenElements.get(i).amountWaterNeeded) {
                System.out.println(gardenElements.get(i).color + " " + gardenElements.get(i).getClass().getSimpleName() + " needs no water");
            } else {
                System.out.println(gardenElements.get(i).color + " " + gardenElements.get(i).getClass().getSimpleName() + " needs water");
            }
        }
    }
}
