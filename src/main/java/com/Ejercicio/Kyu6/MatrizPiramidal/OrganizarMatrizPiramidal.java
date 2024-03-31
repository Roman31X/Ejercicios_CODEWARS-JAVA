package com.Ejercicio.Kyu6.MatrizPiramidal;

public class OrganizarMatrizPiramidal {
    public static int[][] pyramid(int n){
        int[][] result = new int[n][];
        for (int i = 0; i < n; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                result[i][j] = 1;
            }
        }
        return result;
    }
}
