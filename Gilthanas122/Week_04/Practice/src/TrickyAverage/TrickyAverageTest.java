package TrickyAverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrickyAverageTest {

    @BeforeEach
    void setUp(){
        TrickyAverage trickyAverage = new TrickyAverage();
    }

    @Test
    void getTrickyAvg() {
    }

    @Test
    void isAverageLargestEvenSmallestOdd6Elements(){
        TrickyAverage trickyAverage = new TrickyAverage();
        int[] myIntArray = {2, 3, 4, 6, 7, 9};
        assertEquals(5,trickyAverage.getTrickyAvg(myIntArray) );
    }

    @Test
    void isAverageLargestEvenSmallestOdd7Elements(){
        TrickyAverage trickyAverage = new TrickyAverage();
        int[] myIntArray = {1, 2, 3, 4, 6, 7, 9, 10};
        assertEquals(4,trickyAverage.getTrickyAvg(myIntArray) );
    }
}