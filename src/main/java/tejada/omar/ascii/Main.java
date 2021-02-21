package tejada.omar.ascii;

import java.util.ArrayList;

public class Main {
    static final String ASCII_CHARS = "`^\\\",:;Il!i~+_-?][}{1)(|\\\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
    static final float MAX_VALUE = 255.0F;

    ArrayList<ArrayList<Character>> convertBrightnessArrToAsciiArr(int[][] brightnessArr) {
        ArrayList<ArrayList<Character>> asciiArr = new ArrayList<>();
        for (int[] row:brightnessArr) {
            ArrayList<Character> asciiRow = new ArrayList<>();
            for (int col:row) {
                try {
                    asciiRow.add(ASCII_CHARS.charAt((int) (Math.ceil(col / MAX_VALUE * ASCII_CHARS.length()) - 1)));
                } catch (StringIndexOutOfBoundsException ex) { // Happens when pure black (0) is in brightnessArr
                    asciiRow.add(ASCII_CHARS.charAt(ASCII_CHARS.length() - 1));
                }
            }
            asciiArr.add(asciiRow);
        }

        return asciiArr;
    }
}
