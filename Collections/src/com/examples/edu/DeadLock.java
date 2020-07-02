package com.examples.edu;

class BookTicket extends Thread
{
	Object train,comp;
	public BookTicket(Object train, Object comp) {
		
		this.comp=comp;
		this.train=train;
	}
	public void run()
	{
		synchronized (train) {
			System.out.println("BookTicket locked in train");
			try{
				Thread.sleep(150);
			}catch (InterruptedException e) {}
				
				System.out.println("BookTicket now waiting to lock on comaprtment");;
				synchronized (comp) {
					System.out.println("BookTicket locked on compartment");
					
				}
			}
			
		}
	}

class CancelTicket extends Thread
{
	Object train,comp;
	public CancelTicket(Object train, Object comp) {
		
		this.comp=comp;
		this.train=train;
	}
	public void run()
	{
		synchronized (comp) {
			System.out.println("CancelTicket locked in Compartment");
			try{
				Thread.sleep(150);
			}catch (InterruptedException e) {}
				
				System.out.println("CancelTicket now waiting to lock on Train");;
				synchronized (train) {
					System.out.println("CancelTicket locked on Train");
					
				}
			}
			
		}
	}
public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object train= new Object();
		Object compartment= new Object();
		
		BookTicket bo= new BookTicket(train, compartment);
		CancelTicket ct= new CancelTicket(train, compartment);
		
		
		Thread t1= new Thread(bo);
		Thread t2= new Thread(ct);
		t1.start();
		t2.start();

	}

}
