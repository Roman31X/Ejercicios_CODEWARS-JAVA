package com.Ejercicio.Kyu6.SumaConsecutivas;

import static com.Ejercicio.Kyu6.SumaConsecutivas.CalculoSumaConsecutiva.sumaConsecutiva;
import java.util.*;

public class TestSumaConsecutiva {
    public static void main(String[] args) {
        System.out.println("Test para suma consecutiva de números enteros en un LIST");
        List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);
        List<Integer> nuevo = sumaConsecutiva(i);
        System.out.println("List[1,4,4,4,0,4,3,3,1] : "+nuevo.toString());
        List<Integer> o = Arrays.asList(-5,-5,7,7,12,0);
        List<Integer> nuevo2 = sumaConsecutiva(o);
        System.out.println("List[-5,-5,7,7,12,0] : "+nuevo2.toString());
    }
}
