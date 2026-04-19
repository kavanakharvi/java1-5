package github_repository;

public class CheckNumeric3c3 {

	

	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;

	        for (char ch : str.toCharArray()) {
	            if (!Character.isDigit(ch)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String input = "12345";

	        if (isNumeric(input)) {
	            System.out.println("String is numeric");
	        } else {
	            System.out.println("String is not numeric");
	        }
	    }
	}