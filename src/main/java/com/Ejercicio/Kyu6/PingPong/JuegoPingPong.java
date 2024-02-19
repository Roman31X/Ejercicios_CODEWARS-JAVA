package com.Ejercicio.Kyu6.PingPong;

public class JuegoPingPong {
    public static String pingPong(String sounds){
        String[] sonido = sounds.split("-");
        String currentServer = "ping";
        String lastGoodSound = "";

        for (String sound : sonido) {
            System.out.println(sound);
            if (sound.equals("ping") || sound.equals("pong")) {
                lastGoodSound = sound;
                if (currentServer.equals("ping")) {
                    currentServer = "pong";
                } else {
                    currentServer = "ping";
                }
            }
        }

        return lastGoodSound.equals("ping") ? "pong" : "ping";
    }
}
