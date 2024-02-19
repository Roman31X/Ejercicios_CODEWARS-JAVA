package com.Ejercicio.Kyu7.ConsiguePersonajeMedio;

public class CapturarPersonajeMedio {
    public static String getMiddle(String word){
        if (word == null || word.length() == 0) {
            return "";
        }
        int length = word.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return word.substring(middle - 1, middle + 1);
        } else {
            return word.substring(middle, middle + 1);
        }
    }
}
