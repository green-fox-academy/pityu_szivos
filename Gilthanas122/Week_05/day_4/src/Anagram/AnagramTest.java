package Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram anagram;
    @BeforeEach
    void setUp(){
        anagram = new Anagram();
    }

    @Test
    void shouldBeAnagram(){
        String one = "dgo";
        String two = "god";
    assertTrue(anagram.anagram(one, two));

    }@Test
    void shouldNotBeAnagram(){
        String one = "dog";
        String two = "gog";
    assertFalse(anagram.anagram(one, two));
    }
    @Test
    void shouldNotBeAnagramDifferentLength(){
        String one = "dogg";
        String two = "gog";
        assertTrue(anagram.anagram(one, two));
    }

}