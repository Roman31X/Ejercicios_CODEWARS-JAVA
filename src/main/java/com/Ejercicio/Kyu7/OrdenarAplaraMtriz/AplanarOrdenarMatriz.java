package com.Ejercicio.Kyu7.OrdenarAplaraMtriz;

import java.util.*;

public class AplanarOrdenarMatriz {
    public static int[] flattenAndSort(int[][] array) {
        int totalElements = 0;
        for (int[] subArray : array) {
            totalElements += subArray.length;
        }

        int[] flattenedArray = new int[totalElements];

        int index = 0;
        for (int[] subArray : array) {
            for (int num : subArray) {
                flattenedArray[index++] = num;
            }
        }

        Arrays.sort(flattenedArray);

        return flattenedArray;
    }
}
