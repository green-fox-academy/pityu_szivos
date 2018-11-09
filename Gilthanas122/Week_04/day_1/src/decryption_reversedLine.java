import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class decryption_reversedLine {
    public static void main(String[] args) {

        String path = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/reversed_line.txt";
        reversedLine(path);


    }

    private static void reversedLine(String path) {
        try {
            Path filePath = Paths.get(path);
            List<String> reversedList = Files.readAllLines(filePath);

         List<Character> dereversedList =new ArrayList<>();

            String empty = "";
            for (String str: reversedList) {
                for (int j = 0; j <str.length() ; j++) {
                    dereversedList.add(str.charAt(str.length() - j -1));
                }
            }

            String dereversed_string = "";
            for (int i = 0; i <dereversedList.size() ; i++) {
                dereversed_string = dereversed_string + dereversedList.get(i);

            }
            System.out.println(dereversed_string);
        }
        catch (IOException e){
            System.out.println("Stuff not working");
        }

    }
}
