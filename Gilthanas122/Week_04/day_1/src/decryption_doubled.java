import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class decryption_doubled {

    public static void main(String[] args) {

        String path = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/doubled.txt";
        removeDouble(path);
    }

    private static void removeDouble(String pathIn) {

        try {
            Path filePath = Paths.get(pathIn);
            List<String> list = Files.readAllLines(filePath);
            String listString = "";

            for (String s : list)
            {
                listString += s + "\t";
            }
            int string_length = listString.length();

            char[] chars = list.toString().toCharArray();

            List <Character> chars_compared = new ArrayList<>();


            for (int i = 0; i < string_length; i++) {       // if boolean is true, loops runs through if i =current
                if (chars[i] != chars[i +1]) {
                    chars_compared.add(chars[i]);
                }

                }
                String notDouble = "";
            for (char i: chars_compared){
                notDouble += i;
            }

            System.out.println(notDouble);

        }
        catch (Exception e){
            System.out.println("Stuff has gone wrong");
        }


    }
}
