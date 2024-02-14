package com.Ejercicio.Kyu4.FuncionMisteriosa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFuncionMisteriosa {
    public static void main(String[] args) {
        System.out.println("Test calculo de Función Misteriosa");
    }
    @Test
    public void mystery() throws Exception {
        assertEquals( "mystery(6) ", 5, CalcularFuncionMisteriosa.mystery( 6 ) );
        assertEquals( "mystery(9) ", 13, CalcularFuncionMisteriosa.mystery( 9 ) );
        assertEquals( "mystery(19) ", 26, CalcularFuncionMisteriosa.mystery( 19 ) );
    }

    @Test
    public void mysteryInv() throws Exception {
        assertEquals( "mysteryInv(5)", 6, CalcularFuncionMisteriosa.mysteryInv( 5 ) );
        assertEquals( "mysteryInv(13)", 9, CalcularFuncionMisteriosa.mysteryInv( 13 ) );
        assertEquals( "mysteryInv(26)", 19, CalcularFuncionMisteriosa.mysteryInv( 26 ) );
    }
}
