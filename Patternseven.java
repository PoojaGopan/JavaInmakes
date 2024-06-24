package com.one.core.Assignmentone;

public class Patternseven {
	
	    public static void main(String[] args) {
	        int rows = 6;
	        int number = 1; 

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(number + " ");
	                number++;
	            }
	            System.out.println(); 
	        }
	    }
	}


