package com.Ejercicio.Kyu6.OlaMexico;

import static com.Ejercicio.Kyu6.OlaMexico.OlaMexicana.wave;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.Arrays;


public class TestOlaMexicana {
    public static void main(String[] args) {
        System.out.println("Test Ola Mexicana");
    }

    @Test
    public void basicTest1() {
        String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, wave("hello"));
    }

    @Test
    public void basicTest2() {
        String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, wave("codewars"));
    }

    @Test
    public void basicTest3() {
        String[] result = new String[] { };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, wave(""));
    }

    @Test
    public void basicTest4() {
        String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, wave("two words"));
    }

    @Test
    public void basicTest5() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, wave(" gap "));
    }

}
