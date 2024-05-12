package com.Ejercicio.Kyu6.CifrarEsto;

public class GenerarCifradoTexto {
    public static String encryptThis(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder encryptedText = new StringBuilder();
        String[] words = text.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                encryptedText.append(encryptWord(word)).append(" ");
            }
        }

        return encryptedText.toString().trim();
    }

    private static String encryptWord(String word) {
        StringBuilder encryptedWord = new StringBuilder();

        // Convertir el primer caracter a su código ASCII
        encryptedWord.append((int) word.charAt(0));

        // Si la palabra tiene más de un caracter, realizar el intercambio
        if (word.length() > 1) {
            encryptedWord.append(switchLetters(word.substring(1)));
        }

        return encryptedWord.toString();
    }

    private static String switchLetters(String substring) {
        if (substring.length() <= 1) {
            return substring;
        }

        char[] letters = substring.toCharArray();
        char first = letters[0];
        char last = letters[letters.length - 1];

        // Intercambiar la segunda letra con la última letra
        letters[0] = last;
        letters[letters.length - 1] = first;

        return new String(letters);
    }
}
