package com.Ejercicio.Kyu8.GiraEjemploKata;

import org.junit.Test;
import static com.Ejercicio.Kyu8.GiraEjemploKata.InvertirKataEjercicio.kataExampleTwist;
import static org.junit.Assert.assertEquals;

public class TestGiroEjemploKata {
    public static void main(String[] args) {
        System.out.println("Test Giro de ejemplo de Kata");
    }
    @Test
    public void test(){
        String[] websites = kataExampleTwist();
        assertEquals("The array is still empty", true, websites.length > 0);
        assertEquals("The array does not equal 1,000", true, websites.length == 1000);
        boolean allCodewars = true;
        for (int i = 0; i < websites.length; i++) if (!"codewars".equals(websites[i])) allCodewars = false;
        assertEquals("Every element in the array must contain the value \"codewars\"", true, allCodewars);
    }
}
