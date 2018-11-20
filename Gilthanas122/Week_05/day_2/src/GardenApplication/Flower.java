package GardenApplication;

public class Flower extends Plant {

    public Flower() {
        super( 0.75, "anyflower", 10.00);

    }

    public Flower(String name) {
        super.setName(name);
        setThirst(10.00);
        setAbsorbLevel(0.75);
    }


}
