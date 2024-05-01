package com.Ejercicio.Kyu6.MasCerosQueUnos;

import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu6.MasCerosQueUnos.CalculeCerosCadena.moreZeros;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestCalcularMasCerosQueUnos {
    public static void main(String[] args) {
        System.out.println("Test Mas ceras que unos");
    }
    @Test
    void basicTests() {
        assertArrayEquals(new char[] {'a','b','d'},
                moreZeros("abcde"));
        assertArrayEquals(new char[] {'h', 'b', 'p', 'a', 'd'},
                moreZeros("thequickbrownfoxjumpsoverthelazydog"));
        assertArrayEquals(new char[] {'T','H','E','Q','I','C','B','R','F','X','J','P','L', 'A','D'},
                moreZeros("THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG"));
        assertArrayEquals(new char[] {'a','b','d','h','p','A','B','C','D','E','F','H','I','J','L','P','Q','R','T','X','0'},
                moreZeros("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_"));
        assertArrayEquals(new char[] {'D', 'I', 'E', 'T'},
                moreZeros("DIGEST"));
    }
}
