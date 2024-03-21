package com.Ejercicio.Kyu6.InvertirRotar;
import static com.Ejercicio.Kyu6.InvertirRotar.InvertirORotarOrden.revRot;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestInvertirORotar {
    public static void main(String[] args) {
        System.out.println("Test para ¿Invertir o Rotar?");
    }

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");
        testing(revRot("1234", 0), "");
        testing(revRot("", 0), "");
        testing(revRot("1234", 5), "");
        String s = "733049910872815764";
        testing(revRot(s, 5), "330479108928157");
    }
}
