package com.Ejercicio.Kyu8.CalcularIMC;

public class CalculoDeIMC {
    public static String BMI(double weight, double height){
        double bmi = (weight/Math.pow(height,2));
        return (bmi <= 18.5)?"Underweight":(bmi <= 25.0)?"Normal":(bmi <= 30.0)?"Overweight":"Obese";
    }
}
