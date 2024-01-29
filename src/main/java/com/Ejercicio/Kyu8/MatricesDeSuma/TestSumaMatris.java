package com.Ejercicio.Kyu8.MatricesDeSuma;

import static com.Ejercicio.Kyu8.MatricesDeSuma.SumaMatris.sumaMatrsi;

public class TestSumaMatris {
    public static void main(String[] args) {
        System.out.println("Tes de suma de números de matriz ");
        System.out.println("Matriz [] : "+sumaMatrsi(new double[]{}));
        System.out.println("Matriz [-2.398] : "+sumaMatrsi(new double[]{-2.398}));
        System.out.println("Matriz [1, 2, 3] : "+sumaMatrsi(new double[]{1, 2, 3}));
        System.out.println("Matriz [1.1, 2.2, 3.3] : "+sumaMatrsi(new double[]{1.1, 2.2, 3.3}));
        System.out.println("Matriz [1, 5.2, 4, 0, -1] : "+sumaMatrsi(new double[]{1, 5.2, 4, 0, -1}));
        System.out.println("Matriz [30, 89, 100, 101] : "+sumaMatrsi(new double[]{30, 89, 100, 101}));
    }
}
