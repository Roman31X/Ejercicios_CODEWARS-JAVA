package com.Ejercicio.Kyu7.UnosyCeros;

import java.util.List;

public class ConvertirBinarios {
    public static int ConvertidorBinarioArray(List<Integer> binary){
        String binarioTexto = "";
        for (int i = 0; i < binary.size(); i++) {
            binarioTexto+= binary.get(i);
        }
        return Integer.parseInt(binarioTexto,2);
    }
}
