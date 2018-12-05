import java.util.ArrayList;
import java.util.List;

public class practiceLottery {
    public static void main(String[] args) {
        List<String> numbersString = new ArrayList<>();
        String row = "";
        int[][] frequency = new int[90][2];
        for (int i = 0; i < frequency.length - 1; i++) {
            frequency[i][0] = i + 1;
        }
        System.out.println(numbersString.toString());
    }
}
