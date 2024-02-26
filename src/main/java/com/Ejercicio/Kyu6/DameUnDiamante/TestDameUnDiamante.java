package com.Ejercicio.Kyu6.DameUnDiamante;

import org.junit.Test;

import static com.Ejercicio.Kyu6.DameUnDiamante.GenerarDiamanteString.print;
import static org.junit.Assert.assertEquals;

public class TestDameUnDiamante {
    public static void main(String[] args) {
        System.out.println("Test Sencillo de Dame un Diamante");
    }

    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), print(5));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        assertEquals(expected.toString(), print(1));
    }

    @Test
    public void testDiamond0() {
        assertEquals(null, print(0));
    }

    @Test
    public void testDiamondMinus2() {
        assertEquals(null, print(-2));
    }

    @Test
    public void testDiamond2() {
        assertEquals(null, print(2));
    }
}
