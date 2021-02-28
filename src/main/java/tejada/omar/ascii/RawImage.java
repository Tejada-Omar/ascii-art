package tejada.omar.ascii;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class RawImage {
    private final BufferedImage img;
    private final int[][] brightnessArr;

    public RawImage() throws IOException {
        this("pineapple.jpg");
    }

    public RawImage(String name) throws IOException {
        img = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(name)));
        brightnessArr = makeBrightnessArray(img);
    }

    private int[][] makeBrightnessArray(BufferedImage img) {
        int col = img.getWidth();
        int row = img.getHeight();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = ImageManipulator.calculateBrightness(img.getRGB(j, i));
            }
        }

        return arr;
    }

    public int[][] getBrightnessArray() {
        return brightnessArr;
    }
}