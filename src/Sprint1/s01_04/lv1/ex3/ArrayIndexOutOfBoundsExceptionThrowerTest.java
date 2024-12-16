package Sprint1.s01_04.lv1.ex3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArrayIndexOutOfBoundsExceptionThrowerTest {
    @Test
    void exceptionTesting() {
        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayIndexOutOfBoundsExceptionThrower.thrower(true));
    }
}