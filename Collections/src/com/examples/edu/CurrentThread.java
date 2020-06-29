package com.examples.edu;

public class CurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Let us find the current thread");
		Thread thread = Thread.currentThread();
		
		System.out.println("Current threads ="+thread);
		System.out.println("Thread name:"+thread.getName());
		System.out.println("Thread name:"+thread.getThreadGroup());
		
	}

}
