package com.collections.edu;

import java.util.*;
public class HashMap_Replace {
	public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("Original HashMap: " + numbers);

        // Using replace()
        numbers.replace("Second", 22);
        numbers.replace("Third", 3, 33);
       // numbers.replace("Fourth", 5);
        System.out.println("HashMap using replace(): " + numbers);

        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("HashMap using replaceAll(): " + numbers);
    }
}
