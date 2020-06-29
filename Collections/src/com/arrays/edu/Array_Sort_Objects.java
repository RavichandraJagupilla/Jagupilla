package com.arrays.edu;

import java.util.*;



class Student2 {
	private int id;
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	private String name;
	private float marks;
	
	public Student2(int id, String name, float marks){
	this.id=id;
	this.name=name;
	this.marks=marks;
	}
	 //for printing purpose
    public String toString(){
        return "(" + getId() + " => " + getName() +" => "+getMarks()+ ")";
    }
	
	
}
class studentcomparator1 implements Comparator<Student2>
{

	@Override
//	public int compare(Student2 o1, Student2 o2) {
//		Integer i1 = Integer.valueOf(o1.getId());
//		Integer i2=Integer.valueOf(o2.getId());
//		return i1.compareTo(i2);
//	}
	public int compare(Student2 o1, Student2 o2) {
		Float i1 = Float.valueOf(o1.getMarks());
		Float i2=Float.valueOf(o2.getMarks());
		
		
		return i1.compareTo(i2);
	}
	
}
public class Array_Sort_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2[] studentArray = new Student2[5];
        studentArray[0] = new Student2(308, "Ravi",85.5f);
        studentArray[1] = new Student2(101, "chandra",89.9f);
        studentArray[2] = new Student2(503, "Jani",98.6f);
        studentArray[3] = new Student2(255, "Raju",99.9f);
        studentArray[4] = new Student2(422, "Ramesh",89.f);
        
        Arrays.sort(studentArray, new studentcomparator1());
        
        System.out.println(Arrays.toString(studentArray));
	}

}
