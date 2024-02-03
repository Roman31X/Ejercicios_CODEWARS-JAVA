package com.Ejercicio.Kyu6.Catalogar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class CatalogarArticulo {
    public static String catalogo(String s,String article){
        List<String> resultLines = new ArrayList<>();

        // Pattern for extracting product information
        Pattern pattern = Pattern.compile("<prod><name>" + article + "</name>(.*?)</prod>");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            String productInfo = matcher.group(1);

            // Extract price and quantity from product information
            String price = extractInfo(productInfo, "<prx>(.*?)</prx>");
            String quantity = extractInfo(productInfo, "<qty>(.*?)</qty>");

            // Append the result to the list
            resultLines.add(article + " > prx: $" + price + " qty: " + quantity);
        }

        // Check if any matches were found
        return resultLines.isEmpty() ? "Nothing" : String.join("\n", resultLines);
    }
    private static String extractInfo(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find() ? matcher.group(1) : "";
    }
}
