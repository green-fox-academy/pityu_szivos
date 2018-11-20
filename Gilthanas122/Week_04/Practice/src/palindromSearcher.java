import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palindromSearcher {
    public static void main(String[] args) {

        String string = "dog goat dad duck doodle never";

        System.out.println(palindromSearcherMethod(string));
    }

    public static String palindromSearcherMethod(String stringIn){

        List <Character> listChar = new ArrayList<>();

        for (char a: stringIn.toCharArray()) {
                listChar.add(a);
        }
        for (int i = 0; i <listChar.size() ; i++) {
            for (int j = i + 2; j <listChar.size() -1 ; j++) {
                if (listChar.get(i)== listChar.get(j)){
                    System.out.println(listChar.subList(i, j + 1));
                }
            }
        }
    return stringIn;}

}

