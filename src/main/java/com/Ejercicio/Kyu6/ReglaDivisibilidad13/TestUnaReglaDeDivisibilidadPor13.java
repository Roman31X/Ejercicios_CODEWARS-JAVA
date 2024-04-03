package com.Ejercicio.Kyu6.ReglaDivisibilidad13;

import static com.Ejercicio.Kyu6.ReglaDivisibilidad13.CalcularReglaDivisibilidadPor13.thirt;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestUnaReglaDeDivisibilidadPor13 {
    public static void main(String[] args) {
        System.out.println("Test Una regla de divisibilidad por 13");
    }

    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: thirt");
        testing(thirt(8529), 79);
        testing(thirt(85299258), 31);
        testing(thirt(5634), 57);
        testing(thirt(1111111111), 71);
        testing(thirt(987654321), 30);
    }
}
