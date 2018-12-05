package Hero;

public class MarvelHero extends Hero {

    public MarvelHero(String name, double motivation) {
        super(name, motivation);
    }

    public MarvelHero(String name){
        super(name);
        this.setMotivation(40);
    }
}
