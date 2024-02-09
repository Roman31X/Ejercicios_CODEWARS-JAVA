package com.Ejercicio.Kyu7.PromedioDeNumeros;

public class CalcularPromedioNumeros {
    public static double[] averages(int[] numbers){
        if (numbers == null || numbers.length <= 1) {
            return new double[0];
        }
        double[] averages = new double[numbers.length - 1];

        for (int i = 0; i < numbers.length - 1; i++) {
            averages[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
        }
        return averages;
    }
}
