package com.Ejercicio.Kyu8.OrdenarYDestacar;

import org.junit.Test;
import static com.Ejercicio.Kyu8.OrdenarYDestacar.OrdenarCadenaDestacarOrden.twoSort;
import static org.junit.Assert.assertEquals;

public class TestOrdenaryDestacar {
    public static void main(String[] args) {
        System.out.println("Test ordenar y destacar");
    }

    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}
