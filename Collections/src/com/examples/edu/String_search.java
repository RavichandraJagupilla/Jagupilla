package com.examples.edu;

public class String_search {

	
	    public static void main(String[] args) {
	        String haystack = "Kodejava - Learn Java by Examples";

	        // Checks to see if the word "Java" is found in the haystack
	        // variable.
	        String needle = "JAVA";
	        if (haystack.indexOf(needle) != -1) {
	            System.out.println("Found the word " + needle +
	                    " at index number " + haystack.indexOf(needle));
	        } else {
	            System.out.println("Can't find " + needle);
	        }
	        
	        if(haystack.contains(needle))
	        {
	        	System.out.println("Its found");
	        }
	        else
	        	System.out.println("Not Founed");
	        

	    }
}
