package com.Ejercicio.Kyu8.PlabraMasCorta;

public class PalabraMasCorta {
    public static int palabraCorta(String s){
        int menor = 10;
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (s.charAt(i) == ' '){
                System.out.println(contador);
                if(menor > contador){
                    menor = contador;
                }
                contador = 0;
            }
            contador++;
        }
        return menor;
    }
}
