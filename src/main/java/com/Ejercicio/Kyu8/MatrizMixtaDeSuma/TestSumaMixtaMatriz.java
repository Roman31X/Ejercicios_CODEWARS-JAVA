package com.Ejercicio.Kyu8.MatrizMixtaDeSuma;

import java.util.Arrays;

public class TestSumaMixtaMatriz {
    public static void main(String[] args) {
        System.out.println("Tes para Suma Mixta de Arrays");
        SumaMixtaMatriz suma = new SumaMixtaMatriz();
        System.out.println("Arrays [] : "+suma.suma(Arrays.asList(9,3,"7","3")));
        System.out.println("Arrays [5,\"5\"] : "+suma.suma(Arrays.asList(5,"5")));
        System.out.println("Arrays [\"5\", \"0\", 9, 3, 2, 1, \"9\", 6, 7] : "+suma.suma(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        System.out.println("Arrays [\"3\", 6, 6, 0, \"5\", 8, 5, \"6\", 2, \"0\"] : "+suma.suma(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        System.out.println("Arrays [\"1\", \"5\", \"8\", 8, 9, 9, 2, \"3\"] : "+suma.suma(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
        System.out.println("Arrays [\"3\", 6, 6, 0, \"5\", 8, 5, \"6\", 2, \"0\"] : "+suma.suma(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        System.out.println("Arrays [8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7] : "+suma.suma(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }
}
