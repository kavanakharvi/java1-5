package github_repository;
import java.util.*;
public class ArrayListExample5 {


    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

        System.out.println("Original List: " + colors);

        
        int n = 3;
        colors.remove(n - 1);

        System.out.println("After removing " + n + "th element: " + colors);
    }
}