package Extension;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(6, extension.add(2, 4));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(7, extension.maxOfThree(7, 5, 6));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('b'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('U'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bavabava", extension.translate("baba"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("avalavagovopuvus", extension.translate("alagopus"));
    }
}