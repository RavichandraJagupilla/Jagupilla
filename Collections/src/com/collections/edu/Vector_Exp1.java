package com.collections.edu;
import java.util.*;
public class Vector_Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> mammals= new Vector<>();

	        // Using the add() method
	        mammals.add("Dog");
	        mammals.add("Horse");

	        // Using index number
	        mammals.add(2, "Cat");
	        System.out.println("Vector: " + mammals);

	        // Using addAll()
	        Vector<String> animals = new Vector<>();
	        animals.add("Crocodile");

	        animals.addAll(mammals);
	        System.out.println("New Vector: " + animals);
	    }
	
	}


