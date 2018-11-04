import java.util.ArrayList;
import java.util.Arrays;


public class arraylist_append_letter {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("bo", "anacond", "koal", "pand", "zebr"));

        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static ArrayList appendA(ArrayList <String> add_a){
        ArrayList <String> appended_list = new ArrayList<>();

        for (int i = 0; i <add_a.size() ; i++) {

            appended_list.add(i, (add_a.get(i) + "a") );
        }
        return appended_list;

    }


    }
