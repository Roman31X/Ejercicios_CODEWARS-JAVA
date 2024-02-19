package com.Ejercicio.Kyu6.PingPong;

public class JuegoPingPong {
    public static String pingPong(String sounds){
        String[] rallySounds = sounds.split("-");
        String currentServer = "ping";
        String lastGoodSound = "";
        String lastBadSound = "";

        for (String sound : rallySounds) {
            if (sound.equals("ping") || sound.equals("pong")) {
                lastGoodSound = sound;
                if (currentServer.equals("ping")) {
                    currentServer = "pong";
                } else {
                    currentServer = "ping";
                }
            } else {
                lastBadSound = sound;
            }
        }

        if (!lastBadSound.isEmpty()) {
            return lastGoodSound.equals("ping") ? "pong" : "ping";
        }

        return currentServer;
    }
}
