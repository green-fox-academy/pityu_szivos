import java.util.ArrayList;
import java.util.Arrays;

public class hard_subint {

    public static void main(String[] args) {

        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 10, 12, 31, 41));
        ArrayList<Integer> list_compared = new ArrayList<>();


        int num = 1;
        for (int i = 0; i < list.size(); i++) {
            int newNum = list.get(i);
            while (newNum > 0) {
                for (int j = 0; j < 5; j++) {

                    if (newNum % 10 == num) {
                        list_compared.add(list.get(i));
                        newNum = Math.round(newNum / 10);
                    } else {
                        newNum = Math.round(newNum / 10);
                    }
                }

            }
        }
        System.out.println(list_compared);
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

}
