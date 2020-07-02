package com.examples.edu;



class Producer extends Thread
{
	StringBuffer sb;
	
	//boolean dataprodover=false;

Producer()
{
	sb = new StringBuffer();// allot memory
}

public void run()
{
	//go and append the data(number) to string buffer
	synchronized (sb) {
		
	
	for(int i =1;i<10;i++)
	{
		try{
			sb.append(i + ":");
			Thread.sleep(10);
			System.out.println("appending "+i);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
	}sb.notify();
	//dataprodover=true;
}
}
}
class Consumer extends Thread
{
	//create producer reference to refer Producer object from consumer class.
	Producer prod;
	public Consumer(Producer prod) {
		this.prod= prod;
	}
	public void run()
	{
		//if production is not over, sleep for 10 ms and check again.
		// here there is a time delay of several millisec to receive data.
		synchronized (prod.sb) {
			
		
		try{
			prod.sb.wait();
//			while (!prod.dataprodover) {
//				Thread.sleep(10);
			//}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}// the content of string buffer when production is over.
		System.out.println(prod.sb);
	}
}
}

public class Thread_Communication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);
		//Runnable target;
		Thread t1 = new Thread(producer);
		Thread t2= new Thread(consumer);
		
		t2.start();// consumer thread wait.
		t1.start();//producer thread

	}

}
