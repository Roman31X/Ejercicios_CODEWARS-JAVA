package com.Ejercicio.Kyu7.PalabraInversa;

public class InvertirPalabra {
    public static String reversoPalabra(final String original){
        String[] words = original.split("\\s");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }
}
