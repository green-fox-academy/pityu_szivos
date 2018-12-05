package Hero;

public class Hero extends BaseHero implements Punchable {
    private double motivation;

    public Hero(String name){
        super(name);
        motivation = 40.00;
    }

    public Hero(String name, double motivation) {
        super(name);
        this.motivation = motivation;
    }

    @Override
    public int getMotivationLevel() {
        if (this.getMotivation() < 25) {
            return 0;
        } else if (this.getMotivation() < 40 && this.getMotivation() > 25) {
            return 1;
        }
        return 2;
    }

    @Override
    public void punch(Hero hero) {
        if (this.getMotivation() > 1) {
            hero.setMotivation(hero.getMotivation() - (this.getMotivation() * 1.5));
        }
    }

    @Override
    public void bePunched(double damage) {
        this.motivation = this.motivation - (damage / motivation);
    }

    public double getMotivation() {
        return motivation;
    }

    public void setMotivation(double motivation) {
        this.motivation = motivation;
    }


    @Override
    public String toString() {
        if (this.getMotivationLevel() == 0){
            return this.getName() + " is not motivated anymore";
        } else if(this.getMotivationLevel() == 1){
            return this.getName() + " is motivated";
        }
        return this.getName() + "is well motivated";
    }
}
