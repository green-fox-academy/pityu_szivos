package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List <Plant> plantsGarden = new ArrayList<>();


    public void addPlant(Plant plant){
        plantsGarden.add(plant);
    }

    public void waterPlants(int addWater){
        double portionWater = addWater / plantsGarden.size();
        for (Plant plant: plantsGarden) {
            if (plant.getAbsorbLevel()== 0.75){
                plant.setThirst(plant.getThirst()-portionWater* plant.getAbsorbLevel());
                if (plant.getThirst() > 5){
                    System.out.println("The " + plant.getName() + " " + plant.isNeedsWater());
                    ;
                }
                else {
                    plant.setNeedsWater(false);
                    System.out.println("The " + plant.getName() + " " +  plant.isNeedsWater());

                }
            }
            else{
                plant.setThirst(plant.getThirst()-portionWater* 0.40);
                if (plant.getThirst() > 10){
                    System.out.println("The " + plant.getName() + " " + plant.isNeedsWater());
                } else {
                    plant.setNeedsWater(false);
                    System.out.println("The " + plant.getName() + " " + plant.isNeedsWater());
                }
            }
        }
   }

}
