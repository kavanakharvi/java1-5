package github_repository;

public class WordCount3c5 {


	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }

	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String input = "Java is easy to learn";
	        System.out.println("Word count: " + countWords(input));
	    }
	}