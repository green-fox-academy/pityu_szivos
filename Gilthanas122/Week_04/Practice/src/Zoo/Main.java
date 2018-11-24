package Zoo;

public class Main {
    public static void main(String[] args) {
        Reptile joe = new Reptile("Jack", 120, "male");
        Mammal moe = new Mammal("Moey", 300, "female");

        joe.breed();
        joe.getName();
        moe.breed();
        moe.getName();
    }
}
