package com.one.core.Assignmentthree;


	import java.util.Arrays;

	public class Arrayei {
	    public static int[] removeElement(int[] arr, int elementToRemove) {
	        // Count occurrences of the element to be removed
	        int count = 0;
	        for (int num : arr) {
	            if (num == elementToRemove) {
	                count++;
	            }
	        }
	        
	        // Create a new array of the appropriate size
	        int[] newArr = new int[arr.length - count];
	        int index = 0;
	        
	        // Copy elements to the new array, excluding the element to be removed
	        for (int num : arr) {
	            if (num != elementToRemove) {
	                newArr[index++] = num;
	            }
	        }
	        
	        return newArr;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 3, 6, 3};
	        int elementToRemove = 3;
	        
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        
	        int[] newArr = removeElement(arr, elementToRemove);
	        
	        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArr));
	    }
	}

