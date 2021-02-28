package tejada.omar.ascii;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RawImageTest {
    @Test
    void defaultConstructorDoesNotThrowException() {
        assertDoesNotThrow(() -> new RawImage());
    }

    @Test
    void constructorThrowsIOExceptionWhenInvalidPathGiven() {
        assertThrows(IOException.class, () -> new RawImage("pineapple.txt"));
    }
}