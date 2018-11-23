package SharpieSet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Sharpie> newSharpieList = new ArrayList<>();   //1. list object category from sharpie.java
        SharpieSet sharpie = new SharpieSet(newSharpieList); //3. sharpie added to the list of sharpies from sharpieset.java
        Sharpie sharpiex = new Sharpie();
        Sharpie blue = new Sharpie("blue", 1.00, 1.00);     //5. new elements added with features inherited from sharpie class
        sharpie.sharpieList.add(blue);                                                                       // 6. stored in the list from  sharpieset

        Sharpie green = new Sharpie("green", 2.00, 2.00);
        sharpie.sharpieList.add(green);

        Sharpie red = new Sharpie("red", 3.00, 3.00);       //7. original list created
        sharpie.sharpieList.add(red);

        Sharpie chosen;                                                 //8.  new empty object with  features from sharpie

        for (int i = newSharpieList.size() - 1; i >= 0; i--) {            //9.. for looped in the list from sharpieset
            chosen = newSharpieList.get(i) ;                            //10.. new item added to the
            newSharpieList.get(i).use();                                //11. added to the new list + inkamount -1
            System.out.println(Arrays.toString(newSharpieList.toArray()));      //12 printed out the proper way
            if (!chosen.empty()) {                                  // 13. no inkamount -> empty from sharpie false
                newSharpieList.remove(i);                           // 14. remove it
                //what you wish to change in a for loop
            }
        }
        System.out.println(Arrays.toString(newSharpieList.toArray()));  // 13. rest printed out


    }
}

