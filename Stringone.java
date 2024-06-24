package com.one.core.Assignmenttwo;

public class Stringone {
	
	    public static void main(String[] args) {
	        String input = "75#41*";
	        String output = extractDigits(input);
	        System.out.println("Output: " + output);
	    }
	    
	    public static String extractDigits(String input) {
	        StringBuilder result = new StringBuilder();
	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isDigit(ch)) {
	                result.append(ch);
	            }
	        }
	        
	        return result.toString();
	    }
	}

