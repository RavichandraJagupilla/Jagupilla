package com.arrays.edu;

import java.util.*;


// Ascending order
 class Ascend implements Comparator<Integer>
{
	
	@Override
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2);
	}
	
}
// decending order
class Decend implements Comparator<Integer>
{
@Override
public int compare(Integer i1, Integer i2) {
	return i2.compareTo(i1);
	}
	
}

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// create an array;
		Integer arr[]= new Integer[5];
		// store elements in array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the integer");
			arr[i]=scanner.nextInt();
		}
		//display the arr[] contents
		System.out.println("\nContents of the array");
		display(arr);
		System.out.println("\nContents of the array in AScending order");
		Arrays.sort(arr, new Ascend());
		display(arr);
		System.out.println("\nContents of the array in Decending order");
Arrays.sort(arr, new Decend());
	display(arr);
		
				
	}
	
	


static void display(Integer arr[])
{
	
	for(int i:arr)
	{
		System.out.print(i+ "\t");
		
	}
	
}
}

