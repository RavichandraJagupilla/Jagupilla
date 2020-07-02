package com.multiThreading.edu;

import java.io.IOException;

class MyThread extends Thread{
	
	boolean stop= false;
		public void run() {
			for(int i =1;i<100;i++)
			{
				System.out.println(i);
				if(stop)
					return;
			}
			
		}
	}

public class ThreadDemo1 {

	public static void main(String[] args) 
			throws IOException{
		// TODO Auto-generated method stub
		
		MyThread myThread = new MyThread();
		Runnable target;
		Thread t= new Thread(myThread);
		System.out.println("is thread alive :"+t.isAlive());
		t.start();
		System.out.println("is thread after alive :"+t.isAlive());
		System.in.read();
		myThread.stop=true;

	}

}
