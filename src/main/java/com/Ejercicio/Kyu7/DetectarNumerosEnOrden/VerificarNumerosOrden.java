package com.Ejercicio.Kyu7.DetectarNumerosEnOrden;

public class VerificarNumerosOrden {
    public static boolean isAscOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
