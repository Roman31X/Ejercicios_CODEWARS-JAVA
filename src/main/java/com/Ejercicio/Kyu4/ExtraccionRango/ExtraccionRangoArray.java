package com.Ejercicio.Kyu4.ExtraccionRango;

public class ExtraccionRangoArray {
    public static String rangeExtraction(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int start = arr[0];
        int end = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == end + 1) {
                end = arr[i];
            } else {
                appendRange(result, start, end);
                start = end = arr[i];
            }
        }

        appendRange(result, start, end);

        return result.toString();
    }

    private static void appendRange(StringBuilder result, int start, int end) {
        if (result.length() > 0) {
            result.append(",");
        }

        if (start == end) {
            result.append(start);
        } else if (start == end - 1) {
            result.append(start).append(",").append(end);
        } else {
            result.append(start).append("-").append(end);
        }
    }
}
