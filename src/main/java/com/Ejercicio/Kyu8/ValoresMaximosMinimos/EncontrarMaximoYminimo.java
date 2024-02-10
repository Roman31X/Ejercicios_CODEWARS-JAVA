package com.Ejercicio.Kyu8.ValoresMaximosMinimos;

public class EncontrarMaximoYminimo {
    public static int min(int[] list){
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(menor > list[i]){
                menor = list[i];
            }
        }
        return menor;
    }
    public static int max(int[] list){
        int mayor= Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(mayor < list[i]){
                mayor = list[i];
            }
        }
        return mayor;
    }
}
