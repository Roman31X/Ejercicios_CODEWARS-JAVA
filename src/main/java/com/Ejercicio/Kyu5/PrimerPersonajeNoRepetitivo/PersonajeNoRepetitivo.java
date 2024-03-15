package com.Ejercicio.Kyu5.PrimerPersonajeNoRepetitivo;

import java.util.*;

public class PersonajeNoRepetitivo {
    public static String firstNonRepeatingLetter(String s){
        Map<Character, Integer> charCounts = new HashMap<>();

        String lowercaseS = s.toLowerCase();

        for (char c : lowercaseS.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (charCounts.get(Character.toLowerCase(c)) == 1) {
                return String.valueOf(c);
            }
        }

        return "";
    }
}
