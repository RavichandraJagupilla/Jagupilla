package com.multiThreading.edu;



class Reservation extends Thread{
	
	public void run()
	{
		System.out.println("I am in reservation thread");
	}
}
class Cancellation extends Thread{	
	public void run()
	{
		System.out.println("I am in Cancellation thread");
	}
}


public class ThreadGroup1 {


	public static void main(String[] args) throws Exception
	 {
		// TODO Auto-generated method stub
Reservation res = new Reservation();
Cancellation can= new Cancellation();
// create a Thread Group

ThreadGroup tg= new ThreadGroup("First Group");

// create two threads and add them to First Group.

Thread t1= new Thread(tg, res,"First Thread");
Thread t2= new Thread(tg, res,"Second Thread");

// create another thread group g1 as a child to tg.
ThreadGroup tg1= new ThreadGroup(tg, "Second Group" );
// create two threads and add them to second Group.

Thread t3= new Thread(tg, can,"Third Thread");
Thread t4= new Thread(tg, can,"Fourth Thread");
// find the parent group of tg1
System.out.println("Parent of tg1="+tg1.getParent());
//set Maximum priority:
tg1.setMaxPriority(7);

//know the thread group of t1 and t3;
System.out.println("Thread Group of t1"+t1.getThreadGroup());
System.out.println("Thread Group of t3"+t3.getThreadGroup());
//start the threads:
t1.start();
t2.start();
t3.start();
t4.start();

// find how many threads are actively running
System.out.println("No of active thread in tg :"+tg.activeCount());


	}

}
