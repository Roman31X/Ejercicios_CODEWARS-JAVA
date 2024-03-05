package com.Ejercicio.Kyu4.DosVecesLineal;

import java.util.*;

public class CalculoDobleLineal {
    public static int dblLinear (int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);

        for (int i = 0; i < n; i++) {
            int min = pq.poll();

            while (!pq.isEmpty() && pq.peek() == min) {
                pq.poll(); // Skip duplicates
            }

            pq.add(2 * min + 1);
            pq.add(3 * min + 1);
        }

        return pq.peek();
    }
}
