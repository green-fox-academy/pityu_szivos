package Lottery;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Lottery {

    public static void main(String[] args) {
        mostCommonLotteryNums();
    }
    public static void mostCommonLotteryNums(){

        try{
            Path filePath = Paths.get("/home/pityu/home/Gilthanas122/Week_04/Practice/src/Lottery/lotteryText.txt");
            List<String> lines = Files.readAllLines(filePath);
            HashMap<Integer, Integer> lotteryNumMap = new HashMap<>();
            for (String line: lines) {
                String [] wholeLine = line.split(";");
                int [] lotteryNums = new int [5];
                lotteryNums[0] = Integer.parseInt(wholeLine[11]);
                lotteryNums[1] = Integer.parseInt(wholeLine[12]);
                lotteryNums[2] = Integer.parseInt(wholeLine[13]);
                lotteryNums[3]= Integer.parseInt(wholeLine[14]);
                lotteryNums[4] = Integer.parseInt(wholeLine[15]);
                for (int num: lotteryNums) {
                    if (lotteryNumMap.containsKey(num)){
                        int keyValue = lotteryNumMap.get(num);
                        lotteryNumMap.put(num, keyValue+1);
                    } else {
                        lotteryNumMap.put(num, 1);
                    }
                }
            }
           /* int [] mostOftennums = new int [10];
            for (int key: lotteryNumMap.keySet()) {
                for (int i = 0; i <mostOftennums.length ; i+= 2) {
                    if (mostOftennums[i + 1] < lotteryNumMap.get(key)){
                        int keyValue = lotteryNumMap.get(key);
                        mostOftennums[i] = key;
                        mostOftennums[i + 1] = keyValue;
                        break;
                    }
                }
            }*/
            ArrayList<Integer> mostOftenNums = new ArrayList<Integer>(
                    Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
            for (int key: lotteryNumMap.keySet()) {
                for (int i = 0; i < mostOftenNums.size(); i+= 2) {
                    if (mostOftenNums.get(i + 1) < lotteryNumMap.get(key)){
                        int keyValue = lotteryNumMap.get(key);
                        mostOftenNums.set(i, key);
                        mostOftenNums.set(i + 1, keyValue);
                        break;
                    }else if (mostOftenNums.get(i + 1) == lotteryNumMap.get(key) && mostOftenNums.get(i + 3) < lotteryNumMap.get(key)){
                        int keyValue = lotteryNumMap.get(key);
                        mostOftenNums.set(i + 2, key);
                        mostOftenNums.set(i + 3, keyValue);
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(mostOftenNums.toArray()));
        }catch(Exception e){
            System.out.println(" Something went wrong");
        }
}
}
