package com.Ejercicio.Kyu6.SumaConsecutivas;

import java.util.*;

public class CalculoSumaConsecutiva {
    public static List<Integer> sumaConsecutiva(List<Integer> s){
        List<Integer> resultado = new ArrayList<>();

        int sum = s.get(0);
        for (int i = 1; i < s.size(); i++) {
            if (s.get(i - 1).equals(s.get(i))) {
                sum += s.get(i);
            } else {
                resultado.add(sum);
                sum = s.get(i);
            }
        }

        resultado.add(sum);

        return resultado;
    }
}
