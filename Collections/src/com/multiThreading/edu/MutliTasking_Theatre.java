package com.multiThreading.edu;


class MyThread2 implements Runnable
{
String str;
public MyThread2(String str) {
	this.str=str;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1;i<=10;i++){
			System.out.println(str+" : "+i);
			try{
				Thread.sleep(1000);// stop execution for 2000 milliseconds
				
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
			
	}
	
}
public class MutliTasking_Theatre {

	public static void main(String[] args) {
		// create two objects to represents two tasks.
		MyThread2 thread2 = new MyThread2("Cut the ticket");
		MyThread2 thread3 = new MyThread2("show the seat");
		
		// create two threads and attach the objects
		
		Thread t1= new Thread(thread2);
		Thread t2= new Thread(thread3);

		t1.start();
		t2.start();
	}

}
