package com.Ejercicio.Kyu8.TablaMultiplicarN;

import org.junit.Test;

import static com.Ejercicio.Kyu8.TablaMultiplicarN.TablaMultiplicarNumeros.multiTable;
import static junit.framework.TestCase.assertEquals;

public class TestTablaMultiplicarNumeros {
    public static void main(String[] args) {
        System.out.println("Test Tabla de multiplicar para números");
        System.out.println("Tabla del [5] : \n"+multiTable(5));
        System.out.println("Tabla del [1] : \n"+multiTable(1));
    }
    @Test
    public void basicTests() {
        assertEquals("1 * 5 = 5\n2 * 5 = 10\n3 * 5 = 15\n4 * 5 = 20\n5 * 5 = 25\n6 * 5 = 30\n7 * 5 = 35\n8 * 5 = 40\n9 * 5 = 45\n10 * 5 = 50", multiTable(5));
        assertEquals("1 * 1 = 1\n2 * 1 = 2\n3 * 1 = 3\n4 * 1 = 4\n5 * 1 = 5\n6 * 1 = 6\n7 * 1 = 7\n8 * 1 = 8\n9 * 1 = 9\n10 * 1 = 10", multiTable(1));

    }
}
