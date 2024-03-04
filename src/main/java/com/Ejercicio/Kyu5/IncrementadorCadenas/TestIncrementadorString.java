package com.Ejercicio.Kyu5.IncrementadorCadenas;
import org.junit.Test;

import static com.Ejercicio.Kyu5.IncrementadorCadenas.IncrementadordeString.incrementString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
public class TestIncrementadorString {
    public static void main(String[] args) {
        System.out.println("Test Incrementador de String");
    }
    private static void doTest(String str, String expected) {
        String actual = assertDoesNotThrow(() -> incrementString(str), "Solution thrown an unexpected exception for str=\"" + str + "\"\n\n");
        assertEquals(expected, actual, "Incorrect answer for str=\"" + str + "\"\n\n");
    }


    @Test
    public void exampleTests() {
        doTest("foobar000", "foobar001");
        doTest("foo", "foo1");
        doTest("foobar001", "foobar002");
        doTest("foobar99", "foobar100");
        doTest("foobar099", "foobar100");
        doTest("", "1");
    }
}
