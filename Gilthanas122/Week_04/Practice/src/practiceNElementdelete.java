import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practiceNElementdelete {
    public static void main(String[] args) {

        int[] arrayInt = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
        Arrays.sort(arrayInt);
        Arrays.asList(arrayInt);
        List <Integer> listSorted = new ArrayList<>();
        System.out.println(Arrays.toString(arrayInt));

        int counter = 0;
        boolean isIn = false;
        for (int i = 0; i < arrayInt.length ; i++) {
            if (i == 0){
                listSorted.add(arrayInt[i]);
            }else if(arrayInt[i - 1] != arrayInt[i]){
                listSorted.add(arrayInt[i]);
            }
        }
        System.out.println(Arrays.toString(listSorted.toArray()));
    }
}
