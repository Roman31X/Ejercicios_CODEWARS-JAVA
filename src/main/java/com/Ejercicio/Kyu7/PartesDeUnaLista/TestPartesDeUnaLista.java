package com.Ejercicio.Kyu7.PartesDeUnaLista;

import static com.Ejercicio.Kyu7.PartesDeUnaLista.DividirActividadesListas.partlist;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPartesDeUnaLista {
    public static void main(String[] args) {
        System.out.println("Test Division de tareas de ua lista");
    }
    private static void testing(String[][] actual, String[][] expected) {
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests partlist");
        String[] s1;
        String[][] a;

        s1 = new String[] {"cdIw", "tzIy", "xDu", "rThG"};
        a = new String[][] {{"cdIw", "tzIy xDu rThG"}, {"cdIw tzIy", "xDu rThG"}, {"cdIw tzIy xDu", "rThG"}};
        testing(partlist(s1), a);

        s1 = new String[] {"I", "wish", "I", "hadn't", "come"};
        a = new String[][] {{"I", "wish I hadn't come"}, {"I wish", "I hadn't come"}, {"I wish I", "hadn't come"}, {"I wish I hadn't", "come"}};
        testing(partlist(s1), a);

        s1 = new String[] {"vJQ", "anj", "mQDq", "sOZ"};
        a = new String[][] {{"vJQ", "anj mQDq sOZ"}, {"vJQ anj", "mQDq sOZ"}, {"vJQ anj mQDq", "sOZ"}};
        testing(partlist(s1), a);
    }
}
