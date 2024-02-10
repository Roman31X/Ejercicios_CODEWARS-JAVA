package com.Ejercicio.Kyu6.HagaCaminataDiezMinutos;

import org.testng.annotations.Test;

import static com.Ejercicio.Kyu6.HagaCaminataDiezMinutos.CalcularCaminataDiezMinutos.isValid;
import static junit.framework.TestCase.assertEquals;

public class TestCaminataDiezMinutos {
    public static void main(String[] args) {
        System.out.println("Test caminata de Diez Minutos");
    }

    @Test
    public void Test() {
        assertEquals("Should return true", true, isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false", false, isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals("Should return false", false, isValid(new char[] {'w'}));
        assertEquals("Should return false", false, isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}
