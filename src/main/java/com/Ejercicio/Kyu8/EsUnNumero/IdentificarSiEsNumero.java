package com.Ejercicio.Kyu8.EsUnNumero;

public class IdentificarSiEsNumero {
    public boolean isDigit(String s)
    {
        try {
            Double.parseDouble(s.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
