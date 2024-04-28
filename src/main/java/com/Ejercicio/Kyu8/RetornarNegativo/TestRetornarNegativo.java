package com.Ejercicio.Kyu8.RetornarNegativo;

import org.junit.Test;
import static com.Ejercicio.Kyu8.RetornarNegativo.RetornarNegativo.makeNegative;
import static org.junit.Assert.assertEquals;

public class TestRetornarNegativo {
    public static void main(String[] args) {
        System.out.println("Test retornando números negativos");
    }

    @Test
    public void test1() {
        assertEquals(-42, makeNegative(42));
    }
}
