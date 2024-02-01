package com.Ejercicio.Kyu6.ConstruirTorre;

public class ConstruirTorre {
    public static String[] construirTorre(int nFloors){
        String[] tower = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            int stars = 2 * i + 1;
            int spaces = nFloors - i - 1;
            StringBuilder floor = new StringBuilder();

            for (int j = 0; j < spaces; j++) {
                floor.append(" ");
            }

            for (int j = 0; j < stars; j++) {
                floor.append("*");
            }

            for (int j = 0; j < spaces; j++) {
                floor.append(" ");
            }
            tower[i] = floor.toString();
        }

        return tower;
    }
}
