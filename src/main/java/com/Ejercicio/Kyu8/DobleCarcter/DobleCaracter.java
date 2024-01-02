package com.Ejercicio.Kyu8.DobleCarcter;

public class DobleCaracter {
    public static String dobleCaracter(String palabra){
        String nuevaPalabra = "";
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < 2; j++) {
                nuevaPalabra+=palabra.charAt(i);
            }
        }
        return nuevaPalabra;
    }
}
