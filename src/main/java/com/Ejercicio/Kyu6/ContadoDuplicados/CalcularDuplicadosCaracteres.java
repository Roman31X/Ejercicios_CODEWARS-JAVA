package com.Ejercicio.Kyu6.ContadoDuplicados;

import java.util.*;

public class CalcularDuplicadosCaracteres {
    public static int duplicateCount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        text = text.toLowerCase();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int duplicateCount = 0;

        for (int count : charCount.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}
