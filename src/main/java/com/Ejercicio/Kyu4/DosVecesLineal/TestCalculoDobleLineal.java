package com.Ejercicio.Kyu4.DosVecesLineal;

import static com.Ejercicio.Kyu4.DosVecesLineal.CalculoDobleLineal.dblLinear;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculoDobleLineal {
    public static void main(String[] args) {
        System.out.println("Test de Calculo Doble Lineal");
    }
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests dblLinear");
        testing(dblLinear(10), 22);
        testing(dblLinear(20), 57);
        testing(dblLinear(30), 91);
        testing(dblLinear(50), 175);

    }
}
