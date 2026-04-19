package github_repository;




import java.util.*;

public class ArrayListExample2 {
    public static void main(String[] args) {

        
        List<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

       
        System.out.println("Original List: " + colors);

        
        colors.remove(1);
        System.out.println("After removing 2nd element: " + colors);

     
        colors.remove("Blue");
        System.out.println("After removing 'Blue': " + colors);
    }
}