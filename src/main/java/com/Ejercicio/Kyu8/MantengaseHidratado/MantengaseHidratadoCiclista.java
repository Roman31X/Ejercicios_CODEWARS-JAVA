package com.Ejercicio.Kyu8.MantengaseHidratado;

public class MantengaseHidratadoCiclista {
    public int litros(double time){
        String numero = String.valueOf(time);
        String nuevo = "";
        if(time < 1){
            return 0;
        }else{
            for (int i = 0; i < numero.length(); i++) {
                if(numero.charAt(i) != '.'){
                    nuevo += numero.charAt(i);
                }else{
                    break;
                }
            }
            return (int) (Integer.parseInt(nuevo)*0.5);
        }

        /**MAS COMPACTO
         * return (int) (time * 0.5);
        */
    }
}
