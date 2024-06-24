package com.one.core.Assignmentone;

public class Patterntwo {
	
	    public static void main(String[] args) {
	        int rows = 5; 
	        int[] starCounts = {7, 5, 3, 2, 1}; 
	       
	        for (int i = 0; i < rows; i++) {
	           
	            for (int j = 0; j < i; j++) {
	                System.out.print("  ");
	            }

	           
	            for (int k = 0; k < starCounts[i]; k++) {
	                System.out.print("* ");
	            }

	            System.out.println(); 
	        }
	    }
	}


