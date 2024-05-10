package com.Ejercicio.Kyu8.EsUnNumero;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEsUnNumero {
    public static void main(String[] args) {
        System.out.println("Test ¿Es un Número?");
    }

    IdentificarSiEsNumero myUtil = new IdentificarSiEsNumero();

    @Test
    public void test0() throws Exception
    {
        assertEquals(false,myUtil.isDigit("s2324"));
    }
    @Test
    public void test1() throws Exception
    {
        assertEquals(true,myUtil.isDigit("-234.4"));
    }
}
