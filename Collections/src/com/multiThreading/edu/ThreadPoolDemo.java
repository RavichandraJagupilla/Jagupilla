package com.multiThreading.edu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;
class Tasks implements Runnable
{
	private int taskno;
	
	
	 Tasks(int taskno) {
		// TODO Auto-generated constructor stub
		 this.taskno=taskno;
	}
	 public void run()
	 {
		 for(int i =0;i<=100;i+=25)
		 {
			 //find the current thread running name
			 String name= Thread.currentThread().getName();
			 //display the rhead ame that is performing the task
			 System.out.println(name+"completed task "+taskno + " by" + i+ "percentage.");
			 try{
				 Thread.sleep(3000);// this task takes 3 seconds
			 }catch (Exception e) {
				 e.printStackTrace();
				// TODO: handle exception
			}
		 }
	 }
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		//fixed thread pool is created with 2 threads
		ExecutorService eService= Executors.newFixedThreadPool(2);
		/*number of tasks are 4
		 * create tasks type array with size 4
		 * t[0] to t[3]
		 */
		Tasks t[]= new Tasks[6];
		// execute the 4 tasks
		for(int i =0; i<6;i++)
		{
			//attach task to the array reference.
			t[i]= new Tasks(i);
			//execute the task shown by array reference
			eService.execute(t[i]);
		}
		
		// close the old taks and dont accept new tasks
eService.shutdown();
	}

}
