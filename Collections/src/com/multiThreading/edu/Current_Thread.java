package com.multiThreading.edu;

public class Current_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Let us find the current Thread");
		Thread thread = Thread.currentThread();
		System.out.println("Current Thread= "+thread);
		System.out.println("Its name = " +thread.getName());
	}

}
