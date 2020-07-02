package com.examples.edu;


class MyThread1 extends Thread
{
	public void run()
	{
		task1();
		task2();
		task3();
	}

	 void task3() {
		// TODO Auto-generated method stub
		System.out.println("Task 3");
	}

	 void task2() {
		// TODO Auto-generated method stub
		System.out.println("Task 2");
	}

	 void task1() {
		// TODO Auto-generated method stub
		 System.out.println("Task 1");
	}
	
}
public class Single_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 thread1= new MyThread1();
		//Runnable target;
		Thread t= new Thread(thread1);

		t.start();
	}

}
