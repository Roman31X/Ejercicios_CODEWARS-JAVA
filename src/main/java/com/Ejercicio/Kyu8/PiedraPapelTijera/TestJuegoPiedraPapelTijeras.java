package com.Ejercicio.Kyu8.PiedraPapelTijera;

import static com.Ejercicio.Kyu8.PiedraPapelTijera.JuegoPiedraPapelTijeras.rps;

public class TestJuegoPiedraPapelTijeras {
    public static void main(String[] args) {
        System.out.println("Dos jugadores P1 y P2 tendran un duelo de PIEDRA - PAPEL O TIJERAS");
        System.out.println("Veremos cuales son los resultados del juego");

        System.out.println("Jugador P1:rock - P2:scissors [GANADOR] : "+rps("rock", "scissors"));
        System.out.println("Jugador P1:scissors - P2:paper [GANADOR] : "+rps("scissors", "paper"));
        System.out.println("Jugador P1:paper - P2:rock [GANADOR] : "+rps("paper", "rock"));

        System.out.println("Jugador P1:scissors - P2:rock [GANADOR] : "+rps("scissors", "rock"));
        System.out.println("Jugador P1:paper - P2:scissors [GANADOR] : "+rps("paper", "scissors"));
        System.out.println("Jugador P1:rock - P2:paper [GANADOR] : "+rps("rock", "paper"));

        System.out.println("Jugador P1:scissors - P2:scissors [GANADOR] : "+rps("scissors", "scissors"));
        System.out.println("Jugador P1:paper - P2:paper [GANADOR] : "+rps("paper", "paper"));
        System.out.println("Jugador P1:rock - P2:rock [GANADOR] : "+rps("rock", "rock"));

    }
}
