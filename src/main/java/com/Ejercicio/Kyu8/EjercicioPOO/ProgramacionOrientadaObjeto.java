package com.Ejercicio.Kyu8.EjercicioPOO;

public class ProgramacionOrientadaObjeto {

    private final double draft;
    private final int crew;

    public ProgramacionOrientadaObjeto(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        double totalWeight = draft - (crew * 1.5);
        return totalWeight > 20;
    }
}
