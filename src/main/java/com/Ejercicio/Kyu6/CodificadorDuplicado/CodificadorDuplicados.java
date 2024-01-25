package com.Ejercicio.Kyu6.CodificadorDuplicado;

import java.util.*;

public class CodificadorDuplicados {
    static String duplicadoCodigo(String word){
        String minusculas = word.toLowerCase();
        Map<Character,Integer> caracterContado = new HashMap<>();
        for (char caracter : minusculas.toCharArray()) {
            caracterContado.put(caracter,caracterContado.getOrDefault(caracter,0)+1);
        }
        String codificacion = "";
        for (char carcater : minusculas.toCharArray()) {
            if(caracterContado.get(carcater) > 1){
                codificacion += ")";
            }else{
                codificacion += "(";
            }
        }
        return codificacion;
    }
}
