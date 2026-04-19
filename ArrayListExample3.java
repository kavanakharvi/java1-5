package github_repository;
import java.util.*;
public class ArrayListExample3 {

	    public static void main(String[] args) {

	        List<String> colors = new ArrayList<>();

	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("White");

	        System.out.println("Before Sorting: " + colors);

	        // Sorting the list
	        Collections.sort(colors);

	        System.out.println("After Sorting: " + colors);
	    }
	}