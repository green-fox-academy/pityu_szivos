import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class practice_printEachLine {

    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("/home/pityu/home/Gilthanas122/Week_04/day_1/src/tryStuff.txt");

            List<String> lines = Files.readAllLines(filePath);

            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i)); // Prints the first line of the file
            }

        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}

// Required by Files.readAllLines(filePath);
// Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
