package com.Ejercicio.Kyu8.CantidadTotalPuntos;

import org.junit.Test;

import static com.Ejercicio.Kyu8.CantidadTotalPuntos.ContadorPuntosArrays.points;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TestCantidadTotalDePuntos {
    public static void main(String[] args) {
        System.out.println("Test cantidad de puntos ganados");
    }

    @Test
    public void basicTests() {
        assertEquals(30, points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));

        assertEquals(10, points(new String[]
                {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));

        assertEquals(0, points(new String[]
                {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"}));

        assertEquals(15, points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"}));

        assertEquals(12, points(new String[]
                {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"}));
    }
}
