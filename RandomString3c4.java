package github_repository;
import java.util.Random;
public class RandomString3c4 {

	

	

	    public static String generateRandomString(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random rand = new Random();
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            int index = rand.nextInt(chars.length());
	            result.append(chars.charAt(index));
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println("Random String: " + generateRandomString(8));
	    }
	}