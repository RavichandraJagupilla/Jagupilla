package com.arrays.edu;

import java.util.*;
class Student{
    
    private int id;
    private String name;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    //for printing purpose
    public String toString(){
        return "(" + getId() + " => " + getName() + ")";
    }
 
}
 
//this comparator will sort Student objects in ascending order or id
class StudentComparator implements Comparator<Student>{
 	

    public int compare(Student s1, Student s2) {
    	
        return (s1.getId()-s2.getId());
    }    
}
 

        
public class Array_sort_studentid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] studentArray = new Student[5];
        studentArray[0] = new Student(308, "Jack");
        studentArray[1] = new Student(101, "Ryan");
        studentArray[2] = new Student(503, "Jay");
        studentArray[3] = new Student(255, "Adam");
        studentArray[4] = new Student(4, "Mike");
        
       // Arrays.sort(studentArray);
        System.out.println("object array before sorting: ");
        System.out.println( Arrays.toString(studentArray) ); 
 
        /*
         * To sort partial object array using the comparator, use the
         * sort method and specify an array to sort, start index, end index
         * and a comparator object
         */
        Arrays.sort(studentArray, new StudentComparator());
        System.out.println("object array after partial sorting: ");
        System.out.println( Arrays.toString(studentArray) ); 
    }

	}


