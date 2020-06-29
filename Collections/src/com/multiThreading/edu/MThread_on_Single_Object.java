package com.multiThreading.edu;


class Reserve implements Runnable
{
//available berth are 1;
	int available=1;
	int wanted;
	
	public Reserve(int i) {
		// TODO Auto-generated constructor stub
		wanted=i;
	}
	@Override
	public synchronized void run() {
		//synchronized (this) {
			
		
		// display available berths.
		System.out.println("available berths are" +available);
		
		if(available>=wanted)
		{
			//get the name of passenger
			String name= Thread.currentThread().getName();
			//allot berth to him
			System.out.println(wanted +" Berths reserverd for"+name);
			try{
				Thread.sleep(1500);// wait for printing the ticket.
				available= available- wanted;
				
			}catch (InterruptedException ie) {
				ie.printStackTrace();
				// TODO: handle exception
			}
		}
		else {
			System.out.println("Sorry, No berths available");
		}
		//
		}
	}
	
//}
public class MThread_on_Single_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// passing the wanted berths
    Reserve reserve= new Reserve(1);
    
    
	Thread t1= new Thread(reserve);
	Thread t2= new Thread(reserve);
	t1.setName("First Person");
	t2.setName("Second Person");
	t1.start();
	t2.start();
	}

}
