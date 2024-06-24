package com.one.core.Assignmentthree;

public class Arrayten {
	
	    public static void main(String[] args) {
	        // Define two matrices
	        int[][] A = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };
	        
	        int[][] B = {
	            {7, 8},
	            {9, 10},
	            {11, 12}
	        };
	        
	        // Check if the matrices can be multiplied
	        if (A[0].length != B.length) {
	            System.out.println("The matrices cannot be multiplied.");
	            return;
	        }
	        
	        // Multiply the matrices
	        int[][] C = multiplyMatrices(A, B);
	        
	        // Print the resulting matrix
	        System.out.println("Resulting Matrix:");
	        for (int[] row : C) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
	        int m = A.length;    // Number of rows in A
	        int n = A[0].length; // Number of columns in A
	        int p = B[0].length; // Number of columns in B
	        
	        int[][] C = new int[m][p]; // Resulting matrix
	        
	        // Perform matrix multiplication
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < p; j++) {
	                for (int k = 0; k < n; k++) {
	                    C[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }
	        
	        return C;
	    }
	}


