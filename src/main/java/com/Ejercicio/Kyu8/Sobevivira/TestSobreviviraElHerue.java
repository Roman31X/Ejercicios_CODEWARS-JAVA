package com.Ejercicio.Kyu8.Sobevivira;

import static com.Ejercicio.Kyu8.Sobevivira.CalcularBalasDagones.hero;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestSobreviviraElHerue {
    public static void main(String[] args) {
        System.out.println("Test calcular si tendrá suficiente balas para enfrentar a los dragones");
    }
    @Test @DisplayName("A true hero")
    void aTrueHero() {
        assertTrue(hero(10, 5), "With 10 bullets and 5 dragons");
        assertTrue(hero(100, 40), "With 100 bullets and 40 dragons");
    }

    @Test @DisplayName("A false hero")
    void aFalseHero() {
        assertFalse(hero(4, 5), "With 4 bullets and 5 dragons");
        assertFalse(hero(1500, 751), "With 1500 bullets and 751 dragons");
        assertFalse(hero(0, 1), "With 0 bullets and 1 dragon");
        assertFalse(hero(7, 4), "With 7 bullets and 4 dragons");
    }
}
