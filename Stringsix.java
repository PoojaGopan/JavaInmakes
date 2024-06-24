package com.one.core.Assignmenttwo;


	import java.util.Scanner;

	public class Stringsix {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the string:");
	        String inputString = scanner.nextLine();

	        System.out.println("Enter the word to remove:");
	        String wordToRemove = scanner.nextLine();

	        String result = removeWordFromString(inputString, wordToRemove);
	        System.out.println("String after removing the word: " + result);

	        scanner.close();
	    }

	    public static String removeWordFromString(String inputString, String wordToRemove) {
	        
	        String[] words = inputString.split("\\s+");

	       
	        StringBuilder resultBuilder = new StringBuilder();

	        
	        for (String word : words) {
	            
	            if (!word.equals(wordToRemove)) {
	                resultBuilder.append(word).append(" ");
	            }
	        }

	      
	        String result = resultBuilder.toString().trim();

	        return result;
	    }
	}


