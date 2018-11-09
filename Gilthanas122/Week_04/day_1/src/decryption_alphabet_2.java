import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class decryption_alphabet_2 {
    public static void main(String[] args) {

        String path = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/decryption_alphabetNextChar.txt";
        alpbabetChange(path);
    }

    private static void alpbabetChange(String path) {

        try {
            Path filePath = Paths.get(path);
            List<String> list = Files.readAllLines(filePath);
            String listString = "";
            for (String s : list) {
                listString += s + "\t";
            }
            String reversed_text = "";
            for (char c : listString.toCharArray()) {
                reversed_text += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
            }

            System.out.println(reversed_text);
        }
        catch (Exception e){
            System.out.println(" Look, there is Laura Palmer");
        }
    }
}
