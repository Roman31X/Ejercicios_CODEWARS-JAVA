package com.Ejercicio.Kyu6.ContadroCaracteresCadena;

import java.util.*;

public class ContarCarcateresString {
    public static Map<Character, Integer> contador(String str){
        Map<Character, Integer> contadorCaracteres = new HashMap<>();
        for (char caracter: str.toCharArray()) {
            contadorCaracteres.put(caracter, contadorCaracteres.getOrDefault(caracter,0)+1);
        }
        return contadorCaracteres;
    }
}
