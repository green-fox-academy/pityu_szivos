import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise1Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 3}, {-1, 2, 3}};
        int[][] matrix2 = {{0, 0, 3}, {-1, 3, 3}};
        getLargestNumbers(matrix1, matrix2);
    }

    public static int[][] getLargestNumbers(int[][] matrixIn1, int[][] matrixIn2) {
        List<Integer> allNumbers = new ArrayList<>();
        for (int i = 0; i < matrixIn1.length; i++) {
            for (int j = 0; j < matrixIn1[0].length; j++) {
                allNumbers.add(matrixIn1[i][j]);
            }
            for (int j = 0; j < matrixIn1[0].length; j++) {
                allNumbers.add(matrixIn2[i][j]);
            }
        }
        Collections.sort(allNumbers);
        int counter = matrixIn1.length * matrixIn1[0].length;
        int [][] sortedArray = new int [matrixIn1.length][matrixIn1[0].length];
        for (int i = 0; i < matrixIn1.length ; i++) {
            for (int j = 0; j <matrixIn1[0].length ; j++) {
                sortedArray[i][j] = allNumbers.get(counter);
                counter++;
            }
        }
        return sortedArray;
    }
}
