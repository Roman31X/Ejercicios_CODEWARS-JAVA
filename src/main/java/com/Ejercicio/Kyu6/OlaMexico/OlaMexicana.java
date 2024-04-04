package com.Ejercicio.Kyu6.OlaMexico;

public class OlaMexicana {
    public static String[] wave(String str) {
        if (str == null || str.isEmpty()) {
            return new String[0];
        }

        String[] waveArray = new String[countLetters(str)];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(i, Character.toUpperCase(c));
                waveArray[index++] = sb.toString();
            }
        }

        return waveArray;
    }

    private static int countLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
