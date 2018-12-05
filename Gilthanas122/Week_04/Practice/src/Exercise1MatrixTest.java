import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise1MatrixTest {
    @org.junit.jupiter.api.Test
    void shouldGetLargestNumbersSize3() {
        Exercise1Matrix exercise1Matrix = new Exercise1Matrix();
        int[][] matrix1 = {{1, 1, 3}, {-1, 2, 3}};
        int[][] matrix2 = {{0, 0, 0}, {-1, 5, 3}};
        int[][] checkSolution = {{1, 2, 3}, {3, 3, 5}};
        assertTrue(checkSolution ==  exercise1Matrix.getLargestNumbers(matrix1, matrix2));
    }

    @org.junit.jupiter.api.Test
    void shouldGetLargestNumbersSize2() {
        Exercise1Matrix exercise1Matrix = new Exercise1Matrix();
        int[][] matrix1 = {{1, 1}, {-1, 2}};
        int[][] matrix2 = {{0, 0}, {-1, 5}};
        int[][] checkSolution = {{1, 1}, {2, 5}};
        assertEquals(checkSolution, exercise1Matrix.getLargestNumbers(matrix1, matrix2));
    }
}