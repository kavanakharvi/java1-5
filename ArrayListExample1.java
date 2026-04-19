package github_repository;

import java.util.*;

public class ArrayListExample1 {
    public static void main(String[] args) {
        
    
        List<String> colors = new ArrayList<>();
        
        
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("White");
        
       
        System.out.println("List of Colors: " + colors);
        
        
        if (colors.contains("Red")) {
            System.out.println("Red color is available in the list.");
        } else {
            System.out.println("Red color is NOT available in the list.");
        }
    }
}