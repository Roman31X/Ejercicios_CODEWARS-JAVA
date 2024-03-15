package com.Ejercicio.Kyu5.ReduccionDirecciones;

import org.junit.Test;
import static com.Ejercicio.Kyu5.ReduccionDirecciones.DireccionReducida.dirReduc;
import static org.junit.Assert.*;

public class TestReduccionDireccion {

    public static void main(String[] args) {
        System.out.println("Test de Reducción de Direcciones");
    }

    @Test
    public void testSimpleDirReduc() {
        assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
                new String[]{},
                dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
    }
}
