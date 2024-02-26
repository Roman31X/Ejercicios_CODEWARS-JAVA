package com.Ejercicio.Kyu6.DameUnDiamante;

public class GenerarDiamanteString {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) {
            return null;
        }

        StringBuilder diamond = new StringBuilder();

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                diamond.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                diamond.append("*");
            }
            diamond.append("\n");
        }

        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n / 2 - i; j++) {
                diamond.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                diamond.append("*");
            }
            diamond.append("\n");
        }

        return diamond.toString();
    }
}
