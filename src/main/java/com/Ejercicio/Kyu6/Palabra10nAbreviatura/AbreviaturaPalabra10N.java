package com.Ejercicio.Kyu6.Palabra10nAbreviatura;

public class AbreviaturaPalabra10N {
    public static String abbreviate(String string) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean inWord = false;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (Character.isLetter(c)) {
                word.append(c);
                inWord = true;
            } else {
                if (inWord) {
                    result.append(abbreviateWord(word.toString()));
                    word.setLength(0);
                }
                result.append(c);
                inWord = false;
            }
        }

        if (inWord) {
            result.append(abbreviateWord(word.toString()));
        }

        return result.toString();
    }

    private static String abbreviateWord(String word) {
        if (word.length() < 4) {
            return word;
        } else {
            return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        }
    }

}
