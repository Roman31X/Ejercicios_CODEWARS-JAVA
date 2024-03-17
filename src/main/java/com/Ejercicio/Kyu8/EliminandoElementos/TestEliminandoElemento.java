package com.Ejercicio.Kyu8.EliminandoElementos;

import static com.Ejercicio.Kyu8.EliminandoElementos.EliminarElementoLista.removeEveryOther;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestEliminandoElemento {
    public static void main(String[] args) {
        System.out.println("Test Eliminando elemento");
    }
    @Test
    void basicTest() {
        assertArrayEquals(new Object[] { "Hello", "Hello Again" },removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again" }));
        assertArrayEquals(new Object[] { new Object[] { 1, 2 } },removeEveryOther(new Object[] { new Object[] { 1, 2 } }));
        assertArrayEquals(new Object[] { 1, 3, 5, 7, 9 },removeEveryOther(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        assertArrayEquals(new Object[] { "Goodbye" }, removeEveryOther(new Object[] { "Goodbye" }));
        assertArrayEquals(new Object[] {}, removeEveryOther(new Object[] {}));
    }
}
