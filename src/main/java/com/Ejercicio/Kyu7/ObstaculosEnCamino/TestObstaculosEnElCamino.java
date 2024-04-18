package com.Ejercicio.Kyu7.ObstaculosEnCamino;

import org.junit.Test;

import static com.Ejercicio.Kyu7.ObstaculosEnCamino.IdentificarObstaculosCamino.bumps;
import static org.junit.Assert.assertEquals;

public class TestObstaculosEnElCamino {
    public static void main(String[] args) {
        System.out.println("Test Obstáculos en el camino");
    }
    @Test
    public void basicTest() {
        assertEquals("Woohoo!", bumps("n"));
        assertEquals("Woohoo!", bumps("__nn_nnnn__n_n___n____nn__nnn"));
        assertEquals("Woohoo!", bumps("nnn_n__n_n___nnnnn___n__nnn__"));
        assertEquals("Car Dead", bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        assertEquals("Woohoo!", bumps("______n___n_"));
        assertEquals("Car Dead", bumps("nnnnnnnnnnnnnnnnnnnnn"));
    }
}
