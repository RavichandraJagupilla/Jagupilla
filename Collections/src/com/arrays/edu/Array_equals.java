package com.arrays.edu;

import java.util.*;
public class Array_equals {
	
	    public static void main(String[] args)  
	    { 
	        // Let us create different integers arrays 
	        int[] arr1 ={1, 2, 3, 4}; 
	        int[] arr2 = {1, 2, 3, 4}; 
	        int[] arr3 = {1, 2, 4, 3}; 
	          
	        System.out.println("is arr1 equals to arr2 : " + 
	                                Arrays.equals(arr1, arr2)); 
	        System.out.println("is arr1 equals to arr3 : " + 
	                                Arrays.equals(arr1, arr3)); 
	    } 
}
