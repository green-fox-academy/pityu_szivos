package GardenApplication;

public class Tree extends Plant {

    public Tree() {
        super( 0.40, "anytree", 20.00);

    }

    public Tree(String name) {
        super.setName(name);
        setThirst(20.00);
        setAbsorbLevel(0.40);
    }
}
