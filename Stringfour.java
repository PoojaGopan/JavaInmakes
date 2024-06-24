package com.one.core.Assignmenttwo;



	import java.util.HashMap;
	import java.util.Map;

	public class Stringfour {
	    public static void main(String[] args) {
	        String inputString = "hello world";
	        printRepeatedCharacters(inputString);
	    }

	    public static void printRepeatedCharacters(String str) {
	        
	        Map<Character, Integer> charCountMap = new HashMap<>();

	       
	        str = str.toLowerCase();

	        
	        for (char c : str.toCharArray()) {
	        
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	      
	        System.out.println("Repeated characters:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
	            }
	        }
	    }
	}

