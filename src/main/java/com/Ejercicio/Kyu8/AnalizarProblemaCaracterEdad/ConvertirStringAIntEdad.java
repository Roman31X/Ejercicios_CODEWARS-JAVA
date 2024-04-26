package com.Ejercicio.Kyu8.AnalizarProblemaCaracterEdad;

public class ConvertirStringAIntEdad {
    public static int howOld(final String herOld) {
        char firstChar = herOld.charAt(0);
        int edad = Character.getNumericValue(firstChar);
        return edad;
    }
}
