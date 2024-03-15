package com.Ejercicio.Kyu5.ReduccionDirecciones;

import java.util.*;

public class DireccionReducida {
    public static String[] dirReduc(String[] arr) {
        Stack<String> stack = new Stack<>();

        for (String direction : arr) {
            if (!stack.isEmpty() && isOpposite(stack.peek(), direction)) {
                stack.pop();
            } else {
                stack.push(direction);
            }
        }

        String[] result = new String[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    private static boolean isOpposite(String dir1, String dir2) {
        return (dir1.equals("NORTH") && dir2.equals("SOUTH")) ||
                (dir1.equals("SOUTH") && dir2.equals("NORTH")) ||
                (dir1.equals("WEST") && dir2.equals("EAST")) ||
                (dir1.equals("EAST") && dir2.equals("WEST"));
    }
}
