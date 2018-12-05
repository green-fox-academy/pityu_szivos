package Hero;

public class DCHero extends Hero {

    public DCHero(String name, double motivation) {
        super(name, motivation);
    }

    public DCHero(String name){
        super(name);
        this.setMotivation(45);
    }
}
