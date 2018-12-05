import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flavius {
    public static void main(String[] args) {
        int size = 12;
        int counter = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(counter);
            counter++;
        }
        int position = 0;
         if (list.size() % 2 == 0){
             while (list.size() > 1){
                 for (int i = position; i <list.size() / 2 ; i++) {
                     list.remove(i+1);
                 }
             }
         } else{
             while (list.size() > 1){
                 for (int i = position; i <list.size() / 2 +1 ; i++) {
                     list.remove(i+1);
                 }
             }

         }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
