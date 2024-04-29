package com.Ejercicio.Kyu4.MezclaDeCuerdas;

import java.util.*;

public class MezclarCadenas {
    public static String mix(String s1, String s2) {
        Map<Character, Integer> s1Frequency = getCharacterFrequency(s1);
        Map<Character, Integer> s2Frequency = getCharacterFrequency(s2);

        List<String> result = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            int s1Count = s1Frequency.getOrDefault(c, 0);
            int s2Count = s2Frequency.getOrDefault(c, 0);

            if (s1Count > 1 || s2Count > 1) {
                if (s1Count > s2Count) {
                    result.add("1:" + String.join("", Collections.nCopies(s1Count, String.valueOf(c))));
                } else if (s2Count > s1Count) {
                    result.add("2:" + String.join("", Collections.nCopies(s2Count, String.valueOf(c))));
                } else {
                    result.add("=:" + String.join("", Collections.nCopies(s1Count, String.valueOf(c))));
                }
            }
        }

        Collections.sort(result, (s, t) -> {
            if (s.length() != t.length()) {
                return t.length() - s.length();
            } else {
                return s.compareTo(t);
            }
        });

        return String.join("/", result);
    }

    private static Map<Character, Integer> getCharacterFrequency(String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }
        }

        return frequency;
    }
}
