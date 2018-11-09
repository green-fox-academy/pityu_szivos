import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class practice_countLines {

    public static void main(String[] args) {


        try {
            Path filePath = Paths.get("/home/pityu/home/Gilthanas122/Week_04/day_1/src/tryStuff.txt");
            List<String> lines = Files.readAllLines(filePath);

            int counter = 0;
            for (int i = 0; i < lines.size(); i++) {
                counter++;
            }
            System.out.println(counter);
        } catch (Exception e) {
            System.out.println("could not find file");
        }
    }
}

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
