package com.multiThreading.edu;

public class Thread_priority_check extends Thread {

	

		 public void run() {

		   String tName = Thread.currentThread().getName();
		   Integer tPrio = Thread.currentThread().getPriority();
			 
		   System.out.println(tName + " has priority " + tPrio);
		 }

		 public static void main(String[] args) 
		                      throws InterruptedException {

			 Thread_priority_check t0 = new Thread_priority_check();
			 Thread_priority_check t1 = new Thread_priority_check();
			 Thread_priority_check t2 = new Thread_priority_check();

		   t1.setPriority(Thread.MAX_PRIORITY);	
		   t0.setPriority(Thread.MIN_PRIORITY);	
		   t2.setPriority(Thread.NORM_PRIORITY);	
		  
		   t0.start();
		   t1.start();
		   t2.start();
		   
		 }
		}