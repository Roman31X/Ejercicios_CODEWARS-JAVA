package com.Ejercicio.Kyu7.SistemaContraseña;

public class VerificarContraseñaSistema {
    public static String verificarContrasenia(final int[] key){
        int n = (int) Math.sqrt(key.length);
        // Verificar si la matriz es cuadrada
        if (n * n != key.length) {
            return "No";
        }
        // Verificar simetría respecto al punto central
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int topLeft = key[i * n + j];
                int bottomRight = key[(n - 1 - i) * n + (n - 1 - j)];

                // Si no es simétrico, devolver "No"
                if (topLeft != bottomRight) {
                    return "No";
                }
            }
        }
        // Si pasó todas las verificaciones, devolver "Sí"
        return "Yes";
    }
}
