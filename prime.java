package com.one.core.Assignmentone;


	import java.util.Scanner;

	public class prime {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	     
	        System.out.println("Enter the lower limit:");
	        int lowerLimit = scanner.nextInt();
	        System.out.println("Enter the upper limit:");
	        int upperLimit = scanner.nextInt();
	        
	        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are:");
	        
	       
	        for (int number = lowerLimit; number <= upperLimit; number++) {
	            if (isPrime(number)) {
	                System.out.print(number + " ");
	            }
	        }
	    }
	    
	   
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}


