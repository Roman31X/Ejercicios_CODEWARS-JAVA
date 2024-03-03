package com.Ejercicio.Kyu8.FraseAplastante;

public class OrdenarLaFrase {
    public static String smash(String... words){
        if (words == null || words.length == 0) {
            return "";
        }

        StringBuilder sentence = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            sentence.append(" ").append(words[i]);
        }

        return sentence.toString();
    }
}
