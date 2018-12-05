import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortThatList {
    public static void main(String[] args) {
        List<Integer> numArray = new ArrayList<>(Arrays.asList(4, 5, 12, 2, 5, 1, 44, 32, 55, 33));
        System.out.println(sortThatList(numArray));
    }

    public static String sortThatList(List<Integer> tosort) {
        List<Integer> changedArray = new ArrayList<>();
        changedArray.add(tosort.get(0));
        for (int i = 1; i < tosort.size(); i++) {
            for (int j = 1; j <= changedArray.size() ; j++) {
              if (changedArray.get(changedArray.size() -j) <= tosort.get(i) && j == 1){
                    changedArray.add(changedArray.size(),tosort.get(i));
                    break;
                }
              else if(changedArray.get(changedArray.size() -j) < tosort.get(i)){
                  changedArray.add(j + 1,tosort.get(i));
                  break;
              }
            }
            changedArray.add(0, tosort.get(i));
        }
        return Arrays.toString((changedArray.toArray()));
        }
}
