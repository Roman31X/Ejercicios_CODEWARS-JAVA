package com.Ejercicio.Kyu6.Bolos;

public class JuegoBolos {
    public static String bolosPinos(int[] arr){
        char[][] pins = {
                {'I', ' ', 'I', ' ', 'I', ' ', 'I'},
                {' ', 'I', ' ', 'I', ' ', 'I', ' '},
                {' ', ' ', 'I', ' ', 'I', ' ', ' '},
                {' ', ' ', ' ', 'I', ' ', ' ', ' '},
                {' ', ' ', ' ', 'I', ' ', ' ', ' '},
        };

        for (int pin : arr) {
            int row = (pin - 1) / 4;
            int col = (pin - 1) % 4 * 2 + (row % 2 == 0 ? 2 : 1);
            pins[row][col] = ' ';
        }
        StringBuilder result = new StringBuilder();
        for (char[] row : pins) {
            for (char pin : row) {
                result.append(pin);
            }
            result.append('\n');
            System.out.println(row);
        }

        return result.toString();
    }
}
