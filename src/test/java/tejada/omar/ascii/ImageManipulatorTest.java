package tejada.omar.ascii;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ImageManipulatorTest {
    @Test
    void shouldCalculateBrightnessBasedOnArgbValues() {
        // RGBA: rgba(43, 212, 150, 1)
        // Colour is a mild green
        // Brightness is taken from the average of all rgb values
        int argb = new Color(43, 212, 150, 1).getRGB();
        assertEquals(135, ImageManipulator.calculateBrightness(argb));
    }
}