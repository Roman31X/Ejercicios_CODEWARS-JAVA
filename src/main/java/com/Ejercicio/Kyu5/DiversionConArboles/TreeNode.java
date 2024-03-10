package com.Ejercicio.Kyu5.DiversionConArboles;

import java.util.*;

public class TreeNode {

    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    TreeNode(int value) {
        this(value, null, null);
    }

    static TreeNode arrayToTree(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < array.length; i += 2) {
            TreeNode current = queue.poll();

            if (i < array.length) {
                current.left = new TreeNode(array[i]);
                queue.offer(current.left);
            }

            if (i + 1 < array.length) {
                current.right = new TreeNode(array[i + 1]);
                queue.offer(current.right);
            }
        }

        return root;
    }
}
