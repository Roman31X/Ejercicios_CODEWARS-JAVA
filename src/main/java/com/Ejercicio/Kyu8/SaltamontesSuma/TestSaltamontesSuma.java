package com.Ejercicio.Kyu8.SaltamontesSuma;

import java.util.Random;

import static com.Ejercicio.Kyu8.SaltamontesSuma.CalcularSuma.summation;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSaltamontesSuma {
    public static void main(String[] args) {
        System.out.println("Test de Satamontes suma");
    }
    @Test
    public void test1() {
        assertEquals(1,
                summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                summation(8));
    }
}
