package com.collections.edu;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Take a vector to store the Integers.
		Vector<Integer> v = new Vector<>();
		//take an int type array
		int arr[]={10,20,30,40,50,60};
		
		// when arr[i] is stored into vector v. arr[i] 
		//Autoboxing will happen and it converts the int into wapper object.
		
		for(int i=0;i<arr.length;i++)
		{
			v.add(arr[i]);
		}
		// retreiving the data using get method
		
		for(int i =0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println(v);
		// by using ListIterator
		
		//Retrieve using ListIterator:
		System.out.println("using ListIterator");
		
	ListIterator lit= v.listIterator();
	System.out.println("Printing in forward direction");
	while (lit.hasNext())
	{
		
		System.out.print(lit.next() + "\t");
		
		
	}
	System.out.println("\nPrinting in reverse direction");
	while (lit.hasPrevious())
	{
		
		System.out.print(lit.previous() + "\t");
		
		
	}
	}

}
