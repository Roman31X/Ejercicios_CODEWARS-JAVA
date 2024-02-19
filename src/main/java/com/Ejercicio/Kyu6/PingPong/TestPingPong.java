package com.Ejercicio.Kyu6.PingPong;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.Ejercicio.Kyu6.PingPong.JuegoPingPong.pingPong;

public class TestPingPong {
    public static void main(String[] args) {
        System.out.println("Test para juego de ping pong");
        String rallySounds = "ping-pong-plop-ping-pong-ping-pong-ping-pong-ping-pong-thud-ting-bing-pong-ping-pong-ping-pang";
        String winner = pingPong(rallySounds);
        System.out.println("The winner is: " + winner);
    }
    @Test
    public void ping() {
        String noises = "ping-pong-ping-pong-bonk-bing-doof";
        assertEquals("ping", pingPong(noises));
    }

    @Test
    public void pong() {
        String noises = "pong-ping-dong-ping-pong-tink-bonk-pong-ping-doof";
        assertEquals("pong", pingPong(noises));
    }

    @Test
    public void draw() {
        String noises = "pong-ping-bink-ping-pong-donk";
        assertEquals("ping", pingPong(noises));
    }

}
