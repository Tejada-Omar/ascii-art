package tejada.omar.ascii;

public class ImageManipulator {
    public static int calculateBrightness(int argb) {
        // int a = (argb >> 24) & 0xff;
        // Keeping the a value if neccessary later
        int r = (argb >> 16) & 0xff;
        int g = (argb >> 8) & 0xff;
        int b = argb & 0xff;

        return (r + g + b) / 3;
    }
}
