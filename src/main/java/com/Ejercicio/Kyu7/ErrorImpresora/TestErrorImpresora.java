package com.Ejercicio.Kyu7.ErrorImpresora;
import static com.Ejercicio.Kyu7.ErrorImpresora.ErroresDeImpresora.printerError;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestErrorImpresora {
    public static void main(String[] args) {
        System.out.println("Test de Errores de impresora");
    }
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", printerError(s));
    }
}
