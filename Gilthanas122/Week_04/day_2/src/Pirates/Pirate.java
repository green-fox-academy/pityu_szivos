package Pirates;

public class Pirate {

    private int rumCounter;
    private boolean passedOut;
    private boolean dead;
    private boolean Captain;

    public Pirate() {

        this.passedOut = false;
        this.dead = false;
        this.Captain = false;
    }

    public boolean Captain() {
        return Captain;
    }

    public int getParrot() {
        int parrot = (int) ((Math.random() * 7) + 1);
        if (parrot == 1) {
            System.out.println("AARRRR INTERRRRUPTION!");
            return parrot;
        } else {
            return parrot;
        }
    }

    public int getRumCounter() {
        return rumCounter;
    }

    public boolean isPassedOut() {
        return passedOut;
    }

    public void setPassedOut(boolean passedOut) {
        this.passedOut = passedOut;
    }


    public void setDead(boolean dieDieDie) {
        dead = dieDieDie;
    }

    public void setCaptain() {
        Captain = true;

    }

    public boolean isDead() {
        return dead;
    }

    public void drinkSomeRumShip() {
        this.getParrot();
        int rumIn = (int) (Math.random() * 7) + 1;
        rumCounter = rumCounter + rumIn;
    }

    public void drinkSomeRum() {
        int rumIn = (int) (Math.random() * 7) + 1;
       this.rumCounter = rumCounter + rumIn;
        this.getParrot();
        if (rumCounter < 5 && !passedOut) {
            System.out.println("Pour me anudder!");
            rumCounter = rumCounter + rumIn;
        } else {
            setPassedOut(true);
            System.out.println(" You just passed out from a large amount of smoked rum");
        }
    }

   public void brawl(Pirate pirate) {
        int n = (int) (Math.random() * 3) + 1;
        this.getParrot();
        if (n == 0 && !this.isDead()) {
            this.setDead(true);
        } else if (n == 1 && !pirate.isDead()) {
            pirate.setDead(true);
        } else {
            this.setPassedOut(true);
            pirate.setPassedOut(true);
        }
    }
}
