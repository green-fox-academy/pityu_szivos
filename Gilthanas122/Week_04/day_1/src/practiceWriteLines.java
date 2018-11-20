import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class practiceWriteLines {
    public static void main(String[] args) {

        List<String> content = new ArrayList();
        content.add("First line of my file");
        int counter = 6;
        try{
            Path filePath = Paths.get("/home/pityu/home/Gilthanas122/Week_04/day_1/src/practiceWriteLines.txt");
            writeInTimes(content, filePath,counter);
        }

        public static void writeInTimes(Path path, int counterIn, contentIn){
        List<String> content = new ArrayList();
        content.add("First line of my file");
        try {
            Path filePath = Paths.get("assets/new-file.txt");
            for (int i = 0; i <4 ; i++) {
                Files.write(filePath, content);
            }

        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}
