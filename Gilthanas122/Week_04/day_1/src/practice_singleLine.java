import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class practice_singleLine {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Pityu");

        try{

            Path filePath = Paths.get("/home/pityu/home/Gilthanas122/Week_04/day_1/src/my_file.txt");
            Files.write(filePath, list);
        }
        catch (Exception e){
            System.out.println("Unable to write file my_file.txt");
        }

    }
}

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"
