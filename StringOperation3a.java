package github_repository;
import java.util.*;
public class StringOperation3a {
    public static void main(String[] args) {

        // 1. String Creation
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // 2. Length & Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        System.out.println("Index of 'l': " + str1.indexOf('l'));
        System.out.println("Contains 'He': " + str1.contains("He"));

        // 5. Substring
        System.out.println("Substring (1,4): " + str1.substring(1, 4));

        // 6. String Modification
        String mod = str1.replace('l', 'x');
        System.out.println("Replace l with x: " + mod);

        // 7. Whitespace Handling
        String str4 = "   Java Programming   ";
        System.out.println("Trimmed: '" + str4.trim() + "'");

        // 8. Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated: " + concat);

        // 9. Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        System.out.println("StringBuilder result: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d", "Kavana", 20);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation (basic)
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email Format");
        } else {
            System.out.println("Invalid Email Format");
        }
    }
}