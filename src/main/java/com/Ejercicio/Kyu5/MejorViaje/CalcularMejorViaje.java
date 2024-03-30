package com.Ejercicio.Kyu5.MejorViaje;

import java.util.*;

public class CalcularMejorViaje {
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        return chooseBestSumHelper(t, k, ls, 0, 0);
    }

    private static Integer chooseBestSumHelper(int t, int k, List<Integer> ls, int index, int currentSum) {
        if (k == 0) {
            return currentSum <= t ? currentSum : null;
        }
        if (index == ls.size()) {
            return null;
        }

        Integer includeCurrent = chooseBestSumHelper(t, k - 1, ls, index + 1, currentSum + ls.get(index));
        Integer excludeCurrent = chooseBestSumHelper(t, k, ls, index + 1, currentSum);

        if (includeCurrent == null) {
            return excludeCurrent;
        }
        if (excludeCurrent == null) {
            return includeCurrent;
        }
        return Math.max(includeCurrent, excludeCurrent);
    }
}
