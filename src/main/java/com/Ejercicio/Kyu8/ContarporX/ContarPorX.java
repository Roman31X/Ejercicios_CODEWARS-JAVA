package com.Ejercicio.Kyu8.ContarporX;

public class ContarPorX {
    public static int[] ContarPor(int x, int n){
        int[] multiplos = new int[n];
        for (int i = 0,j=1; i < n; i++,j++) {
            multiplos[i] = j*x;
        }
        return multiplos;
    }
}
