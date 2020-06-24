package com.arrays.edu;
import java.util.*;
public class Array_fill {

	public static void main(String[] args) {
		
	    { 
	  
	        // Get the Arrays 
	        int intArr[] = { 10, 20, 15, 22, 35 }; 
	  
	        int intKey = 22; 
	  
	        Arrays.fill(intArr, 0,1,intKey); 
	  
	        // To fill the arrays 
	        System.out.println("Integer Array on filling: "
	                           + Arrays.toString(intArr)); 
	       // System.out.println(intArr);
	        
	        for(int i =0;i<intArr.length;i++)
	        {
	        	System.out.println(intArr[i]);
	        }
	    } 

	}

}
