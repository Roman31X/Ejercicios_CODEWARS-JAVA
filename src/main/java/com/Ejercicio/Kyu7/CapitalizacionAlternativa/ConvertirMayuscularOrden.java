package com.Ejercicio.Kyu7.CapitalizacionAlternativa;

public class ConvertirMayuscularOrden {
    public static String[] capitalize(String s){
        StringBuilder evenIndices = new StringBuilder();
        StringBuilder oddIndices = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                evenIndices.append(Character.toUpperCase(c));
                oddIndices.append(c);
            } else {
                evenIndices.append(c);
                oddIndices.append(Character.toUpperCase(c));
            }
        }

        return new String[]{evenIndices.toString(), oddIndices.toString()};
    }
}
