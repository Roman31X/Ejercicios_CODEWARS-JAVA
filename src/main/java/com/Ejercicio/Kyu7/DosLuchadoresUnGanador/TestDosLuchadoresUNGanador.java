package com.Ejercicio.Kyu7.DosLuchadoresUnGanador;

import org.junit.Test;

import static com.Ejercicio.Kyu7.DosLuchadoresUnGanador.Fighter.declareWinner;
import static org.junit.Assert.assertEquals;

public class TestDosLuchadoresUNGanador {
    public static void main(String[] args) {
        System.out.println("Test Dos luchadores un Ganador");
    }

    @Test
    public void basicTests() {
        assertEquals("Lew", declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}
