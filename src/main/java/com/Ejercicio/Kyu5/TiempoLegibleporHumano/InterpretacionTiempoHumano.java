package com.Ejercicio.Kyu5.TiempoLegibleporHumano;

public class InterpretacionTiempoHumano {
    public static String makeReadable(int seconds) {
        if (seconds < 0 || seconds > 359999) {
            throw new IllegalArgumentException("Invalid input. Seconds should be a non-negative integer less than or equal to 359999.");
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}
