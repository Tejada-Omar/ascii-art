package tejada.omar.ascii;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        
        RawImage img = null;
        switch (args.length) {
            case 0:
                img = new RawImage();
                break;
            case 1:
                System.out.println(System.getProperty("user.home") + args[0]);
                img = new RawImage(args[0]);
                break;
            default:
                System.out.println("Too many arguments given...");
                System.exit(-1);
        }

        System.out.print(main.getStringRepOfAsciiArr(main.convertBrightnessArrToAsciiArr(img.getBrightnessArray())));
    }

    String getStringRepOfAsciiArr(ArrayList<ArrayList<Character>> asciiArr) {
        StringBuilder str = new StringBuilder();
        for (ArrayList<Character> row:asciiArr) {
            for (char col:row) {
                str.append(col);
                str.append(col);
            }
            str.append("\n");
        }

        return str.toString();
    }

    static final String ASCII_CHARS = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\\\"^`'. ";
    static final float MAX_VALUE = 255.0F;

    ArrayList<ArrayList<Character>> convertBrightnessArrToAsciiArr(int[][] brightnessArr) {
        ArrayList<ArrayList<Character>> asciiArr = new ArrayList<>();
        for (int[] row:brightnessArr) {
            ArrayList<Character> asciiRow = new ArrayList<>();
            for (int col:row) {
                try {
                    asciiRow.add(ASCII_CHARS.charAt((int) (col / MAX_VALUE * ASCII_CHARS.length() - 1)));
                } catch (StringIndexOutOfBoundsException ex) { // Happens when value is close to boundaries (0-255)
                    if (col < 10) {
                        asciiRow.add(ASCII_CHARS.charAt(0));
                    } else {
                        asciiRow.add(ASCII_CHARS.charAt(ASCII_CHARS.length() - 1));
                    }
                }
            }
            asciiArr.add(asciiRow);
        }

        return asciiArr;
    }
}
