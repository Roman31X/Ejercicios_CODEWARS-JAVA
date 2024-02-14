package com.Ejercicio.Kyu7.EliminaIntrusosBits;

public class EliminarBitsIntrusos {
    public static long eliminateUnsetBits(String number) {
        // Eliminar todos los caracteres que no sean '1'
        String binaryNumber = number.replaceAll("[^1]", "");

        // Devolver el número decimal correspondiente
        return binaryNumber.isEmpty() ? 0 : Long.parseLong(binaryNumber, 2);
    }
}
