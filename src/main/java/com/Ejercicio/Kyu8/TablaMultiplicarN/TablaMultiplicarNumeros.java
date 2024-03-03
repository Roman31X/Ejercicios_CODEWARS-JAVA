package com.Ejercicio.Kyu8.TablaMultiplicarN;

public class TablaMultiplicarNumeros {
    public static String multiTable(int num){
        String cadena = "";
        for (int i = 1; i <= 10; i++) {
            int multi = i * num;
            cadena+=i+" * "+num+" = "+multi;
            if(i < 10){
                cadena+="\n";
            }

        }
        return cadena;

        //OtraForma
        /*
        * StringBuilder table = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = i * number;
            table.append(i).append(" * ").append(number).append(" = ").append(result);

            // Agregar nueva línea entre las filas, excepto para la última fila
            if (i < 10) {
                table.append("\n");
            }
        }

        return table.toString();
        * */
    }
}
