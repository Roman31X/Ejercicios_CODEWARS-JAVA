package com.Ejercicio.Kyu8.EliminarEspaciosCadena;

import org.junit.Test;

import static com.Ejercicio.Kyu8.EliminarEspaciosCadena.EliminarEspacioEnCadena.noSpace;
import static org.junit.Assert.assertEquals;

public class TestEliminarEspacioString {
    public static void main(String[] args) {
        System.out.println("Test para eliminar espacios en una Cadena de String");
    }

    @Test public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd",noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", noSpace("8j aam"));
    }
}
