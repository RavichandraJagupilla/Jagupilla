package com.examples.edu;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Ascend implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

class Decend implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
public class Arrays_Sort_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		// to accept values from keyboard
	Scanner scanner = new Scanner(System.in);
	System.out.println(" how many elements to add");
		int size= scanner.nextInt();
		
		Integer arr[] = new Integer[size];
		// passing the values into arrays
		for(int i =0;i<size;i++)
		{
			System.out.println("Enter the int values :");
			arr[i]=scanner.nextInt();
		}
		//sort the array;
		
		System.out.println("\nBefore Sorting");
		display(arr);
		
		Arrays.sort(arr, new Ascend());
		System.out.println("\nAfter Ascending sorting");
		display(arr);
		System.out.println("\nAfter Deceding sorting");
		Arrays.sort(arr, new Decend());
		display(arr);

	}

	 static void display(Integer[] arr) {
		// TODO Auto-generated method stub
		 for(Integer i:arr)
		 {
			 System.out.print(i+"\t");
		 }
		
	}
	

}

