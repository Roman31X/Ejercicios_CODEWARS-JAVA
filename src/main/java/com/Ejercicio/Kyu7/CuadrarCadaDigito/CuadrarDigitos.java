package com.Ejercicio.Kyu7.CuadrarCadaDigito;

public class CuadrarDigitos {
    public static int cuadrarDigito(int n){
        StringBuilder result = new StringBuilder();

        String numberString = Integer.toString(n);

        for (char digitChar : numberString.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            result.append(digit * digit);
        }

        return Integer.parseInt(result.toString());
    }
}
