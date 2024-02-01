package com.Ejercicio.Kyu6.EncuentraNumeroUnico;

public class EncontrarNumeroUnicoMatriz {
    public static double unicoNumero(double arr[]){
        if (arr[0] != arr[1] && arr[1] == arr[2]) {
            return arr[0];
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                    return arr[i];
                } else {
                    return arr[i - 1];
                }
            }
        }
        return arr[0];
    }
}
