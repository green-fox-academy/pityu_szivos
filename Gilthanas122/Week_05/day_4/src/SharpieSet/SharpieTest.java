package SharpieSet;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SharpieTest {
    Sharpie sharpie2;
    @BeforeEach
    void setUP(){
        sharpie2 = new Sharpie();}


    @Test
    void shouldDecreaseInkAmount(){

        assertEquals(1, sharpie2.use());
    }

}