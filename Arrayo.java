package com.one.core.Assignmentthree;


	import java.util.Arrays;

	public class Arrayo {
	    public static void main(String[] args) {
	        int[] arr = {12, 5, 7, 3, 9, 2, 15};
	        int[] results = findThirdLargestAndSecondSmallest(arr);
	        System.out.println("Third largest element: " + results[0]);
	        System.out.println("Second smallest element: " + results[1]);
	    }

	    public static int[] findThirdLargestAndSecondSmallest(int[] arr) {
	        
	        Arrays.sort(arr);

	        
	        int thirdLargest = arr[arr.length - 3];

	        
	        int secondSmallest = arr[1];

	        return new int[]{thirdLargest, secondSmallest};
	    }
	}


