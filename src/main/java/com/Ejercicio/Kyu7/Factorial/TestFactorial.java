package com.Ejercicio.Kyu7.Factorial;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class TestFactorial {
    public static void main(String[] args) {
        System.out.println("Test Factorial");
    }
    private CalcularFactorial fact;

    @Before
    public void initFactorial() {
        fact = new CalcularFactorial();
    }

    @After
    public void afterFactorial() {
        fact = null;
    }

    @Test
    public void test_factorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void test_factorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    public void test_factorial5() {
        assertEquals(120, fact.factorial(5));
    }
}
