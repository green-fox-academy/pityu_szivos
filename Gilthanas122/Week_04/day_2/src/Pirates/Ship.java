package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private int crew;
    private int aliveMembers;

    List<Pirate> crewList = new ArrayList<>();

    public Ship() {
        this.crew = (int) (Math.random() * 10) + 2;
        this.aliveMembers = crew;

    }


    public void fillShip(){
        Pirate pirate2 = new Pirate();
        if (pirate2.getParrot() == 1){
            System.out.println("AARRRRR INTERRUPTION");
        }
        for (int i = 0; i <crew ; i++) {
            Pirate pirate = new Pirate();
            if (i == 0){
                pirate.drinkSomeRumShip();
                crewList.add(pirate);
                pirate.setCaptain();
            }
            else {
                pirate.drinkSomeRumShip();
                crewList.add(pirate);
            }
        }
    }

    public void printOutElement(){
        Pirate pirate2 = new Pirate();
        if (pirate2.getParrot() == 1){
            System.out.println("AARRRRR INTERRUPTION");
        }
        for (Pirate pirate: crewList) {
            if (pirate.isCaptain() == true){
                System.out.printf("This is the captain.%n Is  he awake: " + pirate.isPassedOut() + "%n He drunk some " + pirate.getRumCounter() + " rum %n");
            }
            else {
                aliveMembers++;
            }

        }
        System.out.println("Crew alive: " + aliveMembers);
    }

  public boolean battle(Ship otherShip){

      Pirate pirate2 = new Pirate();
      if (pirate2.getParrot() == 1){
          System.out.println("AARRRRR INTERRUPTION");
      }
      if (this.crewList.size() - this.crewList.get(0).getRumCounter() > crewList.size()- crewList.get(0).getRumCounter()){
          System.out.println("true");
          for (Pirate pirate: this.crewList) {
              pirate.drinkSomeRumShip();
          }
          for (Pirate pirate: otherShip.crewList) {
              int randomDeath = (int) (Math.random() * 10);
              if (randomDeath > 5){
                  pirate.setDead(true);
                  aliveMembers--;
              }
          }
          System.out.println("Ship1 has won!");
          return true;
      }
      else if(this.crewList.size() - this.crewList.get(0).getRumCounter() > crewList.size() - crewList.get(0).getRumCounter()){
          System.out.println("The two ships could not beat each other");

          return true;
      }
      else{
          System.out.println("Ship2 has won");

          for (Pirate pirate: otherShip.crewList) {
              pirate.drinkSomeRumShip();
          }
          for (Pirate pirate: this.crewList) {
              int randomDeath = (int) (Math.random() * 10);
              if (randomDeath > 5){
                  pirate.setDead(true);
                  aliveMembers--;
              }
          }
          return false;
      }

    }

    @Override
    public String toString() {
        Pirate pirate2 = new Pirate();
        if (pirate2.getParrot() == 1){
            System.out.println("AARRRRR INTERRUPTION");
        }
        return ("CrewListt=" + crewList);
    }





}
