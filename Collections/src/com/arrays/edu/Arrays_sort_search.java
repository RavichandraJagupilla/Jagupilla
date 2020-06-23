package com.arrays.edu;

import java.io.*;
import java.util.*;


public class Arrays_sort_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// create an array;
		int arr[]= new int[5];
		// store elements in array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the integer");
			arr[i]=scanner.nextInt();
		}
		//display the arr[] contents
		System.out.println("Contents of the array");
		display(arr);
		// display sorted content
		Arrays.sort(arr);
		System.out.println("\nSorted Content");
		display(arr);
		
		Arrays.sort(arr);
		// Now search for an element
		System.out.println("\nEnter the element to search");
		int element=scanner.nextInt();
		int index=Arrays.binarySearch(arr,element);
		if(index<0)
			System.out.println("\nElement no found"+index);
		else 
			System.out.println("\nElement found in location:"+index);

	}
	
	
	static void display(int arr[]){
		
		for(int i:arr)
		{
			System.out.print(i+ "\t");
			
		}
		
		
	}
}
