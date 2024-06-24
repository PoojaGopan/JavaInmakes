package com.one.core.Assignmentthree;

public class Arraysev {
	
	    public static void main(String[] args) {
	        int[] numbers = {10, 21, 4, 45, 66, 93, 22, 31, 40, 55};
	        
	        System.out.println("Even numbers:");
	        for (int number : numbers) {
	            if (number % 2 == 0) {
	                System.out.print(number + " ");
	            }
	        }
	        
	        System.out.println("\nOdd numbers:");
	        for (int number : numbers) {
	            if (number % 2 != 0) {
	                System.out.print(number + " ");
	            }
	        }
	    }
	}


