package Garden;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower2 = new Flower("orange");

        Tree tree = new Tree();
        Tree tree2 = new Tree("purple");

        flower.addPlant(flower);
        flower.addPlant(flower2);
        flower.addPlant(tree);
        flower.addPlant(tree2);

        flower.watering(10);
    }
}
