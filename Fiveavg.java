package com.one.core.Assignmentone;


	import java.util.Scanner;
	public class Fiveavg {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	 
	        System.out.println("Enter 5 numbers:");

	        double sum = 0; 

	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            double number = scanner.nextDouble();
	            sum += number; 
	        }

	        
	        double average = sum / 5;

	       
	        System.out.println("The average of the entered numbers is: " + average);

	       
	        scanner.close();
	    }
	}


