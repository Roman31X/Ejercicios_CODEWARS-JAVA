package com.Ejercicio.Kyu7.DosCadenaAUno;

import java.util.*;

public class SeleccionCadenasDosaUno {
    public static String largCadena(String s1, String s2){
        String combined = s1 + s2;
        char[] charArray = combined.toCharArray();
        Arrays.sort(charArray);

        HashSet<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : charArray) {
            if (uniqueChars.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
