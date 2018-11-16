package Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animalList = new ArrayList<Animal>();

    public void breed(int freePlaces, Animal name) {
        if (freePlaces > 0) {
            animalList.add(name);
        }
    }

    public void slaughter() {
        int toSlaughter = 0;
        int indexOf = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).hunger > toSlaughter) {
                toSlaughter = animalList.get(i).hunger;
                indexOf = i;
            }
        }
        animalList.remove(indexOf);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "animalList=" + animalList +
                '}';
    }
}












/*private int sum(int x, int y){
this.x=x;
this.y=y;
return x+y;

}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }*/

