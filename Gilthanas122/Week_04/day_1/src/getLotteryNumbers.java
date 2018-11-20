import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class getLotteryNumbers {

    public static void main(String[] args) {

        String pathString = "/home/pityu/home/Gilthanas122/Week_04/day_1/src/lottery.txt";
        Path filePath = Paths.get(pathString);

        getLottery(filePath);

    }

    private static void getLottery(String path) {

        try {
            Path filePath = Paths.get(path);
            List<String> list = Files.readAllLines(filePath);
            System.out.println(list);

            String listString = "";             // creating a string from list
            for (String s : list) {
                listString += s + "\t";
            }

            List<String> split_list = new ArrayList<>();           // splitting the list to block of lotter numbers
            for (String s : listString.split(";")) {
                split_list.add(s);

            }
            System.out.println(Arrays.toString(split_list.toArray()));

            List<String> lotteryNums = new ArrayList<>();

            for (int i = 1; i < split_list.size(); i++) {           // getting lottery numbers by index
                if (i % 12 == 0 || i % 13 == 0 || i % 14 == 0 || i % 15 == 0 || i % 16 == 0)
                    lotteryNums.add(split_list.get(i-1));
            }

            System.out.println(Arrays.toString(lotteryNums.toArray()));

            ArrayList<Map<Integer, Integer>> listOfMaps = new ArrayList<Map<Integer, Integer>>();
        }
           /* Collections.sort(lotteryNums);
            List <String> listCountOccurences = new ArrayList<>();

            for (int i = 0; i <lotteryNums.size() ; i++) {
                if (i == 0){
                    listCountOccurences.add(lotteryNums.get(i));
                }
                else if(list)
            }*/



        // Given this list of hashmaps...




       catch(Exception e){
            System.out.println("Shit gone wrong");
        }
    }
}
