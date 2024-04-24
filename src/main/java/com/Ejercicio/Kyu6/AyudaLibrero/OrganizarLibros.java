package com.Ejercicio.Kyu6.AyudaLibrero;

import java.util.HashMap;

public class OrganizarLibros {
    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";

        // Create a HashMap to store the sum of quantities for each category
        HashMap<String, Integer> categorySum = new HashMap<>();

        // Initialize the sum for each category to 0
        for (String category : lstOf1stLetter) {
            categorySum.put(category, 0);
        }

        // Iterate through the list of books
        for (String book : lstOfArt) {
            String[] parts = book.split(" "); // Split the book code and quantity
            String code = parts[0]; // Extract the book code
            int quantity = Integer.parseInt(parts[1]); // Extract the quantity

            // Extract the category from the book code
            String category = code.substring(0, 1);

            // Update the sum for the corresponding category
            if (categorySum.containsKey(category)) {
                int sum = categorySum.get(category);
                categorySum.put(category, sum + quantity);
            }
        }

        // Construct the result string
        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            int sum = categorySum.get(category);
            result.append("(").append(category).append(" : ").append(sum).append(") - ");
        }

        // Remove the last " - " from the result string
        result.delete(result.length() - 3, result.length());

        return result.toString();
    }
}
