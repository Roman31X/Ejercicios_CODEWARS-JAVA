package com.Ejercicio.Kyu6.CarreraTortugas;

import static com.Ejercicio.Kyu6.CarreraTortugas.CalcularCarreraTortuga.race;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCarreraDeTortugas {
    public static void main(String[] args) {
        System.out.println("Test carrera de Tortugas");
    }

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new int[]{0, 32, 18}, race(720, 850, 70));
        assertArrayEquals(new int[]{3, 21, 49}, race(80, 91, 37));
        assertArrayEquals(new int[]{2, 0, 0}, race(80, 100, 40));
    }
}
