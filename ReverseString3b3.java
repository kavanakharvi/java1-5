package github_repository;

public class ReverseString3b3 {



	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String input = "Java";
	        System.out.println("Reversed: " + reverseString(input));
	    }
	}