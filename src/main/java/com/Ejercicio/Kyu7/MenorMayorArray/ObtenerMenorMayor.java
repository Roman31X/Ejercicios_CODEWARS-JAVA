package com.Ejercicio.Kyu7.MenorMayorArray;

import java.util.ArrayList;
import java.util.List;

public class ObtenerMenorMayor {
    public static String MayorMenorCadena(String numbers){
        String numero = "";
        List<Integer> numeros = new ArrayList<>();
        int menor = 100, mayor = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if(numbers.charAt(i) != ' '){
                numero += numbers.charAt(i);

            }else{
                System.out.println(numero);
                numeros.add(Integer.parseInt(numero));
                numero = "";
            }
        }
        for (Integer digitos: numeros) {
            mayor = (digitos > mayor)?digitos:mayor;
            menor = (digitos < menor)?digitos:menor;
        }
        return "{"+menor+" "+mayor+"}";
    }
}
