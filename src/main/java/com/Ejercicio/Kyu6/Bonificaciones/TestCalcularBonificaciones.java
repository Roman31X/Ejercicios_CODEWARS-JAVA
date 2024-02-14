package com.Ejercicio.Kyu6.Bonificaciones;

import org.testng.annotations.Test;
import static com.Ejercicio.Kyu6.Bonificaciones.CalcularBonificaciones.bonus;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class TestCalcularBonificaciones {
    public static void main(String[] args) {
        System.out.println("Test para calcular Bonificaciones de sus empleados");
    }
    private static boolean verif(long[] ls, long s) {
        long t = 0;
        for (int i = 0; i < ls.length; i++)
            t += ls[i];
        return t == s;
    }
    private static void dotest(int[] arr, long s, long[] expect) {
        long[] actual = bonus(arr,  s);
        boolean v = verif(actual, s);
        if (v == false) {
            long t = 0;
            for (int i = 0; i < actual.length; i++)
                t += actual[i];
            System.out.println("The sum of your result is not 's': you got " + t + " instead of " + s);
            assertEquals("The sum of your resulting array is not 'total bonus'", v, true);
        }
        else {assertArrayEquals(expect, actual);}
    }

    @Test
    public void test1() {
        dotest(new int[] {22, 3, 15}, 18228, new long[] {1860, 13640, 2728});
        dotest(new int[] {8, 14, 11}, 23541, new long[] {10241, 5852, 7448});
        dotest(new int[] {8, 20, 17}, 25281, new long[] {13515, 5406, 6360});
    }
}
