package tejada.omar.ascii;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Image {
    private final BufferedImage img;
    int[][] brightnessArr;

    public Image() throws IOException {
        this("pineapple.jpg");
    }

    public Image(String name) throws IOException {
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
}
