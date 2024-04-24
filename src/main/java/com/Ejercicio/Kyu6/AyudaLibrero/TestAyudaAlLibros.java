package com.Ejercicio.Kyu6.AyudaLibrero;

import static com.Ejercicio.Kyu6.AyudaLibrero.OrganizarLibros.stockSummary;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestAyudaAlLibros {
    public static void main(String[] args) {
        System.out.println("Test ayuda al librero");
    }
    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                stockSummary(art, cd));
    }
}
