package AnimalsBana;

public class AnimalsMain{

    public static void main(String[] args) {

        Animals genericAnimal = new Animals();
        System.out.println(genericAnimal.favFood);
        System.out.println(genericAnimal.getName());

        Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
        System.out.println(morris.getName());
        System.out.println(morris.favFood);

        Animals tabby = new Cats("Tabby", "Salmon", "Ball");
        AcceptAnimal(tabby);

    }
    public static void AcceptAnimal(Animals randomAnimals){
        System.out.println();
        System.out.println(randomAnimals.getName());
        //System.out.println(randomAnimals.favFood());

        randomAnimals.walkAround();

       // System.out.println(randomAnimals.favToy); -> not good -> no field only in the subclass

        Cats tempCat = (Cats) randomAnimals;

        System.out.println(((Cats)randomAnimals).favToy);  // now it is  good, being casted
    }

}
