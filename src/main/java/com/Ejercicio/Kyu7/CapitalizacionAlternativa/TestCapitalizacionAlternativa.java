package com.Ejercicio.Kyu7.CapitalizacionAlternativa;

import org.junit.Test;
import static com.Ejercicio.Kyu7.CapitalizacionAlternativa.ConvertirMayuscularOrden.capitalize;
import static org.junit.Assert.assertArrayEquals;

public class TestCapitalizacionAlternativa {
    public static void main(String[] args) {
        System.out.println("Test Capitalización alternativa");
    }
    @Test
    public void basicTests(){
        assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, capitalize("abcdef"));
        assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, capitalize("codewars"));
        assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, capitalize("abracadabra"));
        assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, capitalize("codewarriors"));
    }
}
