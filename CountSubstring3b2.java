package github_repository;

public class CountSubstring3b2 {

	

	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0, index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        String mainStr = "java is java and java is fun";
	        String subStr = "java";

	        int result = countOccurrences(mainStr, subStr);
	        System.out.println("Occurrences: " + result);
	    }
	}