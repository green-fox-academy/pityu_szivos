package Zoo;

public class Main {
    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("How do you breed?");
       reptile.breed();
       mammal.breed();
       bird.breed();
    }
}
