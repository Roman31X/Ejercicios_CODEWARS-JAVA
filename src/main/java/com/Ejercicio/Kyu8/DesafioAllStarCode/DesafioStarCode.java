package com.Ejercicio.Kyu8.DesafioAllStarCode;

public class DesafioStarCode {
    public static int StrCount(String str, char letter){
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == letter){
                contador++;
            }
        }
        return contador;
    }
}
