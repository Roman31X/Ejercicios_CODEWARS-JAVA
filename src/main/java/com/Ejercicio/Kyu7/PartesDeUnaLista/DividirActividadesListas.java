package com.Ejercicio.Kyu7.PartesDeUnaLista;

public class DividirActividadesListas {
    public static String[][] partlist(String[] arr) {
        int n = arr.length;
        String[][] result = new String[n - 1][2];
        StringBuilder firstPart = new StringBuilder();
        StringBuilder secondPart = new StringBuilder();

        for (int i = 0; i < n - 1; i++) {
            firstPart.append(arr[i]);
            secondPart.setLength(0);
            for (int j = i + 1; j < n; j++) {
                secondPart.append(arr[j]);
                if (j < n - 1) secondPart.append(" ");
            }
            result[i][0] = firstPart.toString();
            result[i][1] = secondPart.toString();
            firstPart.append(" ");
        }

        return result;
    }
}
