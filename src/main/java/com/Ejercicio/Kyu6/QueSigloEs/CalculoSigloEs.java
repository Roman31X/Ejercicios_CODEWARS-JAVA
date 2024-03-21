package com.Ejercicio.Kyu6.QueSigloEs;

public class CalculoSigloEs {
    public static String whatCentury(int year) {
        int century = year / 100 + (year % 100 > 0 ? 1 : 0);

        String suffix;
        if (century % 100 >= 11 && century % 100 <= 13) {
            suffix = "th";
        } else if (century % 10 == 1) {
            suffix = "st";
        } else if (century % 10 == 2) {
            suffix = "nd";
        } else if (century % 10 == 3) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        return century + suffix;
    }
}
