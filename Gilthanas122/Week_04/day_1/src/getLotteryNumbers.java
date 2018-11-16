import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class getLotteryNumbers {

    public static void main(String[] args) {

        String path = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/lottery.txt";

        getLottery(path);

    }

    private static void getLottery(String path) {

        try {
            Path filePath = Paths.get(path);
            List<String> list = Files.readAllLines(filePath);
            System.out.println(list);

            String listString = "";             // creating a string from list
            for (String s: list) {
                listString += s + "\t";
            }

            List <String> split_list = new ArrayList<>();           // splitting the list to block of lotter numbers
            for (String s: listString.split(";")) {
                split_list.add(s);
            }

            List <String> lotteryNums = new ArrayList<>();

            for (int i = 0; i <split_list.size() ; i++) {           // getting lottery numbers by index
                for (int j = 11; j < 15 ; j++) {
                    lotteryNums.add(split_list.get(j));
                }
            }

            List <Integer> numbers = new ArrayList<>();
            for(String s : lotteryNums) numbers.add(Integer.valueOf(s));        // Stringlist to int list

            List <Integer> occurancesNum = new ArrayList<>();

            for (int i = 1; i <= 90; i++) {

                    numbers.get(i)equals(i);
                }
            }




            }

        catch (IOException e){
            System.out.println("Shit gone wrong");
        }
    }
}
