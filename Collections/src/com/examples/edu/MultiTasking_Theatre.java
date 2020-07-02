package com.examples.edu;

class MyThread2 implements Runnable
{

	String str;
	 MyThread2(String str) {
		// 
		 this.str= str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(str +" :"+i);
			try{
				Thread.sleep(2000);// stop thread exectuion for 2 sec
			}
			catch (InterruptedException ie) {
				
				ie.printStackTrace();
				// TODO: handle exception
			}
		}
		
	}
	
}
public class MultiTasking_Theatre {

	public static void main(String[] args) {
		
MyThread2 myThread2 = new MyThread2("Cut the ticket");
MyThread2 myThread22= new MyThread2("Show the seat");
		
		
		Thread t1= new Thread(myThread2);
		Thread t2= new Thread(myThread22);
		t1.start();
		t2.start();
	}

}
