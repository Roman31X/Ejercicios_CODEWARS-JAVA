package com.Ejercicio.Kyu6.QuitarRepetidosArray;

import java.util.ArrayList;
import java.util.List;

public class QuitarRepetidos {
    public static int[] quitarMatris(int[] a,int[] b){
        List<String> primero = new ArrayList<String>();
        for (int numero: a) {
            primero.add(String.valueOf(numero));
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                primero.remove(String.valueOf(b[i]));
            }
        }
        int[] nuevo = new int[primero.size()];
        for (int i = 0; i < primero.size(); i++) {
            nuevo[i] = Integer.parseInt(primero.get(i));
        }
        return nuevo;
    }
}
