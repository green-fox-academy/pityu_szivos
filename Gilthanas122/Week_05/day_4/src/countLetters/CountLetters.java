package countLetters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountLetters {
    public static void main(String[] args) {
        letterCounter("aaafffaafb");
    }

    public static Map<Character, Integer> letterCounter(String input) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arrayChar = input.toCharArray();
        for (char a : arrayChar) {
            if (map.containsKey(a)) {
              //int count = map.containsKey(a) ? map.get(a) : 0;
                int count = map.get(a);
                map.put(a, count +1);
            } else {
                map.put(a, 1);
            }
        }
        return map;
    }

}
