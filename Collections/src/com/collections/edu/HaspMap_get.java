package com.collections.edu;

import java.util.*;
public class HaspMap_get {
	public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault()
       int value2 = numbers.getOrDefault("Five", 5);
       System.out.println("Returned Number: " + value2);
       System.out.println("HashMap: " + numbers);
//        int value3 = numbers.getOrDefault("Two", 5);
//        System.out.println("Returned Number: " + value3);
    }
}


