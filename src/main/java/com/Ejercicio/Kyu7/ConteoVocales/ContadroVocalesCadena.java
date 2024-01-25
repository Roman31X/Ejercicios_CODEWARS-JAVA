package com.Ejercicio.Kyu7.ConteoVocales;

public class ContadroVocalesCadena {
    public static int contadorVocal(String str){
        int contador = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char caracter = str.charAt(i);
            contador+=(caracter == 'a'||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u')?1:0;
        }
        return contador;
    }
}
