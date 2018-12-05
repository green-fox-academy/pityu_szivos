package EndWithS;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EndsWithS {
    public static void main(String[] args) {
        String fileName = "base.txt";
       endsWithS(fileName);
    }

    public static void endsWithS(String fileNameIn) {
        Path filePath = Paths.get("/home/pityu/home/Gilthanas122/Week_04/Practice/src/EndWithS/" + fileNameIn);
        try {
            List<String> lines = Files.readAllLines(filePath);
            String linesString = "";
            for (String s : lines) {
                linesString += s;
            }
            int counterS = 0;
            List<String> splittedList = Arrays.asList(linesString.split(" "));
            for (String str : splittedList) {
                if (str.charAt(str.length() - 1) == 's') {
                    counterS++;
                }
                else if (str.charAt(str.length() - 1) == ';' ||str.charAt(str.length() - 1) == ':' ||str.charAt(str.length() - 1) == ',' || str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '!' || str.charAt(str.length() - 1) == '?'){
                    if (str.charAt(str.length() - 2) == 's'){
                        counterS++;
                    }
                }
            }
            System.out.println(counterS);

        } catch (Exception e) {
            System.out.println(" No such file could be found!");
        }
        /**
         * Create a method called `endsWithS` that takes a filename as a string
         * and returns the number of the words, that ends with 's'.
         *
         * Example cases:
         *
         * the correct output for the 'base.txt' is: 26
         * hint: Keep in mind that there may punctuation marks at the end of the words
         */
    }
}
