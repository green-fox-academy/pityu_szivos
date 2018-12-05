package Zoo;

public class Main {
    public static void main(String[] args) {
        Reptile joe = new Reptile("Joe the Crocodile");
        Mammal nick = new Mammal("Nick the beaver");
        Bird bird = new Bird("Eagle Todd");

        System.out.println("How do you breed?");
        System.out.println("A " + joe.getName() + " is breeding by " + joe.breed());
        System.out.println("A " + nick.getName() + " is breeding by " + nick.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    }
}
