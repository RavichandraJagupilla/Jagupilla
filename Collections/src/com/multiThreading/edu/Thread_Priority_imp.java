package com.multiThreading.edu;


class MyThred extends Thread{
	
	int count=0;
	
	public void run()
	{
		for(int i =1;i<=1000;i++)
			count++;
		//displaying which thread has completed counting and its priority
		System.out.println("Completed Thread :"+ Thread.currentThread().getName());
		System.out.println("Its Priority :"+ Thread.currentThread().getPriority());
	}
}
public class Thread_Priority_imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThred myThred= new MyThred();
		
		Thread t1= new Thread(myThred, "one");
		Thread t2= new Thread(myThred, "Two");
		
		t2.setPriority(1);
		
		t1.start();
		t2.start();
	}

}
