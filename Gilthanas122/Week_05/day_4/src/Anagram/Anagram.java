package Anagram;

import java.util.Arrays;

public class Anagram {

    public boolean anagram(String first, String second) {

        boolean anagram = false;
        if (first.length() == second.length()) {
            char[] firstArray = first.toCharArray();
            Arrays.sort(firstArray);
            char[] secondArray = second.toCharArray();
            Arrays.sort(secondArray);
            if (firstArray.equals(secondArray)) {
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
}

