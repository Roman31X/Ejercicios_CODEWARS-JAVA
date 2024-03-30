package com.Ejercicio.Kyu6.SigueEseEspia;

import org.junit.Test;

import static com.Ejercicio.Kyu6.SigueEseEspia.PersigueEseEspia.findRoutes;
import static org.junit.Assert.assertEquals;

public class TestSigueAeseEspia {
    public static void main(String[] args) {
        System.out.println("Test Sigue a ese espia");
    }

    @Test
    public void spyRoutes() {
        assertEquals("MNL, TAG, CEB, TAC, BOR",
                findRoutes(new String[][]{{"MNL", "TAG"}, {"CEB", "TAC"}, {"TAG", "CEB"}, {"TAC", "BOR"}}));
        assertEquals("Halifax, Montreal, Toronto, Chicago, Winnipeg, Seattle",
                findRoutes(new String[][]{{"Chicago", "Winnipeg"}, {"Halifax", "Montreal"}, {"Montreal", "Toronto"}, {"Toronto", "Chicago"}, {"Winnipeg", "Seattle"}}));

    }

}
