package com.Ejercicio.Kyu6.DosSumas;

import java.util.Arrays;

import static com.Ejercicio.Kyu6.DosSumas.CalculoSumasMatriz.twoSum;

public class TestDosSumasArrays {
    public static void main(String[] args) {
        System.out.println("Test ara suma de dos números iguales Dentro de un Arrays");
        int[] nuevo = twoSum(new int[]{1,2,3},          4);
        System.out.println("Array [1,2,3] : "+ Arrays.toString(nuevo));
        int[] nuevo1 = twoSum(new int[]{1234,5678,9012}, 14690);
        System.out.println("Array [1234,5678,9012] : "+ Arrays.toString(nuevo1));
        int[] nuevo2 = twoSum(new int[]{2,2,3},          4);
        System.out.println("Array [2,2,3] : "+ Arrays.toString(nuevo2));
        int[] nuevo3 = twoSum(new int[]{2,3,1},          4);
        System.out.println("Array [2,3,1] : "+ Arrays.toString(nuevo3));
    }
}
