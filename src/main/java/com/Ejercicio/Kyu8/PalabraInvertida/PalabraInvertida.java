package com.Ejercicio.Kyu8.PalabraInvertida;

public class PalabraInvertida {
    public static String invertirPalabra(final String original) {
        String invertida = "";
        int posicion = 0;
        for (int i = original.length() - 1; i >= 0; i--,posicion++) {
            if(original.charAt(posicion) == ' '){
                invertida += " ";
            }
        }
        return invertida;
    }
}
