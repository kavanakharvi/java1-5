package github_repository;

public class TruncateString3c2 {



	    public static String truncate(String str, int maxLength) {
	        if (str.length() <= maxLength) {
	            return str;
	        }
	        return str.substring(0, maxLength) + "...";
	    }

	    public static void main(String[] args) {
	        String input = "Java Programming is very interesting";
	        System.out.println("Truncated: " + truncate(input, 10));
	    }
	}
