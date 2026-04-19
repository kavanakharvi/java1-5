package github_repository;

public class palindromeCheck3b4 {


	    public static boolean isPalindrome(String str) {
	        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String input = "Madam";
	        
	        if (isPalindrome(input)) {
	            System.out.println(" it is Palindrome ");
	        } else {
	            System.out.println("Not a Palindrome");
	        }
	    }
	}