package com.one.core.Assignmentone;


	import java.util.Scanner;

	public class Leapyear {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the year:");
	        int year = scanner.nextInt();
	        
	        if(isLeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }
	    
	    public static boolean isLeapYear(int year) {
	        
	        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	    }
	}


