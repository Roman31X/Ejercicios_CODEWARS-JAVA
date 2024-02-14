package com.Ejercicio.Kyu7.EliminaIntrusosBits;

import org.junit.jupiter.api.Test;

import static com.Ejercicio.Kyu7.EliminaIntrusosBits.EliminarBitsIntrusos.eliminateUnsetBits;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEliminarBitsIntrusos {
    public static void main(String[] args) {
        System.out.println("Tet para eliminar a los intrusos y manipulación de bits");
    }
    @Test
    void sampleTests() {
        assertEquals(255,eliminateUnsetBits("11010101010101"), "For input \"11010101010101\"");
        assertEquals(7,eliminateUnsetBits("111"), "For input \"111\"");
        assertEquals(1,eliminateUnsetBits("1000000"), "For input \"1000000\"");
        assertEquals(0,eliminateUnsetBits(""), "For empty input");
    }
}
