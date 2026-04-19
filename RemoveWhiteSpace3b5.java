package github_repository;

public class RemoveWhiteSpace3b5 {



	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s", "");
	    }

	    public static void main(String[] args) {
	        String input = "Java Programming Language";
	        System.out.println("Without spaces: " + removeWhitespace(input));
	    }
	}