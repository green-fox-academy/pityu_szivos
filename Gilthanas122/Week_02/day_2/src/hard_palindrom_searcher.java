/*import java.util.ArrayList;
import java.util.List;

public class hard_palindrom_searcher {
    public static void main(String[] args) {

        String wort = "reliefpfpfeiller";
        System.out.println(istPalindrom(wort));
    }

    public void istPalindrom(String word) {

        List<Character> listChar = new ArrayList<>();

        for (char a : word.toCharArray()) {
            listChar.add(a);
        }

        int i1 = 0;
        int i2 = listChar.size() - 1;
        while (i2 > i1) {
            if (listChar.get(i1) != listChar.get(i2)) {
                break;
            } else {


                ++i1;
                --i2;
            }
            System.out.println(listChar.subList(i1, i2));
        }
    }
}*/