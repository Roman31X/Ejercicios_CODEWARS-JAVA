package com.Ejercicio.Kyu8.EstablecerAlarma;

import static com.Ejercicio.Kyu8.EstablecerAlarma.EstablecerAlarma.setAlarm;

public class TestEstablecerAlarma {
    public static void main(String[] args) {
        System.out.println("Test para saber si tendré vacaciones o no");
        System.out.println("[EMPLOYED] - [VACATION]");
        System.out.println("[True - True] ¿Tendré vacaciones? : "+setAlarm(true, true));
        System.out.println("[True - False] ¿Tendré vacaciones? : "+setAlarm(true, false));
        System.out.println("[False - True] ¿Tendré vacaciones? : "+setAlarm(false, true));
        System.out.println("[False - False] ¿Tendré vacaciones? : "+setAlarm(false, false));
    }
}
