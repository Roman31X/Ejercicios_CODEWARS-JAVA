package com.Ejercicio.Kyu8.BinarioFalso;

public class IdentificarBinarioFalso {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();

        for (char c : numberString.toCharArray()) {
            if (c < '5') {
                result.append('0');
            } else {
                result.append('1');
            }
        }

        return result.toString();
    }
}
