package com.arrays.edu;

import java.util.*;
public class Arrays_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3,4,2,1,5};
		System.out.println("int array elements: " + Arrays.toString(intArray));
		 
		/*
		 * To sort an int array in ascending order, use the
		 * sort method of the Arrays class
		 */
		Arrays.sort(intArray);
		//Arrays.sort(intArray, 1,4);
		 
		System.out.println("sorted int array elements: " + Arrays.toString(intArray));
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
	}

}
