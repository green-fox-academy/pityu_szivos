package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
    Apples appleTest = new Apples();

    @Test
    void shouldGetApple(){
        assertEquals("apple", appleTest.getApple());
    }
}