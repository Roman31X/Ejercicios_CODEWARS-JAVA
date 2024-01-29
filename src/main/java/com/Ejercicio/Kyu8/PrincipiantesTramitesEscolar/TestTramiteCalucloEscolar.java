package com.Ejercicio.Kyu8.PrincipiantesTramitesEscolar;

import static com.Ejercicio.Kyu8.PrincipiantesTramitesEscolar.CalculoEscolar.papelEscolar;

public class TestTramiteCalucloEscolar {
    public static void main(String[] args) {
        System.out.println("Test calculo de hojas para estudiantes");
        System.out.println("Persona - Copias [5,5] : "+papelEscolar(5,5));
        System.out.println("Persona - Copias [-5,5] : "+papelEscolar(-5,5));
    }
}
