package github_repository;
import java.util.*;
public class program2a {

	

	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String1: " + str1);
	        System.out.println("String2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("\nLength of str1: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("\nEquals: " + str1.equals(str3));
	        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        String sentence = "Java Programming Language";
	        System.out.println("\nIndex of 'Program': " + sentence.indexOf("Program"));
	        System.out.println("Contains 'Java'? " + sentence.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("\nSubstring (0-4): " + sentence.substring(0, 4));

	        // 6. String Modification
	        String modified = sentence.replace("Java", "Advanced Java");
	        System.out.println("\nModified String: " + modified);

	        // 7. Whitespace Handling
	        String spaced = "   Hello Java   ";
	        System.out.println("\nBefore Trim: '" + spaced + "'");
	        System.out.println("After Trim: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String concat = str1 + " " + str2;
	        System.out.println("\nConcatenated String: " + concat);

	        // 9. String Splitting
	        String data = "Red,Blue,Green";
	        String[] colors = data.split(",");
	        System.out.println("\nSplitted Strings:");
	        for (String c : colors) {
	            System.out.println(c);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(4, " Language");
	        System.out.println("\nStringBuilder Result: " + sb);

	        // 11. String Formatting
	        int marks = 90;
	        String formatted = String.format("Marks: %d", marks);
	        System.out.println("\nFormatted String: " + formatted);

	        // 12. Validate Email using contains, startsWith, endsWith
	        String email = "example@gmail.com";

	        if (email.contains("@") && 
	            email.endsWith(".com") && 
	            !email.startsWith("@")) {

	            System.out.println("\nValid Email");
	        } else {
	            System.out.println("\nInvalid Email");
	        }
	    }
	}