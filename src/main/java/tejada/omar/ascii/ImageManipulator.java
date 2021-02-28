package tejada.omar.ascii;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageManipulator {
    public static BufferedImage resizeImage(BufferedImage image, int newWidth, int newHeight) throws IOException {
        double scale = getImageScale(image, newWidth, newHeight);
        int scaledWidth = Math.toIntExact(Math.round(image.getWidth() * scale));
        int scaledHeight = Math.toIntExact(Math.round(image.getHeight() * scale));

        Image resizedImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_ARGB);
        outputImage.getGraphics().drawImage(resizedImage, 0, 0, null);

        return outputImage;
    }

    private static double getImageScale(BufferedImage image, int newWidth, int newHeight) {
        double scalex = (double) newWidth / image.getWidth();
        double scaley = (double) newHeight / image.getHeight();

        return Math.min(scalex, scaley);
    }

    public static int calculateBrightness(int argb) {
        // int a = (argb >> 24) & 0xff;
        // Keeping the a value if neccessary later
        int r = (argb >> 16) & 0xff;
        int g = (argb >> 8) & 0xff;
        int b = argb & 0xff;

        return (r + g + b) / 3;
    }
}
