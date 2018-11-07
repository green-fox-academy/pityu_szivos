import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class hard_subInt_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 10, 12, 31, 41));
        int num = 1;
        String numString = Integer.toString(num);

        ArrayList <String> list_string = new ArrayList<>();

        ArrayList <String> checked_list = new ArrayList<>();

        for (Integer i: list){
            list_string.add(String.valueOf(i));
        }
        for (String m : list_string) {
            if (m.contains(numString)){
                checked_list.add(m);
            }
        }

        System.out.println(checked_list);
    }
}
