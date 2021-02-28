package tejada.omar.ascii;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ImageManipulatorTest {
    /**
     * Dimensions of original pineapple.jpg is 700x467, width / height
     * Originally ratio is 1.4989293361884, but due to rounding
     * it becomes 1.4925373134328
     * This type of program doesn't care about accuracy much, so it checks 1.49
     */
    @Test
    void shouldScaleWithoutLosingRatio() throws IOException {
        RawImage img = new RawImage();
        String ratioTruncated = "1.49";
        assertEquals(ratioTruncated, String.format("%.3g", img.getAspectSize()));
    }

    /**
     * RGBA: rgba(43, 212, 150, 1)
     * Colour is a mild green
     * Brightness is taken from average of all rgb values
     */
    @Test
    void shouldCalculateBrightnessBasedOnArgbValues() {
        int argb = new Color(43, 212, 150, 1).getRGB();
        assertEquals(135, ImageManipulator.calculateBrightness(argb));
    }
}