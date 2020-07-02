package com.examples.edu;


class Reserve implements Runnable{
// berths available 1
	int available=1;
	int wanted;
	// constructor
	 Reserve( int i) {
		wanted=i;
	}
	@Override
	public synchronized void run() {
		
			
		
		//display how many berths are available
		System.out.println("Available berths ="+available);
		//check avaliability is more than wanted
		if(available>=wanted)
		{
			//get the passenger name
			String name=Thread.currentThread().getName();
			// allot the berth.
			System.out.println(wanted + "berth is allotted for "+name);
			try{
				Thread.sleep(1500);//wait to print the ticket.
				available= available-wanted;
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else
			System.out.println("Sorry no berths are available");
		
	}
	
}

public class Mutli_Thread_on_single_Object {

	public static void main(String[] args) {
		// // one berth is needed
		Reserve reserve = new Reserve(1); 
		//attach the first thread to object
		
		Thread t1= new Thread(reserve);
		//attach the second thread to object
		
		Thread t2= new Thread(reserve);
		t1.setName("First Person");
		t2.setName("Second Person");
				
		
		t1.start();
		t2.start();

	}

}
