package com.Ejercicio.Kyu8.CuerdasInvertidas;

public class PalabraInvertida {
    public static String invertirPalabra(final String original) {
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        return invertida;
    }
}
