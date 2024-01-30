package com.Ejercicio.Kyu8.CalculadoraCombustibleTotal;

public class CalculoCostoCombustible {
    public static double litrosPrecio(int litres, double pricePerLitre){
        // Verificar si hay descuento y calcularlo
        double discount = 0.05 * (litres / 2);

        // Limitar el descuento máximo a 25 céntimos por litro
        discount = Math.min(discount, 0.25);

        // Calcular el costo total después del descuento
        double totalCost = litres * (pricePerLitre - discount);

        // Redondear el resultado a 2 decimales
        totalCost = Math.round(totalCost * 100.0) / 100.0;

        return totalCost;
    }
}
