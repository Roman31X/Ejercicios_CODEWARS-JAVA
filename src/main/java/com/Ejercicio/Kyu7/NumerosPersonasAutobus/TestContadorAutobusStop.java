package com.Ejercicio.Kyu7.NumerosPersonasAutobus;

import org.junit.Test;

import java.util.ArrayList;

import static com.Ejercicio.Kyu7.NumerosPersonasAutobus.ContarPersonasAutobus.contarPersonas;
import static junit.framework.TestCase.assertEquals;

public class TestContadorAutobusStop {
    public static void main(String[] args) {
        System.out.println("Test para número de personas en el autobús");
    }

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, contarPersonas(list));
    }
}
