package Sprint1.s01_04.lv1.ex2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComputeDNITest {

    @Test
    void testComputeDNI() {
        final int[] numbers = {28764899, 58640329, 10117744, 24714036, 90989534, 18085226, 98190285, 53275485, 4903913, 73053060};
        final char[] letters = "HNKFQGLXZT".toCharArray();

        assertEquals('G', ComputeDNI.computeLetter(18085226));

        for(int i = 0; i < numbers.length; i++) {
            assertEquals(letters[i], ComputeDNI.computeLetter(numbers[i]));
        }
    }
}