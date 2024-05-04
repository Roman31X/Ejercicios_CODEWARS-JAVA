package com.Ejercicio.Kyu8.EjercicioPOO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgramacionOrientadaObjetos {
    public static void main(String[] args) {
        System.out.println("Test de Programación Orientado a Objetos");
    }

    @Test
    void emptyShipShouldNotWorthToAboard() {
        ProgramacionOrientadaObjeto ship = new ProgramacionOrientadaObjeto(0 , 0);
        assertEquals(false, ship.isWorthIt(), "<draft: 0, crew: 0>");
    }

    @Test
    void shipWithLotOfBootyWorthToAboard() {
        ProgramacionOrientadaObjeto ship = new ProgramacionOrientadaObjeto(40 , 5);
        assertEquals(true, ship.isWorthIt(), "<draft: 40, crew: 5>");
    }
}
