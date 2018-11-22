package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    List<Integer> listNumbers;
    Sum sum = new Sum();

    @BeforeEach
    void setUp(){
        Sum sum = new Sum();
    }

    @Test
    void shouldAddListElements(){
        listNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(15, sum.getSum(listNumbers));
    }
    @Test
    void shouldAddListOneElements(){
        listNumbers = new ArrayList<>(Arrays.asList(1));
        assertEquals(15, sum.getSum(listNumbers));
    }
    @Test
    void shouldAddListZeroElements(){
        listNumbers = new ArrayList<>(Arrays.asList(0));
        assertEquals(0, sum.sumList(listNumbers));
    }
    @Test
    void shouldAddListEmptyElements(){
        listNumbers = new ArrayList<>(Arrays.asList());
        assertEquals(null, sum.sumList(listNumbers));
    }
}