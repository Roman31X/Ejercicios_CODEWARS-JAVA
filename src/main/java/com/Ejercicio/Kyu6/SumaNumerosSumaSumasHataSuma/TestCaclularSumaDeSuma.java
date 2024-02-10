package com.Ejercicio.Kyu6.SumaNumerosSumaSumasHataSuma;

import org.testng.annotations.Test;

import java.math.BigInteger;

import static com.Ejercicio.Kyu6.SumaNumerosSumaSumasHataSuma.CalcularSumaMasSuma.sumaSuma;
import static junit.framework.TestCase.assertEquals;

public class TestCaclularSumaDeSuma {
    public static void main(String[] args) {
        System.out.println("Test Sumar los números, sumar las sumas y sumar los números hasta esa suma");
        System.out.println("Número [3] : "+sumaSuma(3));
        System.out.println("Número [5] : "+sumaSuma(5));
        System.out.println("Número [100] : "+sumaSuma(100));
    }
    /*@Test
    void exampleTests() {
        // assertEquals("expected", "actual");
        assertEquals(new BigInteger("55"),sumaSuma(3));
        assertEquals(new BigInteger("630"),sumaSuma(5));
        assertEquals(new BigInteger("14740530850"),sumaSuma(100));
    }*/
}
