package com.Ejercicio.Kyu6.ContadoDuplicados;

import org.junit.Test;

import static com.Ejercicio.Kyu6.ContadoDuplicados.CalcularDuplicadosCaracteres.duplicateCount;
import static org.junit.Assert.assertEquals;

public class TestContadorDuplicados {
    public static void main(String[] args) {
        System.out.println("Test contador de caracteres duplicados");
    }
    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;

        assertEquals(3, duplicateCount(test));
    }

}
