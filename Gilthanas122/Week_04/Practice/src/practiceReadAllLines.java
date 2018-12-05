import java.io.File;
import java.io.SyncFailedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class practiceReadAllLines {
    public static void main(String[] args) {
        String filePath = "/home/pityu/home/Gilthanas122/Week_04/Practice/src/myText.txt";
        Path path = Paths.get(filePath);
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println(Arrays.toString(lines.toArray()));
        } catch (Exception e) {
            System.out.println(" NO WAY, could not read the file");
        }

    }
}
