package com.examples.edu;

import java.util.Arrays;
import java.util.Comparator;


class Student
{
	int id;
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
	String name;
	float marks;
	
	public Student(int id, String name, float marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	 //for printing purpose
    public String toString(){
        return "(" + getId() + " => " + getName() +" => "+getMarks()+ ")";
    }
}

class StudentComp implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
//		Integer i1= Integer.valueOf(o1.getId());
//		Integer i2= Integer.valueOf(o2.getId());
//		
//		Float f1=Float.valueOf(o1.getMarks());
//		Float f2=Float.valueOf(o2.getMarks());
		if((o1.getId()%100)>(o2.getId()%100))
		{
			return 1;
		}
		else
			
		return -1;
	}
	
}
public class Arrays_Sort_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] studentArray = new Student[5];
        studentArray[0] = new Student(308, "Ravi",85.5f);
        studentArray[1] = new Student(101, "chandra",89.9f);
        studentArray[2] = new Student(503, "Jani",98.6f);
        studentArray[3] = new Student(255, "Raju",99.9f);
        studentArray[4] = new Student(422, "Ramesh",89.f);
        
        System.out.println(Arrays.toString(studentArray));
		Arrays.sort(studentArray, new StudentComp());
		System.out.println(Arrays.toString(studentArray));
		

	}

}
