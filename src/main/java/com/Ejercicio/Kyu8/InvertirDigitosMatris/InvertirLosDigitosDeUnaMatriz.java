package com.Ejercicio.Kyu8.InvertirDigitosMatris;

public class InvertirLosDigitosDeUnaMatriz {
    public static int[] digitos(long n){
        String numero = String.valueOf(n);
        char[] digitos = numero.toCharArray();
        int[] nuevoDigitos = new int[digitos.length];
        for (int i = digitos.length-1,j=0; i >= 0 ; i--,j++) {
            nuevoDigitos[j] = Integer.parseInt(String.valueOf(digitos[i]));
        }
        return nuevoDigitos;
    }
}
