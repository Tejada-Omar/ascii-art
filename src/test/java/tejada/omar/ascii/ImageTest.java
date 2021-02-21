package tejada.omar.ascii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageTest {
    @Test
    void defaultConstructorDoesNotThrowException() {
        assertDoesNotThrow(() -> new Image());
    }

    @Test
    void constructorThrowsNullPointerExceptionWhenInvalidPathGiven() {
        assertThrows(NullPointerException.class, () -> new Image("pineapple.txt"));
    }
}