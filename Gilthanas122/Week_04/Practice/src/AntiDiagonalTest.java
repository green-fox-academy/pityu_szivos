import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AntiDiagonalTest {

    @BeforeEach
    void setUp() {

    }
    @org.junit.jupiter.api.Test
    void getAntiDiagonal() {
        AntiDiagonal antiDiagonal = new AntiDiagonal();
        int[][] arrayAntiDiagonal2 = new int[][]{
                {1, 2, 3, 4},
                {3, 4, 6, 4},
                {5, 2, 5, 4},
                {1, 2, 3, 4}};
        assertEquals(4.00, antiDiagonal.getAntiDiagonal(arrayAntiDiagonal2));
    }


}