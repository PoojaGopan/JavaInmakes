package com.one.core.Assignmentone;


	import java.util.Scanner;

	public class Swap {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the first number:");
	        int a = scanner.nextInt();
	        System.out.println("Enter the second number:");
	        int b = scanner.nextInt();
	        
	        System.out.println("Before swapping: a = " + a + ", b = " + b);
	        
	     
	        a = a + b;
	        b = a - b;
	        a = a - b;
	        
	       
	        
	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    }
	}
