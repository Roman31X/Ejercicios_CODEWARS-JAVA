package com.Ejercicio.Kyu8.OrdenarYDestacar;

import java.util.*;

public class OrdenarCadenaDestacarOrden {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String firstSortedString = s[0];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < firstSortedString.length(); i++) {
            result.append(firstSortedString.charAt(i));
            if (i != firstSortedString.length() - 1) {
                result.append("***");
            }
        }

        return result.toString();
    }
}
