import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class core_copyFile {

    public static void main(String[] args) {

        String path2 = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/tryStuff.txt";
        String path1 = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/my_file.txt";

        copyInTo(path1, path2);
    }

    public static void copyInTo(String path1_in, String path2_in) {


        try {
            Path input_1 = Paths.get(path1_in);
            Path input_2 = Paths.get(path2_in);
            List <String> list = Files.readAllLines(input_1);
            for (String lines: list) {
                Files.write(input_2, list);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
