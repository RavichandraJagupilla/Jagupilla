package com.examples.edu;


import java.util.*;
class Comparator1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2)
	{
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

public class Collection_sorting {
	
	public static void main(String[] args) 
    { 
        // Create a list of strings 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(400); 
        al.add(300); 
        al.add(200); 
        al.add(900); 
        al.add(567); 
  
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        //Collections.sort(al, Collections.reverseOrder());
        
        
        Collections.sort(al, new Comparator1()); 
  
        // Let us print the sorted list 
        System.out.println("List after the use of" + 
                           " Collection.sort() :\n" + al); 
    } 
} 


