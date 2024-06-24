package com.one.core.Assignmentthree;


	import java.util.Arrays;

	public class Arrayni {
	    public static int[] insertElement(int[] arr, int element, int index) {
	        // Check if the index is within the bounds of the array
	        if (index < 0 || index > arr.length) {
	            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
	        }
	        
	        // Create a new array with one more element than the original array
	        int[] newArr = new int[arr.length + 1];
	        
	        // Copy elements from the original array to the new array
	        for (int i = 0, j = 0; i < newArr.length; i++) {
	            if (i == index) {
	                newArr[i] = element; // Insert the new element at the specified index
	            } else {
	                newArr[i] = arr[j++]; // Copy the next element from the original array
	            }
	        }
	        
	        return newArr;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int element = 99;
	        int index = 2;
	        
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        
	        int[] newArr = insertElement(arr, element, index);
	        
	        System.out.println("Array after inserting " + element + " at index " + index + ": " + Arrays.toString(newArr));
	    }
	}

