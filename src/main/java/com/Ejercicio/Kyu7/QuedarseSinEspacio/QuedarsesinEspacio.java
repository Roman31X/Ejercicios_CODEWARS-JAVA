package com.Ejercicio.Kyu7.QuedarseSinEspacio;

public class QuedarsesinEspacio {
    public static String[] spacey(String[] array) {
        String[] result = new String[array.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            result[i] = sb.toString();
        }
        return result;
    }
}
