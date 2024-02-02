package com.Ejercicio.Kyu8.EstasTocandoBanjo;

import static com.Ejercicio.Kyu8.EstasTocandoBanjo.EstaTocandoBanjoR.elEstaTocando;

public class TestVerificarSiREstaTocandoBanjo {
    public static void main(String[] args) {
        System.out.println("Test si tu nombre empieza con R o r minúscula estas tocando el bajo");
        System.out.println("Nombre [Diego] : "+elEstaTocando("Diego"));
        System.out.println("Nombre [Rogelio] : "+elEstaTocando("Rogelio"));
        System.out.println("Nombre [rolf] : "+elEstaTocando("rolf"));
        System.out.println("Nombre [Rikke] : "+elEstaTocando("Rikke"));
    }
}
