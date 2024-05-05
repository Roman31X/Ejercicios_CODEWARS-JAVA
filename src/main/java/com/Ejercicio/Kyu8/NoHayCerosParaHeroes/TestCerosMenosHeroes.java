package com.Ejercicio.Kyu8.NoHayCerosParaHeroes;

import static com.Ejercicio.Kyu8.NoHayCerosParaHeroes.QuitarUltimosCerosNumeros.noBoringZeros;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCerosMenosHeroes {
    public static void main(String[] args) {
        System.out.println("Test no jay ceros para los héroes");
    }

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: noBoringZeros");
        testing(noBoringZeros(1450), 145);
        testing(noBoringZeros(960000), 96);
        testing(noBoringZeros(1050), 105);
        testing(noBoringZeros(-1050), -105);
    }
}
