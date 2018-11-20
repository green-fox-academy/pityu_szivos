package GardenApplication;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Plant flower = new Flower("blue flower");
        Plant flower2 = new Flower( "yellow flower");
        Plant flower3 = new Flower("green flower");
        Tree tree1 = new Tree("pine tree");
        Tree tree2 = new Tree("oak tree");
        Tree tree3 = new Tree("red pine tree");

        ((Garden) garden).addPlant(flower);
        ((Garden) garden).addPlant(flower2);
        ((Garden) garden).addPlant(flower3);
        ((Garden) garden).addPlant(tree1);
        ((Garden) garden).addPlant(tree2);
        ((Garden) garden).addPlant(tree3);
        garden.waterPlants(100);
    }
}
