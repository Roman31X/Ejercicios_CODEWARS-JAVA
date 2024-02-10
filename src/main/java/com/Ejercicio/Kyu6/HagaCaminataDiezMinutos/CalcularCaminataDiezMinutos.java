package com.Ejercicio.Kyu6.HagaCaminataDiezMinutos;

public class CalcularCaminataDiezMinutos {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            // Si el tamaño del array no es exactamente 10, entonces el recorrido no tomará 10 minutos.
            return false;
        }

        int vertical = 0;  // N-S
        int horizontal = 0;  // E-W

        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    vertical++;
                    break;
                case 's':
                    vertical--;
                    break;
                case 'e':
                    horizontal++;
                    break;
                case 'w':
                    horizontal--;
                    break;
                default:
                    return false;
            }
        }
        return vertical == 0 && horizontal == 0;
    }
}
