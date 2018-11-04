import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class notes_arraylist_collections {

    public static void main(String[] args) {


        // Array fix size <-> ArrayList -> not fix

        // Collections hold more than one object -> not fixed size, collections cannot use primite types
        // must use an object like Integer, Double
        // <-> array can have int, string, double

        ArrayList <Integer> grade = new ArrayList<>();
        grade.add(90);
        grade.add(85);
        grade.add(71);

        for (int i = 0; i <grade.size() ; i++) {
            System.out.printf("Grade #%d == %d\n",i, grade.get(i));

        }
        grade.remove(1);

        ArrayList arrayListOne;
        arrayListOne = new ArrayList();

        ArrayList array_list_two = new ArrayList();
        ArrayList<String> names = new ArrayList<String>();

        names.add("john smith");
        names.add("jack ryan");
        names.add("maggie smith");

        names.add(2, "Bill Ted"); // add to the index 2



        names.set(0, "John Adams");  // replace a value at index 0

        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));

        }

        names.remove(3);  // remove
       // names.removeRange(0, 3); // removes between these two

        for(String i : names){
            System.out.println(i);
        }

        Iterator individual_items = names.iterator();  //  allows you to iterate through objects ~ for loop

        while(individual_items.hasNext()){

            System.out.println(individual_items.next());  // prints out these names
        }

        ArrayList name_copy = new ArrayList();      // do not have to define what type of objects should contain

        ArrayList name_backup = new ArrayList();

        name_copy.addAll(names);  // copies all the names from 'names' arraylist

        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));

        }

        String paul_young = "Paul young";

        names.add(paul_young);      // adding
        //or

        if(names.contains(paul_young)){             // if it contains paul
            System.out.println("Paul is here");
        }

        if(names.containsAll(name_copy)){               // if names contains everything fom name.copy
            System.out.println("Everythings is name_copy is in names");

        }

        names.clear();      // emptying arrayList
        if(names.isEmpty()){
            System.out.println("Arraylist is empty");
        }

        Object [] more_names = new Object[4];
        more_names = name_copy.toArray();  // copied everything from name_copy to an array

        System.out.println(Arrays.toString(more_names));
    }
}
