package countLetters;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class countLettersTest {
    CountLetters countLetters;
    @BeforeEach
    void setUp(){
        countLetters = new CountLetters();
    }

    @Test
    void shouldBeSameMap(){
        Map<Character, Integer> compareList = new HashMap<>();
        compareList.put('a', 1);
        compareList.put('p', 2);
        compareList.put('l', 1);
        compareList.put('e', 1);
        assertEquals(compareList, countLetters.letterCounter("apple"));
    }

}