/*package superGarden;

import java.util.ArrayList;
import java.util.List;

public class Garden implements Waterable {
    List<Waterable> plants;

    public void water(int amount) {
        List<Waterable> thirstyPlant = getThirstyPlants();
        amount /= thirstyPlant.size();
        for (Waterable plant : thirstyPlant) {
            if (plant.needWater()) {
                plant.water(amount);
            }

        }
    }

    public boolean needsWater() {
        return !getThirstyPlants().isEmpty()
    }

    public List<Waterable> getThirstyPlants() {
        List<Waterable> thirstyPlant = new ArrayList<>();
        for (Waterable plant : plants) {
            if (needWater()) {
                thirstyPlant.add(plant);
            }
        }
        return thirstyPlant;
    }

    @Override
    public String toString() {
        String result = "";
        for(Waterable plant : plants){
            result += plant.toString() + "\n";
        }
        return result;
    }

    public void add(Waterable plant)throws Exception{
        if (plant == null){
            throw new Exception("Put a real plant into the garden");
        }
        plants.add(plant);
    }

    @Override
    public void water(double amount) {

    }

    @Override
    public boolean needWater() {
        return false;
    }
}
*/