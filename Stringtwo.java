package com.one.core.Assignmenttwo;

public class Stringtwo {

	    public static void main(String[] args) {
	        String input = "Hello World";
	        
	        String uppercase = convertToUppercase(input);
	        System.out.println("Uppercase: " + uppercase);
	        
	        String lowercase = convertToLowercase(input);
	        System.out.println("Lowercase: " + lowercase);
	    }
	    
	    public static String convertToUppercase(String input) {
	        char[] chars = input.toCharArray();
	        
	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] >= 'a' && chars[i] <= 'z') {
	                chars[i] = (char)(chars[i] - 'a' + 'A');
	            }
	        }
	        
	        return new String(chars);
	    }
	    
	    public static String convertToLowercase(String input) {
	        char[] chars = input.toCharArray();
	        
	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] >= 'A' && chars[i] <= 'Z') {
	                chars[i] = (char)(chars[i] - 'A' + 'a');
	            }
	        }
	        
	        return new String(chars);
	    }
	}


