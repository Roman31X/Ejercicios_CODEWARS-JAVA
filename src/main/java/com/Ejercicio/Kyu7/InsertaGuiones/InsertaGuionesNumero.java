package com.Ejercicio.Kyu7.InsertaGuiones;

public class InsertaGuionesNumero {
    public static String insertarGuion(int num){
        String numStr = Integer.toString(num);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {
            result.append(numStr.charAt(i));
            if (i < numStr.length() - 1 && (numStr.charAt(i) - '0') % 2 != 0 && (numStr.charAt(i + 1) - '0') % 2 != 0) {
                result.append('-');
            }
        }
        return result.toString();
    }
}
