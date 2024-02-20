package com.Ejercicio.Kyu7.CuerdasCarcasaJaden;

public class ConvertirCuerdasCarcasaJaden {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        StringBuilder jadenCased = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : phrase.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                jadenCased.append(c); // Preserve the original whitespace
            } else {
                if (capitalizeNext) {
                    jadenCased.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    jadenCased.append(Character.toLowerCase(c));
                }
            }
        }

        return jadenCased.toString();
    }
}
