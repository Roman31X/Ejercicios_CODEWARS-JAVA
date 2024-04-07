package com.Ejercicio.Kyu6.InversionDeDatos;

import org.junit.Test;
import static com.Ejercicio.Kyu6.InversionDeDatos.OrganizarInversionDeDatos.DataReverse;
import static org.junit.Assert.assertArrayEquals;

public class TestInversionDatos {
    public static void main(String[] args) {
        System.out.println("Test de Inversión de datos");
    }

    @Test
    public void Test1() {
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        int[] data2= {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        assertArrayEquals(data2, DataReverse(data1));
    }

    @Test
    public void Test2() {
        int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
        int[] data2= {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};
        assertArrayEquals(data2, DataReverse(data1));

    }
}
