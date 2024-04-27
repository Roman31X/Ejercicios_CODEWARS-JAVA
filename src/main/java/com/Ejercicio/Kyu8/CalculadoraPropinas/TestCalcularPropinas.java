package com.Ejercicio.Kyu8.CalculadoraPropinas;

import org.junit.Test;
import static com.Ejercicio.Kyu8.CalculadoraPropinas.CalcularPropinas.calculateTip;
import static org.junit.Assert.*;

public class TestCalcularPropinas {
    public static void main(String[] args) {
        System.out.println("Test calculadora de propinas");
    }
    @Test
    public void test1() {
        assertEquals(new Integer(2), calculateTip(30d, "poor"));
    }

    @Test
    public void test2() {
        assertEquals(new Integer(4), calculateTip(20d, "Excellent"));
    }

    @Test
    public void test3() {
        assertNull(calculateTip(20d, "hi"));
    }

    @Test
    public void test4() {
        assertEquals(new Integer(17), calculateTip(107.65, "GReat"));
    }
}
