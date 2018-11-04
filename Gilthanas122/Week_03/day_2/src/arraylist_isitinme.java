import java.util.ArrayList;
import java.util.Arrays;

public class arraylist_isitinme {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
    }

    public static ArrayList checkNums( ArrayList <Integer> in_list){
           if (in_list.contains(4) && in_list.contains(8) && in_list.contains(12) && in_list.contains(16)) {

               System.out.println(true);
           }
           else{
               System.out.println(false);
           }
           return in_list;
       }
    }


//  int myInt = myBoolean ? 1 : 0
