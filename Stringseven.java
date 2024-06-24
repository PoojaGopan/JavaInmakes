package com.one.core.Assignmenttwo;


	import java.util.Scanner;

	public class Stringseven {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the string:");
	        String inputString = scanner.nextLine();

	        String result = removeFirstLastCharacter(inputString);
	        System.out.println("String after removing first and last characters: " + result);

	        scanner.close();
	    }

	    public static String removeFirstLastCharacter(String inputString) {
	       
	        if (inputString.length() < 2) {
	            return "Cannot remove first and last characters. String has less than 2 characters.";
	        }

	     
	        return inputString.substring(1, inputString.length() - 1);
	    }
	}


