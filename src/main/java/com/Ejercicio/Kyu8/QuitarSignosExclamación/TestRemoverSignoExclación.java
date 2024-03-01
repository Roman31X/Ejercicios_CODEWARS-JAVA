package com.Ejercicio.Kyu8.QuitarSignosExclamación;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.Ejercicio.Kyu8.QuitarSignosExclamación.RemoverSignoCadena.removeExclamationMarks;

public class TestRemoverSignoExclación {
    public static void main(String[] args) {
        System.out.println("Test Quitar signos de exclamación");
        System.out.println("Palabra [Hello World!] : "+removeExclamationMarks("Hello World!"));
    }
    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", removeExclamationMarks("Hello World!"));
    }
}
