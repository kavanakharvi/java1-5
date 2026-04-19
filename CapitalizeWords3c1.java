package github_repository;

public class CapitalizeWords3c1 {

	

	    public static String capitalizeWords(String str) {
	        String[] words = str.toLowerCase().split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1))
	                      .append(" ");
	            }
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String input = "java programming language";
	        System.out.println("Capitalized: " + capitalizeWords(input));
	    }
	}