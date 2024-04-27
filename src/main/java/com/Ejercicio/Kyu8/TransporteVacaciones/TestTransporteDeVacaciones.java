package com.Ejercicio.Kyu8.TransporteVacaciones;

import org.junit.Test;

import static com.Ejercicio.Kyu8.TransporteVacaciones.PrecioTransporteVacaciones.rentalCarCost;
import static org.junit.Assert.assertEquals;

public class TestTransporteDeVacaciones {
    public static void main(String[] args) {
        System.out.println("Test Transporte en vacaciones presupuesto");
    }
    @Test
    public void under3Tests() {
        assertEquals(40, rentalCarCost(1));
        assertEquals(80, rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, rentalCarCost(3));
        assertEquals(140, rentalCarCost(4));
        assertEquals(180, rentalCarCost(5));
        assertEquals(220, rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, rentalCarCost(7));
        assertEquals(270, rentalCarCost(8));
        assertEquals(310, rentalCarCost(9));
        assertEquals(350, rentalCarCost(10));
    }
}
