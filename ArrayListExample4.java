package github_repository;
import java.util.*;
public class ArrayListExample4 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

        System.out.println("Original List: " + colors);

        
        List<String> sub = colors.subList(0, 2);

        System.out.println("Extracted Elements (1st & 2nd): " + sub);
    }
}