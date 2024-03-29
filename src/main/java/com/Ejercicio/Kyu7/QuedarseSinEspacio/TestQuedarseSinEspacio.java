package com.Ejercicio.Kyu7.QuedarseSinEspacio;

import java.util.Arrays;
import org.junit.jupiter.api.*;

import static com.Ejercicio.Kyu7.QuedarseSinEspacio.QuedarsesinEspacio.spacey;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestQuedarseSinEspacio {
    public static void main(String[] args) {
        System.out.println("Test Quedarse sin Espacio");
    }
    @Test
    @Order(1)
    @DisplayName("Strings with lower letters only")
    void test1() {
        String[] input = new String[]{"kevin", "has", "no", "space"};
        String[] expected = new String[]{"kevin", "kevinhas", "kevinhasno", "kevinhasnospace"};
        Assertions.assertArrayEquals(expected, spacey(input));
    }

    @Test
    @Order(2)
    @DisplayName("Strings with camel case")
    void test2() {
        String[] input = new String[]{"Camel", "Case", "Should", "Remain"};
        String[] expected = new String[]{"Camel", "CamelCase", "CamelCaseShould", "CamelCaseShouldRemain"};
        Assertions.assertArrayEquals(expected, spacey(input));
    }

    @Test
    @Order(3)
    @DisplayName("Strings with letters, digits,")
    void test3() {
        String[] input = new String[]{"Trying!", "Adding2", "Diff3rent", "Comb1nati0ns"};
        String[] expected = new String[]{"Trying!", "Trying!Adding2", "Trying!Adding2Diff3rent", "Trying!Adding2Diff3rentComb1nati0ns"};
        Assertions.assertArrayEquals(expected, spacey(input));
    }
}
