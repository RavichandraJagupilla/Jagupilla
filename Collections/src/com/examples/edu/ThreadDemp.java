package com.examples.edu;

import java.io.IOException;

class MyThread extends Thread
{
	// this code only it get executed
	boolean stop= false;
	public void run()
	
	{
		for(int i=0;i<1000000;i++)
		{
			System.out.println(i);
			if(stop)
				return; // come out of run
		}
		
		
	}
}
public class ThreadDemp {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// Need to create an object to my Thread class
		MyThread thread = new MyThread();
		
		// Thread class object and attach to our MyThread class.
		Thread t= new Thread(thread);
		// will execute the code in run.
		t.start();
		System.in.read();
		thread.stop=true;

	}

}
