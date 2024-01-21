package com.Ejercicio.Kyu8.ConvertirCadenaMtriz;

import java.util.ArrayList;
import java.util.List;

public class ConvertirCadena {
    public static String[] cadenaArray(String s){
        String palabra = "";
        List<String> palabras = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                palabra += s.charAt(i);
            }else{
                palabras.add(palabra);
                palabra="";
            }
        }
        palabras.add(palabra);
        String[] texto = new String[palabras.size()];
        for (int i = 0; i < palabras.size(); i++) {
            texto[i]= palabras.get(i);
        }
        return texto;
    }
}
