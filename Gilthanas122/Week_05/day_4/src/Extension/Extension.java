package Extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else
            return c;
    }

    int median(List<Integer> pool) {
        Collections.sort(pool);
        return pool.get((pool.size() - 1) / 2);
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
    }

    String translate(String hungarian) {
        List<Character> charList = new ArrayList<>();
        List<Character> charList2 = new ArrayList<>();
        for (int i = 0; i < hungarian.length(); i++) {
            charList.add(hungarian.charAt(i));
        }
        for (int i = 0; i < charList.size(); i++) {
            if (isVowel(charList.get(i)) && i == 0) {
                charList2.add(charList.get(i));
                charList2.add('v');
                charList2.add(charList.get(i));
                charList2.add(charList.get(i));
            } else if (isVowel(charList.get(i))) {
                charList2.add(charList.get(i - 1));
                charList2.add(charList.get(i));
                charList2.add('v');
            } else if (i == charList.size() - 1) {
                charList2.add(charList.get(i));
            }
        }
        String str = charList2.stream().map(e -> e.toString()).reduce((acc, e) -> acc + e).get();
        return str;
    }

}
