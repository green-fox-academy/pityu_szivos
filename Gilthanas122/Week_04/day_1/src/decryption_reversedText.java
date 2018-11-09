import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class decryption_reversedText {

    public static void main(String[] args) {

        String path = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/reversed_lines.txt";
        reversedLines(path);
    }

    private static void reversedLines(String path) {

        try {
            Path filePath = Paths.get(path);
            List <String> list = Files.readAllLines(filePath);

            List <String> dereversedLinesList = new ArrayList<>();

            for (int i = 0; i <list.size() ; i++) {

                dereversedLinesList.add(list.get(i)); }

                String str = "";

            for (String i: dereversedLinesList) {
                str = str + i;
            }
            System.out.println(str);
        }


        catch (Exception e){
            e.printStackTrace();
        }


    }
}
