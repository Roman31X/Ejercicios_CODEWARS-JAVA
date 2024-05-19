package com.Ejercicio.Kyu7.SumaNumerosde0aN;

import org.junit.Test;

import static com.Ejercicio.Kyu7.SumaNumerosde0aN.CalcularSumade0aN.showSequence;
import static org.junit.Assert.assertEquals;

public class TestSumade0aN {
    public static void main(String[] args) {
        System.out.println("Test de suma desde 0 a N numero");
    }
    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21",showSequence(6));
    }

}
