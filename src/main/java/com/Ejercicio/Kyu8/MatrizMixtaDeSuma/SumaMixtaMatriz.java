package com.Ejercicio.Kyu8.MatrizMixtaDeSuma;

import java.util.ArrayList;
import java.util.List;

public class SumaMixtaMatriz {
    public int suma(List<?> mixed){
        int suma = 0;
        for (int i = 0; i < mixed.size(); i++) {
            String numero = String.valueOf(mixed.get(i));
            suma+=Integer.parseInt(numero);
        }
        return suma;
    }
}
