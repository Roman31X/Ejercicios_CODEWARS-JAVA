package com.Ejercicio.Kyu5.PepePanadero;

import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu5.PepePanadero.PanaderoPedidos.cakes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;

public class TestPepeElPanadero {
    public static void main(String[] args) {
        System.out.println("Test Pepe el panadero recetas");
    }

    @Test
    void basicTest() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(2, cakes(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void missingIngredient() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1,
                "cinnamon", 300);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(0, cakes(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }
}
