package TestScripts;

import java.util.Random;

public class random {
	
	
	    public static void main(String[] args) {
	        // Generate a random alphanumeric string of length 10
	    	String randomString = generateRandomString(4);
	  
	    	System.out.println(randomString);
	   
	    }

	    public static String generateRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder stringBuilder = new StringBuilder(length);

	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(characters.length());
	            stringBuilder.append(characters.charAt(randomIndex));
	        }

	        return stringBuilder.toString();
	    }
	}



