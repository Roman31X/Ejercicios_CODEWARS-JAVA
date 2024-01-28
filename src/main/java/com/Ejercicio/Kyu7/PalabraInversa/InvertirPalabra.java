package com.Ejercicio.Kyu7.PalabraInversa;

public class InvertirPalabra {
    public static String reversoPalabra(final String original){
        // Convert the word to a char array for easier reversal
        char[] charArray = original.toCharArray();

        // Reverse the char array in-place
        int izquierda = 0, derecha = charArray.length - 1;
        while (izquierda < derecha) {
            char temp = charArray[izquierda];
            charArray[izquierda] = charArray[derecha];
            charArray[derecha] = temp;
            izquierda++;
            derecha--;
        }
        String invertido = "";
        for (int i = 0; i < charArray.length; i++) {
            invertido += charArray[i];
        }
        // Convert the reversed char array back to a string
        return invertido;
    }
}
