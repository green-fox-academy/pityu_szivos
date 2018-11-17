package Pirates;

public class Pirate {


    private int rumCounter;
    private boolean passedOut;
    private boolean dead;
    private int parrot;
    private boolean isCaptain;


    public Pirate() {

        this.passedOut = false;
        this.dead = false;
        this.parrot = (int) (Math.random() * 5) + 1;
        this.isCaptain = false;
    }

    //GETTER-SETTER-ADDER

    public boolean isCaptain() {
        return isCaptain;
    }

    public int getParrot() {
        return parrot;
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
        isCaptain = true;

    }

    //METHODS

    public void drinkSomeRumShip() {
        if (parrot == 1) {
            System.out.println("AARRRRR INTERRUPTION");
        }
        int rumIn = (int) (Math.random() * 7) + 1;
        rumCounter = rumCounter + rumIn;
    }

    public void drinkSomeRum() {
        int rumIn = (int) (Math.random() * 7) + 1;
        rumCounter = rumCounter + rumIn;
        if (parrot == 1) {
            System.out.println("AARRRRR INTERRUPTION");
        }
        if (rumCounter < 5 && !passedOut) {
            System.out.println("Pour me anudder!");
            rumCounter = rumCounter + rumIn;
        } else {
            setPassedOut(true);
            System.out.println(" You just passed out from a large amount of smoked rum");
        }
    }

    public void brawl(Pirate pirate1, Pirate pirate2) {
        int n = (int) (Math.random() * 3) + 1;
        if (parrot == 1) {
            System.out.println("AARRRRR INTERRUPTION");
        }
        if (n == 0) {
            pirate1.setDead(true);
        } else if (n == 1) {
            pirate2.setDead(true);
        } else {
            pirate1.setPassedOut(true);
            pirate2.setPassedOut(true);
        }
    }


}


