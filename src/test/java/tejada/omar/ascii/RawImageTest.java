package tejada.omar.ascii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RawImageTest {
    @Test
    void defaultConstructorDoesNotThrowException() {
        assertDoesNotThrow(() -> new RawImage());
    }

    @Test
    void constructorThrowsNullPointerExceptionWhenInvalidPathGiven() {
        assertThrows(NullPointerException.class, () -> new RawImage("pineapple.txt"));
    }
}