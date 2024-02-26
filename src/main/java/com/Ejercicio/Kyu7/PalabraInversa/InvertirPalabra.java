package com.Ejercicio.Kyu7.PalabraInversa;

public class InvertirPalabra {
    public static String reversoPalabra(final String original){
        String[] words = original.split("(?<=\\s)|(?=\\s)");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord);
        }
        return reversedString.toString();
    }
}
