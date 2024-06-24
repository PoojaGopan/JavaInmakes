package com.one.core.Assignmentthree;


	import java.util.Scanner;

	public class Arrayt {
	    public static int binarySearch(int[] arr, int key) {
	        int low = 0;
	        int high = arr.length - 1;
	        
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            
	            if (arr[mid] == key)
	                return mid;
	            else if (arr[mid] < key)
	                low = mid + 1;
	            else
	                high = mid - 1;
	        }
	        
	        return -1; // If element not found
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
	        int key;
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number to search: ");
	        key = scanner.nextInt();
	        
	        int index = binarySearch(arr, key);
	        if (index != -1)
	            System.out.println("Element found at index: " + index);
	        else
	            System.out.println("Element not found");
	        
	        scanner.close();
	    }
	}


