package com.Ejercicio.Kyu7.Digitalizar;

public class DigitalizarNumero {
    public static int[] digitalizar(int n){
        String numero = String.valueOf(n);
        int[] digitos = new int[numero.length()];
        for (int i = 0; i < numero.length(); i++) {
            digitos[i]= Character.getNumericValue(numero.charAt(i));
        }
        return digitos;
    }
}
