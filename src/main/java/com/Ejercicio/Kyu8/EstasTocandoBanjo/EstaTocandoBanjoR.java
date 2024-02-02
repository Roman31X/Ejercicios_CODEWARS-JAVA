package com.Ejercicio.Kyu8.EstasTocandoBanjo;

public class EstaTocandoBanjoR {
    public static String elEstaTocando(String name){
        char[] letra = name.toCharArray();
        return (letra[0] == 'R' || letra[0] == 'r')?name + " plays banjo":name + " does not play banjo";
    }
}
