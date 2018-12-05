package Hero2;

public class Hero extends BaseHero implements Punchable {
    private double motivation;

    public Hero(String name, double motivation) {
        super(name);
        this.motivation = motivation;
    }

    @Override
    public void punch(Punchable other) {
        if (this.motivation >= 1) {
            double damage = this.getMotivation() / 1.5;
            other.bePunched(damage);
        }
    }

    @Override
    public int getMotivationLevel() {
        if (motivation < 25) {
            return 0;
        } else if ( motivation <40) {
            return 1;
        }
        return 2;
    }

    @Override
    public void bePunched(double damage) {
        this.motivation -= damage / this.motivation;
        motivation = motivation - damage;
    }

    public double getMotivation() {
        return motivation;
    }

    public void setMotivation(double motivation) {
        this.motivation = motivation;
    }

    @Override
    public String toString() {
        if ((getMotivationLevel() == 0)) {
            return this.getName() + "is not motivated anymore";
        } else if (getMotivationLevel() == 1) {
            return this.getName() + "is motivated";
        }
        return this.getName() + " is motivated anymore enough";
    }
}