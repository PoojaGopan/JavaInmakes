package com.one.core.Assignmenttwo;

public class Stringthree {

	    public static void main(String[] args) {
	        String inputString = "I am a developer";
	        String reversedString = reverseWords(inputString);
	        System.out.println(reversedString);
	    }

	    public static String reverseWords(String str) {
	        String[] words = str.split(" "); 
	        StringBuilder reversedString = new StringBuilder();

	        
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedString.append(words[i]).append(" "); 
	        }

	        return reversedString.toString().trim(); 
	    }
	}


