import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortThatList {
    public static void main(String[] args) {

        List<Integer> numArray = new ArrayList<>(Arrays.asList(4, 5, 12, 2, 5, 1, 44, 32, 55, 33));

        System.out.println(sortThatList(numArray));
    }

    public static List<Integer> sortThatList(List<Integer> tosort) {

        int temp = 0;
        List<Integer> changedArray = new ArrayList<>();
        for (int i = 0; i < tosort.size(); i++) {
            if (i == 0) {
                changedArray.add(tosort.get(i));

            }else if(i == 1){
                if (tosort.get(i) < changedArray.get(i)){
                    changedArray.add(tosort.get(i));
                }
                else {
                    break;
                }
            }
            else if (tosort.get(tosort.size()-1) < changedArray.get(i)) {
                changedArray.add(tosort.get(i));
            }
            else {
                for (int j = 0; j <changedArray.size() ; j++) {
                    if(changedArray.get(j) <= tosort.get(i)){
                        break;
                    }
                }

            }

        }
        return changedArray;}
}
