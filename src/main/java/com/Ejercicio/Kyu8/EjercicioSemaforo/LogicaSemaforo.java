package com.Ejercicio.Kyu8.EjercicioSemaforo;

public class LogicaSemaforo {
    public static String actualizarLuz(String current){
        return (current.equals("green"))?"yellow":
                (current.equals("yellow"))?"red":"green";
    }
}
