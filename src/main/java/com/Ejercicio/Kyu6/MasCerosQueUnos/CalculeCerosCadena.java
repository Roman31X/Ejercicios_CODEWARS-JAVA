package com.Ejercicio.Kyu6.MasCerosQueUnos;

import java.util.*;

public class CalculeCerosCadena {
    public static char[] moreZeros(String s) {
        List<Character> result = new ArrayList<>();
        Set<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                continue;
            }

            String binary = Integer.toBinaryString(c);
            int countZeros = binary.length() - binary.replace("0", "").length();
            int countOnes = binary.length() - countZeros;

            if (countZeros > countOnes) {
                result.add(c);
                seen.add(c);
            }
        }

        char[] output = new char[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }
}
