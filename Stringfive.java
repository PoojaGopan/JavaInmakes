package com.one.core.Assignmenttwo;

public class Stringfive {
	
	    public static void main(String[] args) {
	        String inputString = "Hello World";
	        int vowelCount = countVowels(inputString);
	        System.out.println("Number of vowels: " + vowelCount);
	    }

	    public static int countVowels(String str) {
	        int count = 0;

	       
	        str = str.toLowerCase();

	   
	        for (char c : str.toCharArray()) {
	          
	            if (isVowel(c)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static boolean isVowel(char c) {
	        
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }
	}


