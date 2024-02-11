package com.Ejercicio.Kyu6.Bolos;

public class JuegoBolos {
    public static String bolosPinos(int[] arr){
        StringBuilder field = new StringBuilder(
                "I I I I\n" +
                " I I I \n" +
                "  I I  \n" +
                "   I   ");
        for (int pin : arr) {
            switch (pin) {
                case 1:
                    field.setCharAt(27, ' ');
                    break;
                case 2:
                    field.setCharAt(18, ' ');
                    break;
                case 3:
                    field.setCharAt(20, ' ');
                    break;
                case 4:
                    field.setCharAt(9, ' ');
                    break;
                case 5:
                    field.setCharAt(11, ' ');
                    break;
                case 6:
                    field.setCharAt(13, ' ');
                    break;
                case 7:
                    field.setCharAt(0, ' ');
                    break;
                case 8:
                    field.setCharAt(2, ' ');
                    break;
                case 9:
                    field.setCharAt(4, ' ');
                    break;
                case 10:
                    field.setCharAt(6, ' ');
                    break;
            }
        }

        return field.toString();
    }
}
