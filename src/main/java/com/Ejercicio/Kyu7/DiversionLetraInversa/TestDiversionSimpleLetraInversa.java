package com.Ejercicio.Kyu7.DiversionLetraInversa;

import org.junit.Test;
import static com.Ejercicio.Kyu7.DiversionLetraInversa.DiversionSimpleLetraInversa.reverseLetter;
import static org.junit.Assert.assertEquals;

public class TestDiversionSimpleLetraInversa {
    public static void main(String[] args) {
        System.out.println("Test Diversión simple #176: Letra inversa");
    }


    @Test
    public void testSomething() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, reverseLetter(str));
    }
}
