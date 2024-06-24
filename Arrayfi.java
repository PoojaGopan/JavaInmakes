package com.one.core.Assignmentthree;



	import java.util.Arrays;
	import java.util.HashSet;

	public class Arrayfi {
	    public static void main(String[] args) {
	        int[] array = {4, 5, 9, 1, 2, 2, 4, 6, 5};
	        System.out.println("Original Array: " + Arrays.toString(array));

	        int[] resultArray = removeDuplicates(array);
	        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
	    }

	    public static int[] removeDuplicates(int[] array) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int value : array) {
	            set.add(value);
	        }

	        int[] resultArray = new int[set.size()];
	        int index = 0;
	        for (int value : set) {
	            resultArray[index++] = value;
	        }

	        return resultArray;
	    }
	}


