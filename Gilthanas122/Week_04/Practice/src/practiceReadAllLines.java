import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class practiceReadAllLines {
    public static void main(String[] args) {
        String filePath = "/home/pityu/home/Gilthanas122/Week_04/Practice/src/myText.txt";
        Path filePath2 = Paths.get(filePath);
       try{
           List<String> lines = Files.readAllLines(pathIn);
       }catch (Exception e){
           System.out.println("Shit gone wrong");
       }


    }
}


public static void returnIP(String path_in){

        try {
        Path filePath = Paths.get(path_in);

        List<String> list = Files.readAllLines(filePath);
        String listString = "";
