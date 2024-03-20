package com.Ejercicio.Kyu5.PrimosEnNumeros;

import static com.Ejercicio.Kyu5.PrimosEnNumeros.CalcularPrimosEnNumeros.factors;
import static org.junit.Assert.*;
import org.junit.*;

public class TestPrimosEnNumeros {
    public static void main(String[] args) {
        System.out.println("Test Primos en Números");
    }

    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                factors(lst));
    }
}
