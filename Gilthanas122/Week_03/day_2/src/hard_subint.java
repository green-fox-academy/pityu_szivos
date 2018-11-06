/*import java.util.ArrayList;
import java.util.Arrays;

public class hard_subint {

    public static void main(String[] args) {

        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 10, 12));
        int num = 1;
        System.out.println(subInt(list, num));
                //  Example:
       // System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
       // System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    static public ArrayList subInt(ArrayList <Integer> array, int number){
        ArrayList<Integer> new_list = new ArrayList<>();

        for (int n: array) {
            if(array.get(n) == number){
                new_list.add(array.indexOf(n));
            }
        }

        return new_list;

    }

} */
