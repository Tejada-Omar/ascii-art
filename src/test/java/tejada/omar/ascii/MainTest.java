package tejada.omar.ascii;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @Test
    void shouldConvertMinBrightnessToDarkestChar() {
        main = new Main();
        int[][] brightnessArr = {{0, 0}, {0, 0}};
        char darkestChar = '$';
        ArrayList<ArrayList<Character>> charArr = main.convertBrightnessArrToAsciiArr(brightnessArr);
        assertEquals(darkestChar, charArr.get(0).get(1));
    }

    @Test
    void shouldConvertMaxBrightnessToLightestChar() {
        main = new Main();
        int[][] brightnessArr = {{255, 255}, {255, 255}};
        char lightestChar = '`';
        ArrayList<ArrayList<Character>> charArr = main.convertBrightnessArrToAsciiArr(brightnessArr);
        assertEquals(lightestChar, charArr.get(1).get(0));
    }

}