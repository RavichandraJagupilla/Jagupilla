package com.arrays.edu;

import java.util.*;
public class Array_Equals_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Student1 [] arr1 = {new Student1(111, "bbbb", "london"), 
		                           new Student1(131, "aaaa", "nyc"), 
		                           new Student1(121, "cccc", "jaipur")}; 
		          
		        Student1 [] arr2 = {new Student1(111, "bbbb", "london"), 
		                           new Student1(131, "aaaa", "nyc"), 
		                           new Student1(121, "cccc", "jaipur")}; 
		          
		        Student1 [] arr3 = {new Student1(111, "bbbb", "london"), 
		                           new Student1(121, "dddd", "jaipur"), 
		                           new Student1(131, "aaaa", "nyc"), 
		                           }; 
		          
		        System.out.println("is arr1 equals to arr2 : " + 
		                                    Arrays.equals(arr1, arr2)); 
		        System.out.println("is arr1 equals to arr3 : " + 
		                                    Arrays.equals(arr1, arr3));     
		    }     
		} 
		   
		// A class to represent a student. 
		class Student1 
		{ 
		    int rollno; 
		    String name, address; 
		   
		    // Constructor 
		    public Student1(int rollno, String name, 
		                               String address) 
		    { 
		        this.rollno = rollno; 
		        this.name = name; 
		        this.address = address; 
		    } 
		      
		    @Override
		    public boolean equals(Object obj) { 
		          
		        // typecast obj to Student so that we can compare students 
		        Student1 s = (Student1) obj; 
		          
		        return this.rollno == s.rollno && this.name.equals(s.name) 
		                                && this.address.equals(s.address); 
		    } 
	}


