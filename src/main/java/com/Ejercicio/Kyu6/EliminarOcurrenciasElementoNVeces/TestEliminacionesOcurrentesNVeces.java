package com.Ejercicio.Kyu6.EliminarOcurrenciasElementoNVeces;

import static com.Ejercicio.Kyu6.EliminarOcurrenciasElementoNVeces.EliminarElementosConcurrentesNVeces.deleteNth;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestEliminacionesOcurrentesNVeces {
    public static void main(String[] args) {
        System.out.println("Test Eliminar apariciones de un elemento si ocurre más de n veces");
    }
    @Test
    public void PruebadeleteNth() throws Exception {
        assertArrayEquals(
                new int[] { 20, 37, 21 },
                deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        assertArrayEquals(
                new int[] { },
                deleteNth( new int[] { }, 5 )
        );

    }

}
