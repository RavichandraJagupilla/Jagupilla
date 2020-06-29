package com.multiThreading.edu;


class MyThread1 extends Thread{
	
	public void  run() {
		
		// executes the task one by one
		task1();
		task2();
		task3();
		
	}

	 void task3() {
		// TODO Auto-generated method stub
		System.out.println("This is Task 3");
	}

	 void task2() {
		// TODO Auto-generated method stub
		 System.out.println("This is Task 2");
	}

	 void task1() {
		// TODO Auto-generated method stub
		 System.out.println("This is Task 1");
	}
}
public class Single_Tasking {

	public static void main(String[] args) {
		// create an object.
		MyThread1 thread = new MyThread1();
		
		
		Thread t= new Thread(thread);
		t.start();

	}

}
