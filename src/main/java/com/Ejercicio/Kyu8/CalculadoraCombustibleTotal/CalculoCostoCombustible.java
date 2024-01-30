package com.Ejercicio.Kyu8.CalculadoraCombustibleTotal;

public class CalculoCostoCombustible {
    public static double litrosPrecio(int litres, double pricePerLitre){
        final int discountThreshold = 2;
        final double maxDiscount = 0.25;

        int discount = litres / discountThreshold * 5;
        discount = Math.min(discount, (int) (pricePerLitre * maxDiscount * 100));

        double totalCost = litres * pricePerLitre - discount / 100.0;

        return Math.round(totalCost * 100.0) / 100.0;
    }
}
