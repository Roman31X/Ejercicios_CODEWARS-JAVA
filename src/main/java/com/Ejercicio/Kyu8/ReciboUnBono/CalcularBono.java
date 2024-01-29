package com.Ejercicio.Kyu8.ReciboUnBono;

public class CalcularBono {
    public static String calcularBonificacion(final int salary, final boolean bonus){
        int bono = (bonus)?salary*10:salary;
        return "\u00A3"+String.valueOf(bono);
    }
}
