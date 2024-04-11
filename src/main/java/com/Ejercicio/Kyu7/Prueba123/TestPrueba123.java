package com.Ejercicio.Kyu7.Prueba123;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu7.Prueba123.EvaluarTest123.number;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TestPrueba123 {
    public static void main(String[] args) {
        System.out.println("Test realizado a prueba de evaluación 1 - 2 - 3");
    }
    @Test
    public void basicTests() {
        assertIterableEquals(Arrays.asList(), number(Arrays.asList()));
        assertIterableEquals(Arrays.asList("1: a", "2: b", "3: c"), number(Arrays.asList("a", "b", "c")));
        assertIterableEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), number(Arrays.asList("", "", "", "", "")));
    }
}
