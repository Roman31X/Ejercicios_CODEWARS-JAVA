package com.Ejercicio.Kyu7.FiltrarElNumero;

import org.junit.Test;
import static com.Ejercicio.Kyu7.FiltrarElNumero.FiltrarNumeroCadena.filterString;
import static junit.framework.TestCase.assertEquals;

public class TestFiltrarNumero {
    public static void main(String[] args) {
        System.out.println("Test filtrar el número");
    }
    @Test
    public void exampleTests() {
        assertEquals(123,filterString("123"));
        assertEquals(123,filterString("a1b2c3"));
        assertEquals(123,filterString("aa1bb2cc3dd"));
    }
}
