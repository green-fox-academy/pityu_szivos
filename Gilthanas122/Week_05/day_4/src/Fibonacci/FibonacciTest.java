package Fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci;
    @BeforeEach
    void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    void checkFibonacciWith1Nums(){
        int num = 1;
        assertEquals(1, fibonacci.fibonacci(num));
    }

    @Test
    void checkFibonacciWith3Nums(){
        int num = 3;
        assertEquals(4, fibonacci.fibonacci(num));
    }

    @Test
    void checkFibonacciWith4Nums(){
        int num = 4;
        assertEquals(4, fibonacci.fibonacci(num));
    }

    @Test
    void checkFibonacciWithNegiveNums(){
        int num = -2;
        assertEquals(-1, fibonacci.fibonacci(num));
    }

}