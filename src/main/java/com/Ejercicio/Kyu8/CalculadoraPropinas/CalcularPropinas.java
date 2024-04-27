package com.Ejercicio.Kyu8.CalculadoraPropinas;

public class CalcularPropinas {
    public static Integer calculateTip(double amount, String rating) {
        rating = rating.toLowerCase();

        // Calcula el monto de propina según el rating
        switch (rating) {
            case "terrible":
                return (int) Math.ceil(amount * 0);
            case "poor":
                return (int) Math.ceil(amount * 0.05);
            case "good":
                return (int) Math.ceil(amount * 0.10);
            case "great":
                return (int) Math.ceil(amount * 0.15);
            case "excellent":
                return (int) Math.ceil(amount * 0.20);
            default:
                // Devuelve null si el rating no es reconocido
                return null;
        }
    }
}
