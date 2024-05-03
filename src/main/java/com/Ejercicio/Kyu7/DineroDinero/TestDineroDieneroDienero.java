package com.Ejercicio.Kyu7.DineroDinero;

import static com.Ejercicio.Kyu7.DineroDinero.CalcularDinero.calculateYears;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestDineroDieneroDienero {
    public static void main(String[] args) {
        System.out.println("Test Dinero dinero y mas dinero");
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests calculateYears");
        assertEquals(3, calculateYears(1000,0.05,0.18,1100));
        assertEquals(14 , calculateYears(1000,0.01625,0.18,1200));
        assertEquals(0, calculateYears(1000,0.05,0.18,1000));
    }
}
